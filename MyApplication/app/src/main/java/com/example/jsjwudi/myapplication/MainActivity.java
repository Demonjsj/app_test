package com.example.jsjwudi.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Test test = Test.getInstance();
        test.setDownloadListener(new Test.DownloadListener() {
            @Override
            public void download() {

            }

            @Override
            public void dasd() {

            }
        });

    }
}
