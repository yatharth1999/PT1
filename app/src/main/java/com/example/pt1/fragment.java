package com.example.pt1;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class fragment extends Fragment{

    public fragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static fragment newInstance() {
        fragment fragment = new fragment();
        return fragment;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.d("myfrag","onAttach function called");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("myfrag","onCreate function called");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.d("myfrag","onCreateView function called");
        View v = inflater.inflate(R.layout.fragment_fragment, container, false);
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("myfrag","onActivityCreated function called");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("myfrag","onStart function called");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("myfrag","onResume function called");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("myfrag","onPause function called");
    }



    @Override
    public void onStop() {
        super.onStop();
        Log.d("myfrag","onStop function called");
    }



    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("myfrag","onDestoryView function called");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("myfrag","onDestory function called");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("myfrag","onDetach function called");
    }

}

