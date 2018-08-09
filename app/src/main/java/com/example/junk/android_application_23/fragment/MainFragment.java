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
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.junk.android_application_23.IWangtRecuritSelectTypeActivity;
import com.example.junk.android_application_23.JobDetailActivity;
import com.example.junk.android_application_23.JobSearchActivity;
import com.example.junk.android_application_23.MainActivity;
import com.example.junk.android_application_23.R;

/**
 * Created by Junk on 2018/7/26.
 */

public class MainFragment extends Fragment{
    private EditText mEdit_job_search;
    private Button mbtn_jobsearch,mbtn_i_wang_recruit;
    private View my_work1,home;
    private ImageButton imageButton_image_first;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main,container,false);

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
//        头部搜索框获取ID
         mEdit_job_search= (EditText) getActivity().findViewById(R.id.search_edittext);
//        我要招聘按钮获取ID
        mbtn_jobsearch= (Button) getActivity().findViewById(R.id.button_JobSearch);
//        我要招聘按钮获取ID
        mbtn_i_wang_recruit= (Button) getActivity().findViewById(R.id.i_want_recruit_button);
//        LinearLayout获取ID
        setListeners();     //获取到ID后调用下面的方法

         home=getActivity().findViewById(R.id.text_flag);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"hello",Toast.LENGTH_SHORT).show();
            }
        });
        my_work1=getActivity().findViewById(R.id.work_1);
        my_work1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getActivity(), JobDetailActivity.class);
                startActivity(intent);
            }
        });



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
        /**
         * 我要找工作按钮跳转
         */
        mbtn_jobsearch.setOnClickListener(onclick);
        /**
         * 我要招聘按钮跳转
         */
        mbtn_i_wang_recruit.setOnClickListener(onclick);

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
                     * 首页头部搜索栏点击跳转到职位搜索页面
                     */
                    intent=new Intent(getActivity(),JobSearchActivity.class);
                    break;
                case R.id.button_JobSearch:
                    /**
                     * 首页我要找工作搜索按钮跳转到搜索职位页
                     */
                    intent=new Intent(getActivity(),JobSearchActivity.class);
                    break;
                case R.id.i_want_recruit_button:
                    /**
                     * 首页我要招聘按钮跳转
                     */
                    intent=new Intent(getActivity(), IWangtRecuritSelectTypeActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }
}
