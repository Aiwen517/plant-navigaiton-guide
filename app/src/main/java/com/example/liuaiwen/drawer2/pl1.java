package com.example.liuaiwen.drawer2;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by liuaiwen on 2018/1/11.
 */

public class pl1 extends AppCompatActivity {
    ImageButton b1, b2;
    private boolean isPause=false;//是否暂停
    private MediaPlayer mp = new MediaPlayer();
    android.content.res.Resources res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pl1);
        mp = MediaPlayer.create(this, R.raw.m1);
       // mp.start();
       b1 = (ImageButton) findViewById(R.id.b1);
        b2 = (ImageButton) findViewById(R.id.b2);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
                    if(isPause){
                isPause=false;
                }
                b2.setEnabled(true);
                b1.setEnabled(false);

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp.isPlaying()&&!isPause){
                    mp.pause();
                    isPause=true;
                   b1.setEnabled(true);
                }else{
                    mp.start();
                    b1.setEnabled(false);
                }

            }
        });
        }

}
