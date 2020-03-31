package com.aaa.oldlake;


import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Three_level extends AppCompatActivity {
    TwoTable twoTable = new TwoTable();


    public TextView textView0;
    public TextView textView1;
    public TextView textView2;
    public TextView textView3;
    public TextView textView4;
    public TextView yesTwoLine;//textView onClick yes
    public TextView noTwoLine; //textView onClick no
    public TextView textView6;
    public ImageView imageView7;
    public TextView textView8;
    public TextView textView9;
    public ImageView imageView10;
    public TextView textView11;
    public TextView textView12;
    public TextView textView13;
    public TextView next_btn_two;// textView onClick next level
    public Animation a;
    public int line = -1;
    public int counterSecondLine = 0;
    public int secondYes = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.three_level);

    }
}



