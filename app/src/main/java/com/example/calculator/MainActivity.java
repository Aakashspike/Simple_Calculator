package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ed;
    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bMul, bDiv, bAdd, bSub, bDot, bEq, bCle;
    double result = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed = (EditText) findViewById(R.id.ed1);

        b0 = (Button) findViewById(R.id.b0);
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed.setText(ed.getText()+"0");
            }
        });

        b1 = (Button) findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed.setText(ed.getText()+"1");
            }
        });

        b2 = (Button) findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed.setText(ed.getText()+"2");
            }
        });

        b3 = (Button) findViewById(R.id.b3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed.setText(ed.getText()+"3");
            }
        });

        b4 = (Button) findViewById(R.id.b4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed.setText(ed.getText()+"4");
            }
        });

        b5 = (Button) findViewById(R.id.b5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed.setText(ed.getText()+"5");
            }
        });

        b6 = (Button) findViewById(R.id.b6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed.setText(ed.getText()+"6");
            }
        });

        b7 = (Button) findViewById(R.id.b7);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed.setText(ed.getText()+"7");
            }
        });

        b8 = (Button) findViewById(R.id.b8);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed.setText(ed.getText()+"8");
            }
        });

        b9 = (Button) findViewById(R.id.b9);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed.setText(ed.getText()+"9");
            }
        });

        bDot = (Button) findViewById(R.id.bDot);
        bDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed.setText(ed.getText()+".");
            }
        });

        bDiv = (Button) findViewById(R.id.bDiv);
        bDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed.setText(ed.getText()+"/");
            }
        });

        bMul = (Button) findViewById(R.id.bMul);
        bMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed.setText(ed.getText()+"*");
            }
        });

        bSub = (Button) findViewById(R.id.bSub);
        bSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed.setText(ed.getText()+"-");
            }
        });

        bAdd = (Button) findViewById(R.id.bAdd);
        bAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed.setText(ed.getText()+"+");
            }
        });

        bCle = (Button) findViewById(R.id.bCle);
        bCle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed.setText("");
            }
        });

        bEq = (Button) findViewById(R.id.bEq);
        bEq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = ed.getText().toString();

                if(data.contains("/")){
                    String[] operands = data.split("/");
                    if(operands.length==2)
                    {
                        double operand1 = Double.parseDouble(operands[0]);
                        double operand2 = Double.parseDouble(operands[1]);
                        result = operand1/operand2;
                        ed.setText(String.valueOf(result));
                    }
                    else{
                        Toast.makeText(getBaseContext(),"Invalid Text", Toast.LENGTH_LONG).show();
                    }
                }

                else if(data.contains("*")){
                    String[] operands = data.split("\\*");
                    if(operands.length==2)
                    {
                        double operand1 = Double.parseDouble(operands[0]);
                        double operand2 = Double.parseDouble(operands[1]);
                        result = operand1*operand2;
                        ed.setText(String.valueOf(result));
                    }
                    else{
                        Toast.makeText(getBaseContext(),"Invalid Text", Toast.LENGTH_LONG).show();
                    }
                }

                else if(data.contains("+")){
                    String[] operands = data.split("\\+");
                    if(operands.length==2)
                    {
                        double operand1 = Double.parseDouble(operands[0]);
                        double operand2 = Double.parseDouble(operands[1]);
                        result = operand1+operand2;
                        ed.setText(String.valueOf(result));
                    }
                    else{
                        Toast.makeText(getBaseContext(),"Invalid Text", Toast.LENGTH_LONG).show();
                    }
                }

                else if(data.contains("-")){
                    String[] operands = data.split("-");
                    if(operands.length==2)
                    {
                        double operand1 = Double.parseDouble(operands[0]);
                        double operand2 = Double.parseDouble(operands[1]);
                        result = operand1-operand2;
                        ed.setText(String.valueOf(result));
                    }
                    else{
                        Toast.makeText(getBaseContext(),"Invalid Text", Toast.LENGTH_LONG).show();
                    }
                }

                else{
                    ed.setText(ed.getText());
                }

            }
        });

    }
}