package cn.studyjams.s1.sj50.wendi.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import cn.studyjams.s1.sj50.wendi.R;

/**
 * Created by windog on 2016/4/25.
 */
public class FirstActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_activity);
        this.setTitle("生平简介");

    }
}
