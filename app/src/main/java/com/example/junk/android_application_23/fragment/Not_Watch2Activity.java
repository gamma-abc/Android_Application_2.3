package com.example.junk.android_application_23.fragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.junk.android_application_23.R;

public class Not_Watch2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_not__watch2);

        /**
         * 返回
         */
        Button not_watch_back = (Button)findViewById(R.id.not_watch_back);
        not_watch_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
