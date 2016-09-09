package cn.edu.bistu.cs.se.graphic;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by lsy on 2016/9/8.
 */
public class CustomView extends View {


    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //设置画布背景色
        canvas.drawColor(Color.GRAY);

        //生成画笔
        Paint paint=new Paint();


        //绘制矩形，内部不填充
        paint.setAntiAlias(true); //抗锯齿
        paint.setColor(Color.RED);//画笔颜色
        paint.setStyle(Paint.Style.STROKE);//设置填充类型
        paint.setStrokeWidth(5);//设置画笔宽度
        canvas.drawOval(5, 5, 100, 100, paint);

        //绘制三角形，内部填充
        Path path=new Path();
        path.moveTo(10, 120);
        path.lineTo(200, 120);
        path.lineTo(200, 220);
        path.lineTo(10,220);
        path.close();
        paint.setColor(Color.YELLOW);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawPath(path, paint);

        //绘制文本
        paint.setTextSize(20);
        paint.setColor(Color.BLUE);
        paint.setStrikeThruText(true);
        canvas.drawText("hello world", 10, 200, paint);

        Path pathText=new Path();
        pathText.moveTo(120,300);
        pathText.lineTo(10,480);
        pathText.lineTo(220,480);
        pathText.addPath(pathText);
        paint.setColor(Color.GREEN);
        canvas.drawTextOnPath("Start Android Studio Select menu Tools > Android > SDK Manager  Click SDK Tools tab",pathText,0,10,paint);

    }
}


