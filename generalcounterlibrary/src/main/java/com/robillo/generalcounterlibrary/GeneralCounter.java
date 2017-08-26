package com.robillo.generalcounterlibrary;

import android.content.Context;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by robinkamboj on 26/08/17.
 */

public class GeneralCounter extends View implements CounterInterface{

    public GeneralCounter(Context context) {
        super(context);
    }

    public GeneralCounter(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public GeneralCounter(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public GeneralCounter(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public void reset() {

    }

    @Override
    public void increment() {

    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public void setCount(int count) {

    }

    @Override
    public void decrement() {

    }
}
