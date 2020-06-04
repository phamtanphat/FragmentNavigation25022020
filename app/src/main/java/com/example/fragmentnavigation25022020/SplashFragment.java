package com.example.fragmentnavigation25022020;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.navigation.NavigationView;

public class SplashFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                Navigation.findNavController(getActivity(),R.id.action_splashFragment_to_loginFragment);
//            }
//        },2000);
        return inflater.inflate(R.layout.fragment_splash, container, false);
    }
}