package com.robillo.generalcounterexamples;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;

public class TwoActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        (findViewById(R.id.start)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        (findViewById(R.id.reset)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
