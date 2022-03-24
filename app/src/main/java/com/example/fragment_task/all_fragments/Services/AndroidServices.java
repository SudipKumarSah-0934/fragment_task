package com.example.fragment_task.all_fragments.Services;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.example.fragment_task.R;

public class AndroidServices extends Fragment {
    Button startBGBtn, stopBGBtn, startFGBtn;

    public AndroidServices() {
        // Required empty public constructor
    }

    public static AndroidServices newInstance() {
        AndroidServices fragment = new AndroidServices();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_android_services, container, false);
        triggerService(view);
        return view;
    }
    public void triggerService(View view){
        startBGBtn = view.findViewById(R.id.startBG);
        stopBGBtn = view.findViewById(R.id.stopBG);
        startFGBtn = view.findViewById(R.id.startFG);
        startBGBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(String.valueOf(getActivity()), "onClick: @@@@@@@@@@@@@@");
                Intent serviceIntent = new Intent(getActivity(), MYBGService.class);
                getActivity().startService(serviceIntent);
            }
        });
        stopBGBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().stopService(new Intent(getActivity(),MYBGService.class));
            }
        });
        startFGBtn.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View view) {
                getActivity().startForegroundService(new Intent(getActivity(), MYFGService.class));
            }
        });
    }

}