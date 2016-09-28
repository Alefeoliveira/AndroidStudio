package com.example.internacionalizacaoo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        // Get a string resource from your app's Resources
        String hello = getResources().getString(R.string.hello_world);




    }
}
