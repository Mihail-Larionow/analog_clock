package com.example.analog_clock.fragments;

import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import com.example.analog_clock.R;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;

public class SecondFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

}