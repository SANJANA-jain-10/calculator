package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,badd,bsub,bmul,bdiv,bequal;
    TextView t1;
    int number1,number2,result;
    char op;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1= (TextView)findViewById(R.id.Text1);
        b1= (Button)findViewById(R.id.button1);
        b2= (Button)findViewById(R.id.button2);
        b3= (Button)findViewById(R.id.button3);
        b4= (Button)findViewById(R.id.button4);
        b5= (Button)findViewById(R.id.button5);
        b6= (Button)findViewById(R.id.button6);
        b7= (Button)findViewById(R.id.button7);
        b8= (Button)findViewById(R.id.button8);
        b9= (Button)findViewById(R.id.button9);
        b0= (Button)findViewById(R.id.button10);
        badd= (Button)findViewById(R.id.add);
        bsub= (Button)findViewById(R.id.sub);
        bmul= (Button)findViewById(R.id.mul);
        bdiv= (Button)findViewById(R.id.div);
        bequal= (Button)findViewById(R.id.equal);
//halloooo honneeyeyyy
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText()+"9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText()+"0");
            }
        });
        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 = Integer.parseInt(t1.getText().toString());
                op='+';
                t1.setText(null);
            }
        });
        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 = Integer.parseInt(t1.getText().toString());
                op='-';
                t1.setText(null);
            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 = Integer.parseInt(t1.getText().toString());
                op='*';
                t1.setText(null);
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 = Integer.parseInt(t1.getText().toString());
                op='/';
                t1.setText(null);
            }
        });

        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(op) {
                    case '+':
                        number2 = Integer.parseInt(t1.getText().toString());
                        result = number1 + number2;
                        t1.setText(result + "");
                        break;

                    case '-':
                        number2 = Integer.parseInt(t1.getText().toString());
                        result = number1 - number2;
                        t1.setText(result + "");
                        break;
                    case '*':
                        number2 = Integer.parseInt(t1.getText().toString());
                        result = number1 * number2;
                        t1.setText(result + "");
                        break;
                    case '/':
                        number2 = Integer.parseInt(t1.getText().toString());
                        result = number1 / number2;
                        t1.setText(result + "");
                        break;
                }
            }
        });


    }


}

