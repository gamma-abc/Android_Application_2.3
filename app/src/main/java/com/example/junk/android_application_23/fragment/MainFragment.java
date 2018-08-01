package com.example.junk.android_application_23.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import com.example.junk.android_application_23.JobSearchActivity;
import com.example.junk.android_application_23.R;

/**
 * Created by Junk on 2018/7/26.
 */

public class MainFragment extends Fragment{
    private EditText mEdit_job_search;
    private ImageButton imageButton_image_first;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main,container,false);

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
         mEdit_job_search= (EditText) getActivity().findViewById(R.id.search_edittext);
        setListeners();     //获取到ID后调用下面的方法
    }

    /**
     * 该方法用于设置监听器
     */
    private void setListeners(){
        OnClick onclick =new OnClick();    //OnClick
        /**
         * 首页头部Edittixt输入框设置监听事件，
         * setFocustable设置为取消Edit聚焦
         */
        mEdit_job_search.setFocusable(false);
        mEdit_job_search.setOnClickListener(onclick);

    }

    /**
     * 该类用于实现OnClickListener接口
     */
    private class OnClick implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Intent intent=null;     //初始化Intent
            switch (v.getId()){
                case R.id.search_edittext:
                    /**
                     * 跳转到职位搜索页面
                     */
                    intent=new Intent(getActivity(),JobSearchActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }
}
