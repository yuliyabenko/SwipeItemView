package com.yuliya.swipeitemview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;

import com.yuliya.library.View.SwipeItemView;

public class MainActivity extends AppCompatActivity {

    private SwipeItemView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view = (SwipeItemView) findViewById(R.id.custom_view);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        view.dispatchTouchEvent(event);
        return super.onTouchEvent(event);
    }
}
