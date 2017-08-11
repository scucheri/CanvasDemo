package com.fzxm.canvasdemo.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ComposeShader;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;

import com.fzxm.canvasdemo.R;

/**
 * Created by zxm on 2017/7/12 0012.
 * url: https://developer.android.com/reference/android/graphics/Canvas.html
 */

public class ShaderView extends View {
    public ShaderView(Context context) {
        super(context);
    }

    public ShaderView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ShaderView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int w = getWidth();
        int h = getHeight();
        Paint paint = new Paint();
        //抗锯齿
        paint.setAntiAlias(true);
        int radius = w <= h ? w/2 : h/2;
        /*Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.jks);
        BitmapShader shader = new BitmapShader(bitmap, Shader.TileMode.CLAMP,Shader.TileMode.CLAMP);
        paint.setShader(shader);
        canvas.drawRect(0,0,width,height,paint);*/

        /*Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.cat);
        BitmapShader shader = new BitmapShader(bitmap, Shader.TileMode.REPEAT,Shader.TileMode.REPEAT);
        paint.setShader(shader);
        canvas.drawRect(0,0,width,height,paint);*/

       /*Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.cat);
        BitmapShader shader = new BitmapShader(bitmap, Shader.TileMode.MIRROR,Shader.TileMode.MIRROR);
        paint.setShader(shader);
        canvas.drawRect(0,0,width,height,paint);*/

        //图片渲染器
       /* Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.cat);
        BitmapShader shader = new BitmapShader(bitmap, Shader.TileMode.REPEAT,Shader.TileMode.REPEAT);
        paint.setShader(shader);
        canvas.drawCircle(w/2,h/2,radius,paint);*/

        //线性渐变渲染器
       /* LinearGradient shader = new LinearGradient(0,0,w,0, new int[]{Color.parseColor("#faf84d"),Color.parseColor("#003449"),
                Color.parseColor("#cc423c")},new float[]{0.0f,0.6f,0.8f}, Shader.TileMode.CLAMP);
        paint.setShader(shader);
        canvas.drawRect(0,0,,h/2,paint);*/

        //环形渲染器
       /* RadialGradient shader = new RadialGradient(w/2,h/2,w/2,new int[]{Color.parseColor("#00aa00"),Color.parseColor("#880033"),
                Color.parseColor("#F8795A"),
                Color.parseColor("#CC423C")},new float[]{0.0f,0.2f,0.8f,1.0f}, Shader.TileMode.CLAMP);
        paint.setShader(shader);
        canvas.drawRect(0,0,w,h,paint);*/

        //梯度渐变渲染器
        /*SweepGradient shader = new SweepGradient(w/2,h/2,new int[]{Color.RED,Color.CYAN,Color.YELLOW,
                Color.GREEN,Color.MAGENTA,Color.BLUE},new float[]{0.0f,0.2f,0.3f,0.4f,0.8f,1.0f});
        paint.setShader(shader);
        canvas.drawRect(0,0,w,h,paint);*/

        //组合渲染器
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.jks);

        BitmapShader bitmapShader = new BitmapShader(bitmap,Shader.TileMode.MIRROR,Shader.TileMode.MIRROR);

        RadialGradient radialShader = new RadialGradient(radius,radius,radius,Color.BLACK,Color.TRANSPARENT, Shader.TileMode.CLAMP);

        ComposeShader composeShader = new ComposeShader(bitmapShader,radialShader,new PorterDuffXfermode(PorterDuff.Mode.DST_IN));

        paint.setShader(composeShader);

        canvas.drawCircle(w/2,h/2,radius,paint);


    }
}
