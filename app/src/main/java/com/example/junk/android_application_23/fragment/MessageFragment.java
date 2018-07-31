package com.example.junk.android_application_23.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.junk.android_application_23.MainActivity;
import com.example.junk.android_application_23.R;
import com.example.junk.android_application_23.WhoSeeMeActivity;

/**
 * Created by Junk on 2018/7/26.
 */

public class MessageFragment extends Fragment {
    @Nullable
    //    声明fragment_message布局文件的textview
    private Button mBtnMessage;
    private LinearLayout mWhoSeeMe;     //声明Linearyout
    private TextView mTextView;
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_message,container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        /**
         *为按钮添加点击事件
         */
//        找到这个控件
        Button button =(Button) getActivity().findViewById(R.id.job_collect_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), WhoSeeMeActivity.class);
                startActivity(intent);
            }
        });
    }

}
