package com.my.views;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/**
 * Created by xihuan22 on 2016/10/26.
 */
public class TouchLayout1 extends FrameLayout {
    public TouchLayout1(Context context)
    {
        super(context);
    }
    public TouchLayout1(Context context, AttributeSet attrs)
    {
        super(context, attrs);
    }
    public TouchLayout1(Context context, AttributeSet attrs, int defStyle)
    {
        super(context, attrs, defStyle);
    }
    /**
     * onInterceptTouchEvent中按下时的x坐标
     */
    private float interceptTouchEventDownX=0;
    /**
     * onInterceptTouchEvent中按下时的y坐标
     */
    private float interceptTouchEventDownY=0;
    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                interceptTouchEventDownX=event.getRawX();
                interceptTouchEventDownY=event.getRawY();
                Log.i("TAG", "TouchLayout1 onInterceptTouchEvent ACTION_DOWN");
                // return true;
           break;
            case MotionEvent.ACTION_MOVE:
                Log.i("TAG", "TouchLayout1 onInterceptTouchEvent ACTION_MOVE");
                int moveX = (int) ( event.getRawX() - interceptTouchEventDownX);
                int moveY = (int) ( event.getRawY() - interceptTouchEventDownY);
                    if(moveY<=0||Math.abs(moveY)<=Math.abs(moveX)){
                        System.out.println("moveY"+moveY+"moveX"+moveX);
                        return false;
                    }else{
                        return true;//符合下拉刷新条件，把事件交给onTouchEvent处理
                    }
            case MotionEvent.ACTION_UP:
                Log.i("TAG", "TouchLayout1 onInterceptTouchEvent ACTION_UP");
                break;
            default:
                break;
        }
//        Log.i("TAG", "TouchLayout1 onInterceptTouchEvent default return" + super.onInterceptTouchEvent(event));
        return super.onInterceptTouchEvent(event);
    }
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.i("TAG", "TouchLayout1 onTouchEvent ACTION_DOWN");
             break;
            case MotionEvent.ACTION_MOVE:
                Log.i("TAG", "TouchLayout1 onTouchEvent ACTION_MOVE");
                return false;
            case MotionEvent.ACTION_UP:
                Log.i("TAG", "TouchLayout1 onTouchEvent ACTION_UP");
                break;
            default:
                break;
        }
//        Log.i("TAG", "TouchLayout1 onTouchEvent default return" + super.onTouchEvent(event));
        return super.onTouchEvent(event);
    }
}
