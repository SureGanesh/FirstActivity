package com.example.kvana.myfirstproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public void onStart(){
        super.onStart();
        Log.v(TAG, "onStart: ");
    }
    @Override
    public void onResume(){
        super.onResume();
        Log.e(TAG, "onResume: ");
                
    }
    @Override
    public void onPause(){
        super.onPause();
        Log.i(TAG, "onPause: ");
    }
    @Override
    public void onStop(){
        super.onStop();
        Log.d(TAG, "onStop: ");
    }
    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }
}

