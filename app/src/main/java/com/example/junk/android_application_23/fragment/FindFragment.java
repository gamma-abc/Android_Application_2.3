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

import com.example.junk.android_application_23.MainActivity;
import com.example.junk.android_application_23.R;
import com.example.junk.android_application_23.WhoSeeMeActivity;

/**
 * Created by Junk on 2018/7/26.
 */

public class FindFragment extends Fragment {
    private Button mbtnfind;


    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_find,container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Button button_job_collect =(Button) getActivity().findViewById(R.id.job_collect_button);
        button_job_collect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), JobCollectActivity.class);
                startActivity(intent);
            }
        });
    }
}
