package com.example.jbt.services1;

import android.app.IntentService;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.util.Log;
import android.widget.Toast;


//extending from IntentService allows service to run on different thread
public class MyIntentService extends IntentService {


    public MyIntentService() {
        super("MyIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {


        String message= intent.getStringExtra("message");//String passed from MainActivity
        int num= intent.getIntExtra("count",-1);//int passed from MainActivity


     Toast.makeText(this, "started service", Toast.LENGTH_SHORT).show();


        for (int i = 0; i < 100; i++) {

            num=num+1;
            Log.d("data",message );
            Log.d("data",""+num );


            //will stop main thread every one second (1000 millis)
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }


}
