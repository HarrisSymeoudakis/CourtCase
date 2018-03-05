package com.example.harris.courtcase;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainFrame extends Activity {
    //declarations
    /*first panel buttons*/
    private Button button1,button2,button3,button4,button5,button6, buttonEp;

    /*first panel textviews */
    private static TextView txtCourtNumEF1, txtCourtNumEF2, txtCourtNumEF3, txtCourtNumEF4, txtCourtNumEF5, txtCourtNumEF6;

    //int case num
    private static int caseNum;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_frame);

        //init comp
        //buttons
        // first panel buttons
        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        button5 = (Button)findViewById(R.id.button5);
        button6 = (Button)findViewById(R.id.button6);
        buttonEp = (Button)findViewById(R.id.buttonEpeksergasia);

        //court numbers
        txtCourtNumEF1 = (TextView)findViewById(R.id.EfeteioNumber);
        txtCourtNumEF2 = (TextView)findViewById(R.id.EirnodikioNumber);
        txtCourtNumEF3 = (TextView)findViewById(R.id.EirnodikioΚNumber);
        txtCourtNumEF4 = (TextView)findViewById(R.id.EirnodikioMNumber);
        txtCourtNumEF5 = (TextView)findViewById(R.id.EirnodikioPNumber);
        txtCourtNumEF6 = (TextView)findViewById(R.id.PtaismatodikeioNumber);

        //action listeners
        // first panel buttons
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                caseNum = 1;
                Intent i = new Intent(MainFrame.this, SecondPanel.class);
                startActivityForResult(i, 1);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                caseNum = 2;
                startActivity(new Intent(MainFrame.this, SecondPanel.class));
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                caseNum = 3;
                startActivity(new Intent(MainFrame.this, SecondPanel.class));
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                caseNum = 4;
                startActivity(new Intent(MainFrame.this, SecondPanel.class));
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                caseNum = 5;
                startActivity(new Intent(MainFrame.this, SecondPanel.class));
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                caseNum = 6;
                startActivity(new Intent(MainFrame.this, SecondPanel.class));
            }
        });


        buttonEp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainFrame.this, EpiloghNomou.class));
            }
        });

    }

    // GETTERS


    public static TextView getTxtCourtNumEF1() {
        return txtCourtNumEF1;
    }

    public static TextView getTxtCourtNumEF2() {
        return txtCourtNumEF2;
    }

    public static void setTxtCourtNumEF1(TextView txtCourtNumEF1) {
        MainFrame.txtCourtNumEF1 = txtCourtNumEF1;
    }

    public static void setTxtCourtNumEF2(TextView txtCourtNumEF2) {
        MainFrame.txtCourtNumEF2 = txtCourtNumEF2;
    }

    public static void setTxtCourtNumEF3(TextView txtCourtNumEF3) {
        MainFrame.txtCourtNumEF3 = txtCourtNumEF3;
    }

    public static void setTxtCourtNumEF4(TextView txtCourtNumEF4) {
        MainFrame.txtCourtNumEF4 = txtCourtNumEF4;
    }

    public static void setTxtCourtNumEF5(TextView txtCourtNumEF5) {
        MainFrame.txtCourtNumEF5 = txtCourtNumEF5;
    }

    public static void setTxtCourtNumEF6(TextView txtCourtNumEF6) {
        MainFrame.txtCourtNumEF6 = txtCourtNumEF6;
    }

    public static void setCaseNum(int caseNum) {
        MainFrame.caseNum = caseNum;
    }

    public static TextView getTxtCourtNumEF3() {
        return txtCourtNumEF3;
    }

    public static TextView getTxtCourtNumEF4() {
        return txtCourtNumEF4;
    }

    public static TextView getTxtCourtNumEF5() {
        return txtCourtNumEF5;
    }

    public static TextView getTxtCourtNumEF6() {
        return txtCourtNumEF6;
    }

    public static int getCaseNum() {
        return caseNum;
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {
            if(resultCode == RESULT_OK){
                String stredittext=data.getStringExtra("returnValue");
                txtCourtNumEF1.setText(stredittext);
                txtCourtNumEF1.setTextColor(Color.rgb(255,0,0));
            }
        }
    }
}
