package com.example.mycalc;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText numberOne = (EditText) findViewById(R.id.editTextNumber1);
        EditText numberTwo = (EditText) findViewById(R.id.editTextNumber2);
        TextView textViewResult = (TextView) findViewById(R.id.textViewResult);
        Button buttonPlus = (Button) findViewById(R.id.buttonPlus);
        buttonPlus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                int one = Integer.parseInt(String.valueOf(numberOne.getText()));

                int two = Integer.parseInt(String.valueOf(numberTwo.getText()));

                int resultPlus = one + two;
                Log.i("MainActivity", String.valueOf(resultPlus));
                textViewResult.setText(String.valueOf(resultPlus));
            }
        });
        Button buttonMinus = (Button) findViewById(R.id.buttonMinus);
        buttonMinus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                int one = Integer.parseInt(String.valueOf(numberOne.getText()));

                int two = Integer.parseInt(String.valueOf(numberTwo.getText()));

                int resultPlus = one - two;
                Log.i("MainActivity", String.valueOf(resultPlus));
                textViewResult.setText(String.valueOf(resultPlus));
            }
        });
        Button buttonMultiply = (Button) findViewById(R.id.buttonMultiply);
        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                int one = Integer.parseInt(String.valueOf(numberOne.getText()));

                int two = Integer.parseInt(String.valueOf(numberTwo.getText()));

                int resultPlus = one * two;
                Log.i("MainActivity", String.valueOf(resultPlus));
                textViewResult.setText(String.valueOf(resultPlus));
            }
        });
        Button buttonDivide = (Button) findViewById(R.id.buttonDivide);
        buttonDivide.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                int one = Integer.parseInt(String.valueOf(numberOne.getText()));

                int two = Integer.parseInt(String.valueOf(numberTwo.getText()));

                int resultPlus = one / two;
                Log.i("MainActivity", String.valueOf(resultPlus));
                textViewResult.setText(String.valueOf(resultPlus));
            }
        });
    }
}
