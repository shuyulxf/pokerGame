package com.example.nativetest;

import androidx.appcompat.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    private int getScreenSize () {
        DisplayMetrics metrics = new DisplayMetrics();
        return 0;
    }
}
