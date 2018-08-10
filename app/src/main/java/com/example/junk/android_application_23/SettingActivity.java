package com.example.junk.android_application_23;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.junk.android_application_23.function.SetLanguageActivity;

public class SettingActivity extends AppCompatActivity {
    private Button mbtn_setting_language;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        mbtn_setting_language= (Button) findViewById(R.id.btn_open_setting);
        mbtn_setting_language.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SettingActivity.this, SetLanguageActivity.class);
                startActivity(intent);
            }
        });

        /**
         * 返回
         */
        Button setting_back = (Button)findViewById(R.id.setting_back);
        setting_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
