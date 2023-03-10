package com.example.analog_clock;

import android.graphics.Canvas;
import android.content.res.Resources;

public class ClockHandSecond extends AbstractClockHand {

    public ClockHandSecond(Resources res, int clockHand){
        super(res, clockHand);
    }

    //Overriden method showTime
    @Override
    public void showTime(Canvas canvas, int centerX, int centerY, int seconds, int milliSeconds){
        canvas.save();
        canvas.rotate(6*seconds, centerX, centerY);

        imageClockHand.setBounds(centerX - (MAX_IMAGE_WIDTH/2), centerY - (MAX_IMAGE_HEIGHT/2),
                centerX + (MAX_IMAGE_WIDTH/2), centerY + (MAX_IMAGE_HEIGHT/2));
        imageClockHand.draw(canvas);

        canvas.restore();
    }
}
