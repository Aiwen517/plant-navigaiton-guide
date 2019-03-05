package com.example.liuaiwen.drawer2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.amap.api.maps.MapView;

/**
 * Created by liuaiwen on 2018/1/10.
 */

public class route  extends AppCompatActivity {
    TextView fami ,history,classic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.route);
        fami = (TextView) findViewById(R.id.textView7);
        history = (TextView) findViewById(R.id.textView8);
        classic = (TextView) findViewById(R.id.textView9);
        fami.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_route = new Intent();
                intent_route.setClass(route.this, fami.class);
                startActivity(intent_route);
            }
        });
        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_route = new Intent();
                intent_route.setClass(route.this, history.class);
                startActivity(intent_route);
            }
        });
        classic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_route = new Intent();
                intent_route.setClass(route.this, classic.class);
                startActivity(intent_route);
            }
        });
    }
}
