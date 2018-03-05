package com.example.harris.courtcase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BlankActivity extends AppCompatActivity {
    private static TextView txtEpik;
    private static Button buttonEp;
    private static EpiloghNomou epil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blank);

        //init comp
        txtEpik = (TextView)findViewById(R.id.epikfalidaBlank);
        buttonEp = (Button)findViewById(R.id.ButtonBackBlank);
        epil = new EpiloghNomou();

        if(epil.getCounter() == 1){
            txtEpik.setText("ΝΟΜΟΣ ΡΕΘΥΜΝΟΥ");
        }

        else if(epil.getCounter() == 2){
            txtEpik.setText("ΝΟΜΟΣ ΛΑΣΙΘΙΟΥ");
        }

        else if(epil.getCounter() == 3){
            txtEpik.setText("ΝΟΜΟΣ ΧΑΝΙΩΝ");
        }

        //action listeners
        buttonEp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
