package com.robillo.generalcounterlibrary;

/**
 * Created by robinkamboj on 26/08/17.
 */

public interface CounterInterface {
    void reset();
    void increment();
    int getCount();
    void setCount(int count);
    void decrement();
}
