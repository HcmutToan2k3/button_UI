package com.example.farmiot;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.angads25.toggle.widget.LabeledSwitch;

public class MainActivity extends AppCompatActivity {
    LabeledSwitch btn_dd1, btn_dd2, btn_dd3, btn_mt1, btn_mt2, btn_mt3, btn_mb1, btn_mb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}