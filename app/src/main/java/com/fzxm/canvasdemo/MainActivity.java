package com.fzxm.canvasdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void circle(View v){
        startActivity(new Intent(this,CircleActivity.class));
    }
    public void rect(View v){
        startActivity(new Intent(this,RectActivity.class));
    }
    public void roundRect(View v){
        startActivity(new Intent(this,RoundRectActivity.class));
    }
    public void arc(View v){startActivity(new Intent(this,ArcActivity.class));}
    public void oval(View v){
        startActivity(new Intent(this,OvalActivity.class));
    }
    public void text(View v){
        startActivity(new Intent(this,TextActivity.class));
    }
    public void point(View v){
        startActivity(new Intent(this,PointActivity.class));
    }
    public void line(View v){
        startActivity(new Intent(this,LineActivity.class));
    }
    public void path(View v){
        startActivity(new Intent(this,PathActivity.class));
    }
    public void bitmap(View v){
        startActivity(new Intent(this,BitmapActivity.class));
    }
    public void shader(View v){
        startActivity(new Intent(this,ShaderActivity.class));
    }
}
