package com.example.junk.android_application_23.fragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.junk.android_application_23.R;

public class HrLetterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hr_letter);

        /**
         * 返回
         */
        Button hr_letter_back = (Button)findViewById(R.id.hr_letter_back);
        hr_letter_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
