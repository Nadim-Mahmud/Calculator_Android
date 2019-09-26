package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView input;
    private TextView output;
    private Button buttonAC;
    private Button button_equal;
    private Button button_add;
    private Button button_minus;
    private Button button_multiply;
    private Button button_divide;
    private Button button0;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = (TextView) findViewById(R.id.input);
        output = (TextView) findViewById(R.id.output);

        buttonAC= (Button) findViewById(R.id.button_AC);
        button_equal= (Button) findViewById(R.id.button_equal);
        button_add= (Button) findViewById(R.id.button_plus);
        button_minus= (Button) findViewById(R.id.button_minus);
        button_multiply= (Button) findViewById(R.id.button_mult);
        button_divide= (Button) findViewById(R.id.button_divide);

        button0= (Button) findViewById(R.id.button0);
        button1= (Button) findViewById(R.id.button1);
        button2= (Button) findViewById(R.id.button2);
        button3= (Button) findViewById(R.id.button3);
        button4= (Button) findViewById(R.id.button4);
        button5= (Button) findViewById(R.id.button5);
        button6= (Button) findViewById(R.id.button6);
        button7= (Button) findViewById(R.id.button7);
        button8= (Button) findViewById(R.id.button8);
        button9= (Button) findViewById(R.id.button9);

        buttonAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText("0");
                output.setText("0");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText()+"0");
            }
        });

    }
}
