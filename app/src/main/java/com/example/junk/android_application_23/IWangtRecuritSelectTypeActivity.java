package com.example.junk.android_application_23;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class IWangtRecuritSelectTypeActivity extends AppCompatActivity {

    private Button i_want_recruit_parttime_job_button,i_want_recruit_full_job_button;
    private Button find_home_back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iwangt_recurit_select_type);

        /**
         * 全职招聘跳转
         */
        i_want_recruit_full_job_button = (Button)findViewById(R.id.i_want_recruit_full_job_button);
        i_want_recruit_full_job_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IWangtRecuritSelectTypeActivity.this,ReleaseRecruitmentInformentActivity.class);
                startActivity(intent);
            }
        });

        /**
         * 返回
         */
        find_home_back = (Button)findViewById(R.id.find_home_back);
        find_home_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }



}
