package com.example.fragmentnavigation25022020;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class LogoutFragment extends Fragment {

    View mView;
    Button mBtnLogout;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        mView = inflater.inflate(R.layout.fragment_logout, container, false);
        mBtnLogout = mView.findViewById(R.id.buttonLogout);

        mBtnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment
                        .findNavController(LogoutFragment.this)
                        .popBackStack();
            }
        });

        return mView;
    }
}