package com.robillo.generalcounterexamples;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;

import com.robillo.generalcounterlibrary.GeneralCounter;

public class OneActivity extends FragmentActivity {

    //OneActivity onCreate

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        (findViewById(R.id.increment)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((GeneralCounter) findViewById(R.id.general_counter)).increment();
            }
        });

        (findViewById(R.id.decrement)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((GeneralCounter) findViewById(R.id.general_counter)).decrement();
            }
        });
    }
}
