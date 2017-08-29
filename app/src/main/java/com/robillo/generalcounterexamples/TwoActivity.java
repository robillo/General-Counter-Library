package com.robillo.generalcounterexamples;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;

import com.robillo.generalcounterlibrary.GeneralCounter;

import java.util.Timer;
import java.util.TimerTask;

public class TwoActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        (findViewById(R.id.start)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Timer timer = new Timer();
                timer.scheduleAtFixedRate(new TimerTask() {
                    @Override
                    public void run() {
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                ((GeneralCounter) findViewById(R.id.general_counter)).increment();
                            }
                        });
                    }
                }, 1000, 1000);
                (findViewById(R.id.start)).setClickable(false);
            }
        });

        (findViewById(R.id.reset)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((GeneralCounter) findViewById(R.id.general_counter)).reset();
            }
        });
    }
}
