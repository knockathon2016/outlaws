package com.juster.custom;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.Scroller;

/**
 * Created by deepakj on 1/7/16.
 */

public class ScrollerSpeed extends Scroller {

    private int mDuration = 1000;

    public ScrollerSpeed(Context context) {
        super(context);
    }

    public ScrollerSpeed(Context context, Interpolator interpolator) {
        super(context, interpolator);
    }

    public ScrollerSpeed(Context context, Interpolator interpolator, boolean flywheel) {
        super(context, interpolator, flywheel);
    }

    @Override
    public void startScroll(int startX, int startY, int dx, int dy, int duration) {
        // Ignore received duration, use fixed one instead
        super.startScroll(startX, startY, dx, dy, mDuration);
    }

    @Override
    public void startScroll(int startX, int startY, int dx, int dy) {
        // Ignore received duration, use fixed one instead
        super.startScroll(startX, startY, dx, dy, mDuration);
    }
}
