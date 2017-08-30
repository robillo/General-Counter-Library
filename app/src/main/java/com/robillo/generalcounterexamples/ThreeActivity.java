package com.robillo.generalcounterexamples;

import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.robillo.generalcounterlibrary.GeneralCounter;

import java.util.Timer;
import java.util.TimerTask;

public class ThreeActivity extends FragmentActivity {

    int max;
    boolean isZeroPlus = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);


        (findViewById(R.id.countdown)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((GeneralCounter) findViewById(R.id.general_counter)).setMaxCount(Integer.valueOf(((EditText) findViewById(R.id.edit_text)).getText().toString()));
                Timer timer = new Timer();
                timer.scheduleAtFixedRate(new TimerTask() {
                    @Override
                    public void run() {
                        ((GeneralCounter) findViewById(R.id.general_counter)).decrement();
                    }
                }, 1000, 1000);
            }
        });
    }
}
