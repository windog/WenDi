package cn.studyjams.s1.sj50.wendi.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import cn.studyjams.s1.sj50.wendi.R;

/**
 * Created by windog on 2016/4/25.
 * 继承 AppCompatActivity 才能保证有标题栏，高版本的兼容问题。
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        Button shengpingBtn = (Button) findViewById(R.id.shengping_btn);
        Button yishu = (Button) findViewById(R.id.yishu_btn);
        Button junshi = (Button) findViewById(R.id.junshi_btn);
        Button aiguo = (Button) findViewById(R.id.aiguo_btn);
        Button mingzuo = (Button) findViewById(R.id.mingzuo_btn);

        shengpingBtn.setOnClickListener(this);
        yishu.setOnClickListener(this);
        junshi.setOnClickListener(this);
        aiguo.setOnClickListener(this);
        mingzuo.setOnClickListener(this);
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.shengping_btn:
                Intent intent1 = new Intent(MainActivity.this, FirstActivity.class);
                startActivity(intent1);
                break;
            case R.id.yishu_btn:
                Intent intent2 = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent2);
                break;
            case R.id.junshi_btn:
                Intent intent3 = new Intent(MainActivity.this, ThirdActivty.class);
                startActivity(intent3);
                break;
            case R.id.aiguo_btn:
                Intent intent4 = new Intent(MainActivity.this, FourthActivity.class);
                startActivity(intent4);
                break;
            case R.id.mingzuo_btn:
                Intent intent5 = new Intent(MainActivity.this, FifthActivity.class);
                startActivity(intent5);
                break;
        }
    }
}
