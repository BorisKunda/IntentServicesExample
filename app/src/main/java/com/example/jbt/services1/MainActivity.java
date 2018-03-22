package com.example.jbt.services1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

//NOTES:

//Remember service needs to be declared in AndroidManifest.xml
//" android:exported = "  in manifest -> The purpose of the "exported" is to let other apps have access to a service.
//A service is only started once, no matter how often you call the startService() method


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent= new Intent(this, MyIntentService.class);
        intent.putExtra("message", "start service!!!");
        intent.putExtra("count",  406);//406 is just random number we chose to begin count up

        startService(intent);
        finish();//IMMEDIATELY CLOSES ACTIVITY SO  THERE WILL BE NO VISIBLE CLUE THAT THERE SERVICE RUNS IN BACKGROUND


        //stopService(new Intent(this, MyIntentService.class));// -> STOPS SERVICE


    }
}
