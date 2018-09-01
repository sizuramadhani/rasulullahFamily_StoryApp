package com.mada.ceritakeluargarasulullah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button brasul = (Button) findViewById(R.id.rasul);
        brasul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(),rasulullah.class);
                startActivity(a);
            }
        });

        final Button babdullah = (Button) findViewById(R.id.abdullah);
        babdullah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(),abdullah.class);
                startActivity(a);
            }
        });

        final Button bsitiaminah = (Button) findViewById(R.id.siti);
        bsitiaminah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(),sitiaminah.class);
                startActivity(a);
            }
        });

        final Button bkhadijah = (Button) findViewById(R.id.khadijah);
        bkhadijah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(),khadijah.class);
                startActivity(a);
            }
        });


        final Button bfatimah = (Button) findViewById(R.id.fatimah);
        bfatimah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(),fatimah.class);
                startActivity(a);
            }
        });

        final Button bzainab = (Button) findViewById(R.id.zainab);
        bzainab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(),zainab.class);
                startActivity(a);
            }
        });

        final Button babdulmuthalib = (Button) findViewById(R.id.abdul);
        babdulmuthalib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(),abdulmuthalib.class);
                startActivity(a);
            }
        });

        final Button babuthalib = (Button) findViewById(R.id.abu);
        babuthalib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(),abuthalib.class);
                startActivity(a);
            }
        });

        final Button bummu = (Button) findViewById(R.id.ummu);
        bummu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(),ummu.class);
                startActivity(a);
            }
        });
    }
}
