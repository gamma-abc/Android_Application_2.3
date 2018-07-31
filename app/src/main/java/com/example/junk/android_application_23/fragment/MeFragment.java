package com.example.junk.android_application_23.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.junk.android_application_23.App_record_textActivity;
import com.example.junk.android_application_23.HelpActivity;
import com.example.junk.android_application_23.Job_CollectionActivity;
import com.example.junk.android_application_23.R;
import com.example.junk.android_application_23.SalaryActivity;
import com.example.junk.android_application_23.SettingActivity;
import com.example.junk.android_application_23.VipActivity;

/**
 * Created by Junk on 2018/7/26.
 */

public class MeFragment extends Fragment{
    @Nullable

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_me,container,false);
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        /**
         * 职位收藏
         */
        Button job_collect_text = (Button)getActivity().findViewById(R.id.job_collect_text);
        job_collect_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Job_CollectionActivity.class);
                startActivity(intent);
            }
        });
        /**
         * 申请记录
         */
        Button apply_record_text = (Button)getActivity().findViewById(R.id.apply_record_text);
        apply_record_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), App_record_textActivity.class);
                startActivity(intent);
            }
        });
        /**
         * 不让该公司看我简历
         */
        Button not_watch_text = (Button)getActivity().findViewById(R.id.not_watch_text);
        not_watch_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Not_Watch2Activity.class);
                startActivity(intent);
            }
        });

        /**
         * 增值服务
         */
        Button me_three_vip_text = (Button)getActivity().findViewById(R.id.me_three_vip_text);
        me_three_vip_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), VipActivity.class);
                startActivity(intent);
            }
        });


        /**
         * 薪酬查询
         */
        Button me_three_salary_search_text = (Button)getActivity().findViewById(R.id.me_three_salary_search_text);
        me_three_salary_search_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SalaryActivity.class);
                startActivity(intent);
            }
        });


        /**
         * 用户反馈和帮助
         */
        Button me_four_help_text = (Button)getActivity().findViewById(R.id.me_four_help_text);
        me_four_help_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), HelpActivity.class);
                startActivity(intent);
            }
        });


        /**
         * 设置
         */
        Button me_four_setting_text = (Button)getActivity().findViewById(R.id.me_four_setting_text);
        me_four_setting_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SettingActivity.class);
                startActivity(intent);
            }
        });

    }
}
