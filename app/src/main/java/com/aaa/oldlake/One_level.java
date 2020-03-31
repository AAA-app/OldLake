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

public class One_level extends AppCompatActivity {

    OneTable oneTable = new OneTable();
    Delay delay = new Delay();
    public Animation a;
    public TextView textView1;
    public TextView textView2;
    public ImageView onPlane3;
    public TextView textView4;
    public TextView textView5;
    public TextView textView6;
    public TextView textView7;
    public TextView textView8;
    public TextView textView9;
    public TextView textView10;
    public TextView textView11;
    public TextView textView12;
    public TextView textView13;
    public TextView textView14;
    public TextView textView15;
    public TextView textView16;
    public TextView textView17;
    public TextView textView18;
    public TextView textView19;
    public TextView textView20;
    public TextView textView21;
    public TextView textView22;
    public TextView textView23;
    public TextView textView24;
    public TextView textView25;
    public TextView next_btn_one;


    public int line = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.one_level);

        final TextView textView1 = findViewById(R.id.textView1o);
        final TextView textView2 = findViewById(R.id.textView2o);
        final ImageView onePlane3 = findViewById(R.id.onePlane3o);
        final TextView textView4 = findViewById(R.id.textView4o);
        final TextView textView5 = findViewById(R.id.textView5o);
        final TextView textView6 = findViewById(R.id.textView6o);
        final TextView textView7 = findViewById(R.id.textView7o);
        final TextView textView8 = findViewById(R.id.textView8o);
        final TextView textView9 = findViewById(R.id.textView9o);
        final TextView textView10 = findViewById(R.id.textView10o);
        final TextView textView11 = findViewById(R.id.textView11o);
        final TextView textView12 = findViewById(R.id.textView12o);
        final TextView textView13 = findViewById(R.id.textView13o);
        final TextView textView14 = findViewById(R.id.textView14o);
        final TextView textView15 = findViewById(R.id.textView15o);
        final TextView textView16 = findViewById(R.id.textView16o);
        final TextView textView17 = findViewById(R.id.textView17o);
        final TextView textView18 = findViewById(R.id.textView18o);
        final TextView textView19 = findViewById(R.id.textView19o);
        final TextView textView20 = findViewById(R.id.textView20o);
        final TextView textView21 = findViewById(R.id.textView21o);
        final TextView textView22 = findViewById(R.id.textView22o);
        final TextView textView23 = findViewById(R.id.textView23o);
        final TextView textView24 = findViewById(R.id.textView24o);
        final TextView textView25 = findViewById(R.id.textView25o);
        final TextView next_btn_one = findViewById(R.id.next_btn_one);

        textView1.setText(oneTable.oneScenario_en[0]);
        textView2.setText(oneTable.oneScenario_en[1]);
        textView4.setText(oneTable.oneScenario_en[3]);
        //code inVisible
        textView1.setVisibility(View.INVISIBLE);
        textView2.setVisibility(View.INVISIBLE);
        onePlane3.setVisibility(View.INVISIBLE);
        textView4.setVisibility(View.INVISIBLE);
        textView5.setVisibility(View.INVISIBLE);
        textView6.setVisibility(View.INVISIBLE);
        textView7.setVisibility(View.INVISIBLE);
        textView8.setVisibility(View.INVISIBLE);
        textView9.setVisibility(View.INVISIBLE);
        textView10.setVisibility(View.INVISIBLE);
        textView11.setVisibility(View.INVISIBLE);
        textView12.setVisibility(View.INVISIBLE);
        textView13.setVisibility(View.INVISIBLE);
        textView14.setVisibility(View.INVISIBLE);
        textView15.setVisibility(View.INVISIBLE);
        textView16.setVisibility(View.INVISIBLE);
        textView17.setVisibility(View.INVISIBLE);
        textView18.setVisibility(View.INVISIBLE);
        textView19.setVisibility(View.INVISIBLE);
        textView20.setVisibility(View.INVISIBLE);
        textView21.setVisibility(View.INVISIBLE);
        textView22.setVisibility(View.INVISIBLE);
        textView23.setVisibility(View.INVISIBLE);
        textView24.setVisibility(View.INVISIBLE);
        textView25.setVisibility(View.INVISIBLE);
        next_btn_one.setVisibility(View.INVISIBLE);

        //command start asyTask
        delay.execute();
    }
    //command clause to game
    @Override
    public void onBackPressed() {
        delay.cancel(true);
        delay = null;
        try {
            Intent intent = new Intent(One_level.this, StartActivity.class); startActivity(intent); finish();
        } catch (Exception e) {
            e.printStackTrace();
        }
        finish();
    }

    //asyncTask
    class Delay extends AsyncTask <Void, Integer, Void> {

        @Override
        protected Void doInBackground(Void... params) {
            while (line <= 25) {
                publishProgress(line ++);
                try {
                    Thread.sleep(35);
                    if (isCancelled()) return null;
                } catch (Exception e) { }
            }
            return null;
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
            final TextView textView1 = findViewById(R.id.textView1o);
            final TextView textView2 = findViewById(R.id.textView2o);
            final ImageView onePlane3 = findViewById(R.id.onePlane3o);
            final TextView textView4 = findViewById(R.id.textView4o);
            final TextView textView5 = findViewById(R.id.textView5o);
            final TextView textView6 = findViewById(R.id.textView6o);
            final TextView textView7 = findViewById(R.id.textView7o);
            final TextView textView8 = findViewById(R.id.textView8o);
            final TextView textView9 = findViewById(R.id.textView9o);
            final TextView textView10 = findViewById(R.id.textView10o);
            final TextView textView11 = findViewById(R.id.textView11o);
            final TextView textView12 = findViewById(R.id.textView12o);
            final TextView textView13 = findViewById(R.id.textView13o);
            final TextView textView14 = findViewById(R.id.textView14o);
            final TextView textView15 = findViewById(R.id.textView15o);
            final TextView textView16 = findViewById(R.id.textView16o);
            final TextView textView17 = findViewById(R.id.textView17o);
            final TextView textView18 = findViewById(R.id.textView18o);
            final TextView textView19 = findViewById(R.id.textView19o);
            final TextView textView20 = findViewById(R.id.textView20o);
            final TextView textView21 = findViewById(R.id.textView21o);
            final TextView textView22 = findViewById(R.id.textView22o);
            final TextView textView23 = findViewById(R.id.textView23o);
            final TextView textView24 = findViewById(R.id.textView24o);
            final TextView textView25 = findViewById(R.id.textView25o);
            final TextView next_btn_one = findViewById(R.id.next_btn_one);
            final Animation a = AnimationUtils.loadAnimation(One_level.this, R.anim.anim_aipha);

            switch (line) {
                case 1: textView1.setVisibility(View.VISIBLE); textView1.startAnimation(a);break;
                case 2: textView2.setVisibility(View.VISIBLE); textView2.startAnimation(a);break;
                case 3: onePlane3.setVisibility(View.VISIBLE); onePlane3.startAnimation(a);break;
                case 4: textView4.setVisibility(View.VISIBLE); textView4.startAnimation(a);break;
                case 5: textView5.setVisibility(View.VISIBLE); textView5.startAnimation(a);break;
                case 6: textView6.setVisibility(View.VISIBLE); textView6.startAnimation(a);break;
                case 7: textView7.setVisibility(View.VISIBLE); textView7.startAnimation(a);break;
                case 8: textView8.setVisibility(View.VISIBLE); textView8.startAnimation(a);break;
                case 9: textView9.setVisibility(View.VISIBLE); textView9.startAnimation(a);break;
                case 10: textView10.setVisibility(View.VISIBLE); textView10.startAnimation(a);break;
                case 11: textView11.setVisibility(View.VISIBLE); textView11.startAnimation(a);break;
                case 12: textView12.setVisibility(View.VISIBLE); textView12.startAnimation(a);break;
                case 13: textView13.setVisibility(View.VISIBLE); textView13.startAnimation(a);break;
                case 14: textView14.setVisibility(View.VISIBLE); textView14.startAnimation(a);break;
                case 15: textView15.setVisibility(View.VISIBLE); textView15.startAnimation(a);break;
                case 16: textView16.setVisibility(View.VISIBLE); textView16.startAnimation(a);break;
                case 17: textView17.setVisibility(View.VISIBLE); textView17.startAnimation(a);break;
                case 18: textView18.setVisibility(View.VISIBLE); textView18.startAnimation(a);break;
                case 19: textView19.setVisibility(View.VISIBLE); textView19.startAnimation(a);break;
                case 20: textView20.setVisibility(View.VISIBLE); textView20.startAnimation(a);break;
                case 21: textView21.setVisibility(View.VISIBLE); textView21.startAnimation(a);break;
                case 22: textView22.setVisibility(View.VISIBLE); textView22.startAnimation(a);break;
                case 23: textView23.setVisibility(View.VISIBLE); textView23.startAnimation(a);break;
                case 24: textView24.setVisibility(View.VISIBLE); textView24.startAnimation(a);break;
                case 25: textView25.setVisibility(View.VISIBLE); textView25.startAnimation(a);break;
                case 26 : next_btn_one.setVisibility(View.VISIBLE); next_btn_one.startAnimation(a);

                    next_btn_one.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            v.startAnimation(a);
                            try {
                                Intent intent = new Intent(One_level.this, Two_level.class);
                                startActivity(intent);
                                finish();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    });
                    default: break;

            }

        }
    }
}
