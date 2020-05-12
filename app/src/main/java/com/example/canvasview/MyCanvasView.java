package com.example.canvasview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;

public class MyCanvasView extends View {

    public MyCanvasView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);

        //rectangle
        canvas.drawRGB(33,33,33);
        canvas.drawRoundRect(new RectF(200,200,350,350), 0, 0, new Paint(Paint.ANTI_ALIAS_FLAG));

        //triangle
        Path path = new Path();
        path.moveTo(400,10);
        path.lineTo(600,60);
        path.lineTo(500,900);
        Paint p = new Paint(Paint.ANTI_ALIAS_FLAG);
        p.setStyle(Paint.Style.FILL);
        p.setColor(Color.BLUE);
        canvas.drawPath(path,p);

        //circle
        path.reset();
        path.addCircle(100,500,50, Path.Direction.CW);
        p.setColor(Color.LTGRAY);
        canvas.drawPath(path,p);

        //text
        p.setColor(Color.GRAY);
        p.setTextSize(90);
        canvas.drawText("First task is done", 350, 1500, p);
    }

}
