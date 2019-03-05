package com.example.liuaiwen.drawer2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by liuaiwen on 2018/1/11.
 */

public class plant extends AppCompatActivity {
    TextView p1,p2,p3,p4,p5,p6,p7,p8,p9,p10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.plant);
        p1 = (TextView) findViewById(R.id.p1);
        p2 = (TextView) findViewById(R.id.p2);
        p3 = (TextView) findViewById(R.id.p3);
        p4 = (TextView) findViewById(R.id.p4);
        p5 = (TextView) findViewById(R.id.p5);
        p6 = (TextView) findViewById(R.id.p6);
        p7 = (TextView) findViewById(R.id.p7);
        p8 = (TextView) findViewById(R.id.p8);
        p9 = (TextView) findViewById(R.id.p9);
        p10 = (TextView) findViewById(R.id.p10);
        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_route = new Intent();
                intent_route.setClass(plant.this, pl1.class);
                startActivity(intent_route);
            }
        });
        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_route = new Intent();
                intent_route.setClass(plant.this, pl2.class);
                startActivity(intent_route);
            }
        });
        p3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_route = new Intent();
                intent_route.setClass(plant.this, pl3.class);
                startActivity(intent_route);
            }
        });
        p4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_route = new Intent();
                intent_route.setClass(plant.this, pl4.class);
                startActivity(intent_route);
            }
        });
        p5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_route = new Intent();
                intent_route.setClass(plant.this, pl5.class);
                startActivity(intent_route);
            }
        });
        p6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_route = new Intent();
                intent_route.setClass(plant.this, pl6.class);
                startActivity(intent_route);
            }
        });
        p7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_route = new Intent();
                intent_route.setClass(plant.this, pl7.class);
                startActivity(intent_route);
            }
        });
        p8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_route = new Intent();
                intent_route.setClass(plant.this, pl8.class);
                startActivity(intent_route);
            }
        });
        p9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_route = new Intent();
                intent_route.setClass(plant.this, pl9.class);
                startActivity(intent_route);
            }
        });
        p10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_route = new Intent();
                intent_route.setClass(plant.this, pl10.class);
                startActivity(intent_route);
            }
        });
    }
}
