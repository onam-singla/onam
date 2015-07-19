package com.example.onam.divyahimgiri;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by onam on 2/21/2015.
 */
public class splash extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash1);

        final Thread timer = new Thread() {
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {

                } finally {
                    Intent os = new Intent(splash.this, MainActivity.class);
                    startActivity(os);
                    finish();
                }


            }

        };
        timer.start();


    }
}
