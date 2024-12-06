package com.example.mybasiccalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    int num1;
    int num2;
    char ch;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        result = findViewById(R.id.TextViewResultBox);
        result.setText("");
        num1 = 0;
        num2 = 0;

    }

    public void butNumFunc(View view) {
        Button button = (Button) view;
        result.append(button.getText().toString());
    }

//    public void funcAction(View view) {
//        Button button = (Button) view;
//        String numInScreen = result.getText().toString();
//        num1 = Integer.parseInt(numInScreen);
//        action = button.getText().charAt(0);
//        result.setText("");
//    }

    public void funcPlus(View view) {
        Button button = (Button) view;
        String numInScreen = result.getText().toString();
        num1 = Integer.parseInt(numInScreen);
        ch = '+';
        result.setText("");
    }
    public void funcMinus(View view) {
        Button button = (Button) view;
        String numInScreen = result.getText().toString();
        num1 = Integer.parseInt(numInScreen);
        ch = '-';
        result.setText("");
    }
    public void funcMultiply(View view) {
        Button button = (Button) view;
        String numInScreen = result.getText().toString();
        num1 = Integer.parseInt(numInScreen);
        ch = 'x';
        result.setText("");
    }
    public void funcDivide(View view) {
        Button button = (Button) view;
        String numInScreen = result.getText().toString();
        num1 = Integer.parseInt(numInScreen);
        ch = '÷';
        result.setText("");
    }

    public void funcClear(View view) {
    result.setText("");
    num1 = 0;
    }

    public void butEQFunc(View view) {
        double answer;
        String numInScreen = result.getText().toString();
        num2 = Integer.parseInt(numInScreen);
        switch (ch) {
            case '+':
                answer = (num1 + num2);
                break;
            case '-':
                answer = (num1 - num2);
                break;
            case 'x':
                answer = (num1 * num2);
                break;
            case '÷':
                if (num2 == 0) {
                    answer = 0;
                    result.setText("Error: try again");
                }
                else {
                    answer = (num1 / num2); }
                break;
            default:
                answer = 0;
                result.setText("Error: try again");
                break;
        }
        if (result.getText().toString() == "Error: try again"){
            result.setText("Error: try again");
        }
        else {
            result.setText(answer+"");
        }
    }




//    public void btn9func(View view) {
//        Button button = (Button) view;
//        result.append(button.getText().toString());
//
//    }
//    public void btn8func(View view) {
//        Button button = (Button) view;
//        result.append(button.getText().toString());
//
//    }
//    public void btn7func(View view) {
//        Button button = (Button) view;
//        result.append(button.getText().toString());
//
//    }
//    public void btn6func(View view) {
//        Button button = (Button) view;
//        result.append(button.getText().toString());
//
//    }
//    public void btn5func(View view) {
//        Button button = (Button) view;
//        result.append(button.getText().toString());
//
//    }
//    public void btn4func(View view) {
//        Button button = (Button) view;
//        result.append(button.getText().toString());
//
//    }
//    public void btn3func(View view) {
//        Button button = (Button) view;
//        result.append(button.getText().toString());
//
//    }
//    public void btn2func(View view) {
//        Button button = (Button) view;
//        result.append(button.getText().toString());
//
//    }
//    public void btn1func(View view) {
//        Button button = (Button) view;
//        result.append(button.getText().toString());
//
//    }
//    public void btn0func(View view) {
//        Button button = (Button) view;
//        result.append(button.getText().toString());
//
//    }



}