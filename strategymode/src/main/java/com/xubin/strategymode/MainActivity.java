package com.xubin.strategymode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.xubin.strategymode.duck.RedHeadDuck;
import com.xubin.strategymode.quack.MuteQuack;

/**
 * test activity
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        redHeadDuck.performFly();
        redHeadDuck.performQuack();
    }
}
