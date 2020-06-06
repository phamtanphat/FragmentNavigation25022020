package com.example.fragmentnavigation25022020;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;

public class SplashFragment extends Fragment {

    TextView mTvTitle;
    View mView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        mView = inflater.inflate(R.layout.fragment_splash, container, false);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //Cach 1
                NavHostFragment
                        .findNavController(SplashFragment.this)
                        .navigate(R.id.action_splashFragment_to_loginFragment);
            }
        }, 2000);

        // Cach 2
//        Navigation
//                .findNavController(getActivity(), R.id.navigationHost)
//                .navigate(R.id.action_splashFragment_to_loginFragment);
        return mView;
    }
}