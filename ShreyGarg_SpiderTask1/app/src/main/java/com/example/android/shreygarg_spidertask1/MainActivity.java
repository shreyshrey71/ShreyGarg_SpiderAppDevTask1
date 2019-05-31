package com.example.android.shreygarg_spidertask1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int[] a={0,0,0,0,0};

    public void grav(View view)
    {
     Random r = new Random();
     int j= r.nextInt(5);

        TextView[] t = new TextView[5];

        t[0] = (TextView) findViewById(R.id.circle1);
        t[1] = (TextView) findViewById(R.id.circle2);
        t[2] = (TextView) findViewById(R.id.circle3);
        t[3] = (TextView) findViewById(R.id.circle4);
        t[4] = (TextView) findViewById(R.id.circle5);

        if((++a[j])%2!=0) {
            t[j].animate().translationY(view.getHeight()-150);
            t[j].animate().setDuration(1500);
        }
        else
        {
            t[j].animate().translationY(0);
            t[j].animate().setDuration(1500);
        }
    }
}
