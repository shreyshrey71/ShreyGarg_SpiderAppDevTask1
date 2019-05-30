package com.example.android.shreygarg_spidertask1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
int i=0;
    public void grav(View view)
    {i++;
        RelativeLayout r = (RelativeLayout) findViewById(R.id.lay);
        TextView t = (TextView) findViewById(R.id.circle);
        if(i%2!=0) {
            t.animate().translationY(r.getHeight()-150);
            t.animate().setDuration(2000);
        }
        else
        {
            t.animate().translationY(0);
            t.animate().setDuration(2000);
        }
    }
}
