package com.example.mbrecka.recyclertest;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class FooRecyclerView extends RecyclerView {

    public FooRecyclerView(Context context) {
        super(context);
    }

    public FooRecyclerView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public FooRecyclerView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

//    @Override
//    public boolean onTouchEvent(MotionEvent e) {
//        return false;
//    }
}
