package com.cml.cmlinterview;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;

/**
 * author : cml on 2017/12/4
 * github : https://github.com/cmlgithub
 */

public class MyImageView extends AppCompatImageView {
    public MyImageView(Context context) {
        super(context);
    }

    public MyImageView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyImageView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private boolean isDispatchMove;
    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.e("CML","dispatchTouchEvent:Down");
                break;
            case MotionEvent.ACTION_MOVE:
                if(!isDispatchMove){
                    isDispatchMove = true;
                    Log.e("CML","dispatchTouchEvent:Move");
                }
                break;
            case MotionEvent.ACTION_UP:
                Log.e("CML","dispatchTouchEvent:Up");
                break;
        }
        return super.dispatchTouchEvent(event);
    }
    private boolean isTouchMove;
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.e("CML","onTouchEvent:Down");
                break;
            case MotionEvent.ACTION_MOVE:
                if(!isTouchMove){
                    isTouchMove = true;
                    Log.e("CML","onTouchEvent:Move");
                }
                break;
            case MotionEvent.ACTION_UP:
                Log.e("CML","onTouchEvent:Up");
                break;
        }
        return super.onTouchEvent(event);
    }
}
