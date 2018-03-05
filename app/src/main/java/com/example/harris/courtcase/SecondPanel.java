package com.example.harris.courtcase;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondPanel extends Activity {
    private static MainFrame mainFrame;
    private static TextView txtEpik, txtCaseNum;
    private static Button buttonRet, buttonPl, buttonMin, buttonAn, buttonArg, buttonMetr, buttonGrig;

    //gia epistrofh Text Number sto prwto panel
   // private static TextView txt1,txt2,txt3,txt4,txt5,txt6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //init comp
        setContentView(R.layout.activity_second_panel);
        txtEpik = (TextView) findViewById(R.id.Epikefalida);
        txtCaseNum = (TextView) findViewById(R.id.ArithmosD);
        mainFrame = new MainFrame();
        buttonRet = (Button) findViewById(R.id.ButtonBack);
        buttonPl = (Button) findViewById(R.id.buttonPlus);
        buttonMin = (Button) findViewById(R.id.buttonMinus);
        buttonAn = (Button) findViewById(R.id.ButtonAn);
        buttonArg = (Button) findViewById(R.id.ButtonAr);
        buttonMetr = (Button) findViewById(R.id.ButtonMe);
        buttonGrig = (Button) findViewById(R.id.ButtonGr);

        //      IF CASES
        if (mainFrame.getCaseNum() == 1) {
            txtEpik.setText("ΕΦΕΤΕΙΟ ΗΡΑΚΛΕΙΟΥ");
            txtCaseNum.setText(mainFrame.getTxtCourtNumEF1().getText() + "");
            txtCaseNum.setTextColor(Color.rgb(255,165,0));
        } else if (mainFrame.getCaseNum() == 2) {
            txtEpik.setText("ΕΙΡΗΝΟΔΙΚΕΙΟ ΗΡΑΚΛΕΙΟΥ");
            txtCaseNum.setText(mainFrame.getTxtCourtNumEF2().getText() + "");
            txtCaseNum.setTextColor(Color.rgb(0,255,0));
        } else if (mainFrame.getCaseNum() == 3) {
            txtEpik.setText("ΕΙΡΗΝΟΔΙΚΕΙΟ ΚΑΣΤΕΛΙΟΥ");
            txtCaseNum.setText(mainFrame.getTxtCourtNumEF3().getText() + "");
            txtCaseNum.setTextColor(Color.rgb(28,86,204));
        } else if (mainFrame.getCaseNum() == 4) {
            txtEpik.setText("ΕΙΡΗΝΟΔΙΚΕΙΟ ΜΟΙΡΩΝ");
            txtCaseNum.setText(mainFrame.getTxtCourtNumEF4().getText() + "");
            txtCaseNum.setTextColor(Color.rgb(255,0,0));
        } else if (mainFrame.getCaseNum() == 5) {
            txtEpik.setText("ΕΙΡΗΝΟΔΙΚΕΙΟ ΠΥΡΓΟΥ");
            txtCaseNum.setText(mainFrame.getTxtCourtNumEF5().getText() + "");
            txtCaseNum.setTextColor(Color.rgb(28,86,204));
        } else if (mainFrame.getCaseNum() == 6) {
            txtEpik.setText("ΠΤΑΙΣΜΑΤΟΔΙΚΕΙΟ ΗΡΑΚΛΕΙΟΥ");
            txtCaseNum.setText(mainFrame.getTxtCourtNumEF6().getText() + "");
            txtCaseNum.setTextColor(Color.rgb(28,86,204));
        }


        // ACTION LISTENERS
        buttonRet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        buttonPl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numPl = Integer.parseInt(txtCaseNum.getText().toString());
                numPl += 1;
                txtCaseNum.setText(""+numPl);

            }
        });

        buttonMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numMin = Integer.parseInt(txtCaseNum.getText().toString());
                numMin -= 1;
                if (numMin <= 1) {
                    numMin = 1;
                } txtCaseNum.setText(""+numMin);

            }});

        buttonAn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mainFrame.getCaseNum() == 1) {
                    mainFrame.setTxtCourtNumEF1(txtCaseNum);

                    Intent intent = new Intent();
                    intent.putExtra("returnValue", txtCaseNum.getText());
                    setResult(RESULT_OK, intent);

                } else if (mainFrame.getCaseNum() == 2) {
                    txtCaseNum.setTextColor(Color.rgb(255,0,0));
                    mainFrame.setTxtCourtNumEF2(txtCaseNum);
                } else if (mainFrame.getCaseNum() == 3) {
                    txtCaseNum.setTextColor(Color.rgb(255,0,0));
                    mainFrame.setTxtCourtNumEF3(txtCaseNum);
                } else if (mainFrame.getCaseNum() == 4) {
                    txtCaseNum.setTextColor(Color.rgb(255,0,0));
                    mainFrame.setTxtCourtNumEF4(txtCaseNum);
                } else if (mainFrame.getCaseNum() == 5) {
                    txtCaseNum.setTextColor(Color.rgb(255,0,0));
                    mainFrame.setTxtCourtNumEF5(txtCaseNum);
                } else if (mainFrame.getCaseNum() == 6) {
                    txtCaseNum.setTextColor(Color.rgb(255,0,0));
                    mainFrame.setTxtCourtNumEF6(txtCaseNum);
                }
                finish();
            }
        });

        buttonArg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mainFrame.getCaseNum() == 1) {
                    mainFrame.setTxtCourtNumEF1(txtCaseNum);
                    txtCaseNum.setTextColor(Color.rgb(255,165,0));
                } else if (mainFrame.getCaseNum() == 2) {
                    mainFrame.setTxtCourtNumEF2(txtCaseNum);
                    txtCaseNum.setTextColor(Color.rgb(255,165,0));
                } else if (mainFrame.getCaseNum() == 3) {
                    mainFrame.setTxtCourtNumEF3(txtCaseNum);
                    txtCaseNum.setTextColor(Color.rgb(255,165,0));
                } else if (mainFrame.getCaseNum() == 4) {
                    mainFrame.setTxtCourtNumEF4(txtCaseNum);
                    txtCaseNum.setTextColor(Color.rgb(255,165,0));
                } else if (mainFrame.getCaseNum() == 5) {
                    mainFrame.setTxtCourtNumEF5(txtCaseNum);
                    txtCaseNum.setTextColor(Color.rgb(255,165,0));
                } else if (mainFrame.getCaseNum() == 6) {
                    mainFrame.setTxtCourtNumEF6(txtCaseNum);
                    txtCaseNum.setTextColor(Color.rgb(255,165,0));
                }
                finish();
            }
        });

        buttonMetr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mainFrame.getCaseNum() == 1) {
                    mainFrame.setTxtCourtNumEF1(txtCaseNum);
                    txtCaseNum.setTextColor(Color.rgb(28,86,204));
                } else if (mainFrame.getCaseNum() == 2) {
                    mainFrame.setTxtCourtNumEF2(txtCaseNum);
                    txtCaseNum.setTextColor(Color.rgb(28,86,204));
                } else if (mainFrame.getCaseNum() == 3) {
                    mainFrame.setTxtCourtNumEF3(txtCaseNum);
                    txtCaseNum.setTextColor(Color.rgb(28,86,204));
                } else if (mainFrame.getCaseNum() == 4) {
                    mainFrame.setTxtCourtNumEF4(txtCaseNum);
                    txtCaseNum.setTextColor(Color.rgb(28,86,204));
                } else if (mainFrame.getCaseNum() == 5) {
                    mainFrame.setTxtCourtNumEF5(txtCaseNum);
                    txtCaseNum.setTextColor(Color.rgb(28,86,204));
                } else if (mainFrame.getCaseNum() == 6) {
                    mainFrame.setTxtCourtNumEF6(txtCaseNum);
                    txtCaseNum.setTextColor(Color.rgb(28,86,204));
                }
                finish();
            }
        });

        buttonGrig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mainFrame.getCaseNum() == 1) {
                    mainFrame.setTxtCourtNumEF1(txtCaseNum);
                    txtCaseNum.setTextColor(Color.rgb(0,255,0));
                } else if (mainFrame.getCaseNum() == 2) {
                    mainFrame.setTxtCourtNumEF2(txtCaseNum);
                    txtCaseNum.setTextColor(Color.rgb(0,255,0));
                } else if (mainFrame.getCaseNum() == 3) {
                    mainFrame.setTxtCourtNumEF3(txtCaseNum);
                    txtCaseNum.setTextColor(Color.rgb(0,255,0));
                } else if (mainFrame.getCaseNum() == 4) {
                    mainFrame.setTxtCourtNumEF4(txtCaseNum);
                    txtCaseNum.setTextColor(Color.rgb(0,255,0));
                } else if (mainFrame.getCaseNum() == 5) {
                    mainFrame.setTxtCourtNumEF5(txtCaseNum);
                    txtCaseNum.setTextColor(Color.rgb(0,255,0));
                } else if (mainFrame.getCaseNum() == 6) {
                    mainFrame.setTxtCourtNumEF6(txtCaseNum);
                    txtCaseNum.setTextColor(Color.rgb(0,255,0));
                }
                finish();
            }
        });


    }

}
