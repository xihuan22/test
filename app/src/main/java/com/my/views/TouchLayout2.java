package com.my.views;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/**
 * Created by xihuan22 on 2016/10/26.
 */
public class TouchLayout2 extends FrameLayout {
    public TouchLayout2(Context context)
    {
        super(context);
    }
    public TouchLayout2(Context context, AttributeSet attrs)
    {
        super(context, attrs);
    }
    public TouchLayout2(Context context, AttributeSet attrs, int defStyle)
    {
        super(context, attrs, defStyle);
    }
    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.i("TAG", "TouchLayout2 onInterceptTouchEvent ACTION_DOWN");
                return true;

            case MotionEvent.ACTION_MOVE:
                Log.i("TAG", "TouchLayout2 onInterceptTouchEvent ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.i("TAG", "TouchLayout2 onInterceptTouchEvent ACTION_UP");
                break;
            default:
                break;
        }
//        Log.i("TAG", "TouchLayout2 onInterceptTouchEvent default return" + super.onInterceptTouchEvent(event));
        return super.onInterceptTouchEvent(event);
    }
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.i("TAG", "TouchLayout2 onTouchEvent ACTION_DOWN");
                return true;
            case MotionEvent.ACTION_MOVE:
                Log.i("TAG", "TouchLayout2 onTouchEvent ACTION_MOVE");
                return true;
            case MotionEvent.ACTION_UP:
                Log.i("TAG", "TouchLayout2 onTouchEvent ACTION_UP");
                break;
            default:
                break;
        }
//        Log.i("TAG", "TouchLayout2 onTouchEvent default return" + super.onTouchEvent(event));
        return super.onTouchEvent(event);
    }
}
