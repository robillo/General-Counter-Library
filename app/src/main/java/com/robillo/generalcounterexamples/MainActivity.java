package com.robillo.generalcounterexamples;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends FragmentActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        (findViewById(R.id.one)).setOnClickListener(this);
        (findViewById(R.id.two)).setOnClickListener(this);
        (findViewById(R.id.three)).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.one:{
                startActivity(new Intent(this, OneActivity.class));
                break;
            }
            case R.id.two:{
                startActivity(new Intent(this, TwoActivity.class));
                break;
            }
            case R.id.three:{
                startActivity(new Intent(this, ThreeActivity.class));
                break;
            }
        }
    }
}