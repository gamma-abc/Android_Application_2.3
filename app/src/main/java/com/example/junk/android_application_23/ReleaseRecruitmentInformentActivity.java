package com.example.junk.android_application_23;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ReleaseRecruitmentInformentActivity extends AppCompatActivity {

    private Button release_recruitment_iforment_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_release_recruitment_informent);

        /**
         * 返回
         */
        release_recruitment_iforment_back = (Button)findViewById(R.id.release_recruitment_iforment_back);
        release_recruitment_iforment_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
