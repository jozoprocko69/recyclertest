package com.example.mbrecka.recyclertest;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
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

    @Override
    protected void onMeasure(int widthSpec, int heightSpec) {
        Log.d("matej", "RECYCLER onMeasure() called with: widthSpec = [" + widthSpec + "], heightSpec = [" + heightSpec + "]");
        super.onMeasure(widthSpec, heightSpec);
    }

    //    @Override
//    public boolean dispatchTouchEvent(final MotionEvent ev) {
//        Log.d("matej", "dispatchTouchEvent() called with: ev = [" + ev + "]");
//
////        if (ev.getAction() != MotionEvent.ACTION_UP) {
//        final Rect rect = new Rect();
//        for (int i = 0; i < getChildCount(); i++) {
//            getChildAt(i).getHitRect(rect);
//
//            if (rect.contains((int) ev.getX(), (int) ev.getY())) {
//                return super.dispatchTouchEvent(ev);
//            }
//        }
////        }
//        return false;
//    }

    //    @Override
//    public boolean onTouchEvent(MotionEvent e) {
//        return false;
//    }
}
