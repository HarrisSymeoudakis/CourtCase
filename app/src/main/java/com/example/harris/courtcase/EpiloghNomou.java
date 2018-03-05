package com.example.harris.courtcase;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EpiloghNomou extends Activity {

    private static Button buttonH, buttonR, buttonL, buttonX, buttonEp;
    private static int counter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_epilogh_nomou);

        //init comp
        buttonH = (Button)findViewById(R.id.buttonNH);
        buttonR = (Button)findViewById(R.id.buttonNR);
        buttonL = (Button)findViewById(R.id.buttonNL);
        buttonX = (Button)findViewById(R.id.buttonNX);
        buttonEp = (Button)findViewById(R.id.ButtonBackNom);

        //action listeners
        buttonH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        buttonEp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        buttonR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter = 1;
                startActivity(new Intent(EpiloghNomou.this, BlankActivity.class));
            }
        });

        buttonL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter = 2;
                startActivity(new Intent(EpiloghNomou.this, BlankActivity.class));
            }
        });

        buttonX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter = 3;
                startActivity(new Intent(EpiloghNomou.this, BlankActivity.class));
            }
        });
    }

    public static int getCounter() {
        return counter;
    }
}
