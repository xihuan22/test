package com.my.views;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Button;

/**
 * Created by xihuan22 on 2016/10/26.
 */
public class TouchView extends Button {
    public TouchView(Context context)
    {
        super(context);
    }
    public TouchView(Context context, AttributeSet attrs)
    {
        super(context, attrs);
    }
    public TouchView(Context context, AttributeSet attrs, int defStyle)
    {
        super(context, attrs, defStyle);
    }
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.i("TAG", "TouchView onTouchEvent ACTION_DOWN");
                          return false;
          //     break;
            case MotionEvent.ACTION_MOVE:
                Log.i("TAG", "TouchView onTouchEvent ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.i("TAG", "TouchView onTouchEvent ACTION_UP");
                break;
            default:
                break;
        }
//        Log.i("TAG", "TouchView onTouchEvent default return" + super.onTouchEvent(event));
        return super.onTouchEvent(event);
    }
}
