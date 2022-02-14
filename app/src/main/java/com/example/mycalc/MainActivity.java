package com.example.mycalc;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textViewResult = (TextView) findViewById(R.id.textViewResult);
        Button buttonPlus = (Button) findViewById(R.id.buttonPlus);
        buttonPlus.setEnabled(false);
        Button buttonMinus = (Button) findViewById(R.id.buttonMinus);
        buttonMinus.setEnabled(false);
        Button buttonMultiply = (Button) findViewById(R.id.buttonMultiply);
        buttonMultiply.setEnabled(false);
        Button buttonDivide = (Button) findViewById(R.id.buttonDivide);
        buttonDivide.setEnabled(false);

        EditText numberOne = (EditText) findViewById(R.id.editTextNumber1);
        numberOne.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (numberOne.getText().toString().equals("")){
                    buttonPlus.setEnabled(false);
                    buttonMinus.setEnabled(false);
                    buttonMultiply.setEnabled(false);
                    buttonDivide.setEnabled(false);
                    textViewResult.setText("Please input numbers.");
                } else {
                    buttonPlus.setEnabled(true);
                    buttonMinus.setEnabled(true);
                    buttonMultiply.setEnabled(true);
                    buttonDivide.setEnabled(true);
                }
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (numberOne.getText().toString().equals("")){
                    buttonPlus.setEnabled(false);
                    buttonMinus.setEnabled(false);
                    buttonMultiply.setEnabled(false);
                    buttonDivide.setEnabled(false);
                    textViewResult.setText("Please input numbers.");
                } else {
                    buttonPlus.setEnabled(true);
                    buttonMinus.setEnabled(true);
                    buttonMultiply.setEnabled(true);
                    buttonDivide.setEnabled(true);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (numberOne.getText().toString().equals("")){
                    buttonPlus.setEnabled(false);
                    buttonMinus.setEnabled(false);
                    buttonMultiply.setEnabled(false);
                    buttonDivide.setEnabled(false);
                    textViewResult.setText("Please input numbers.");
                } else {
                    buttonPlus.setEnabled(true);
                    buttonMinus.setEnabled(true);
                    buttonMultiply.setEnabled(true);
                    buttonDivide.setEnabled(true);
                }
            }
        });

        EditText numberTwo = (EditText) findViewById(R.id.editTextNumber2);
        numberTwo.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (numberTwo.getText().toString().equals("")){
                    buttonPlus.setEnabled(false);
                    buttonMinus.setEnabled(false);
                    buttonMultiply.setEnabled(false);
                    buttonDivide.setEnabled(false);
                    textViewResult.setText("Please input numbers.");
                } else {
                    buttonPlus.setEnabled(true);
                    buttonMinus.setEnabled(true);
                    buttonMultiply.setEnabled(true);
                    buttonDivide.setEnabled(true);
                }
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (numberTwo.getText().toString().equals("")){
                    buttonPlus.setEnabled(false);
                    buttonMinus.setEnabled(false);
                    buttonMultiply.setEnabled(false);
                    buttonDivide.setEnabled(false);
                    textViewResult.setText("Please input numbers.");
                } else {
                    buttonPlus.setEnabled(true);
                    buttonMinus.setEnabled(true);
                    buttonMultiply.setEnabled(true);
                    buttonDivide.setEnabled(true);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (numberTwo.getText().toString().equals("")){
                    buttonPlus.setEnabled(false);
                    buttonMinus.setEnabled(false);
                    buttonMultiply.setEnabled(false);
                    buttonDivide.setEnabled(false);
                    textViewResult.setText("Please input numbers.");
                } else {
                    buttonPlus.setEnabled(true);
                    buttonMinus.setEnabled(true);
                    buttonMultiply.setEnabled(true);
                    buttonDivide.setEnabled(true);
                }
            }
        });
        buttonPlus.setOnClickListener(view -> {
            int one = Integer.parseInt(String.valueOf(numberOne.getText()));
            int two = Integer.parseInt(String.valueOf(numberTwo.getText()));
            int resultVal = one + two;
            Log.i("MainActivity", String.valueOf(resultVal));
            textViewResult.setText(String.valueOf(resultVal));
        });

        buttonMinus.setOnClickListener(view -> {
            int one = Integer.parseInt(String.valueOf(numberOne.getText()));
            int two = Integer.parseInt(String.valueOf(numberTwo.getText()));
            int resultVal = one - two;
            Log.i("MainActivity", String.valueOf(resultVal));
            textViewResult.setText(String.valueOf(resultVal));
        });

        buttonMultiply.setOnClickListener(view -> {
            int one = Integer.parseInt(String.valueOf(numberOne.getText()));
            int two = Integer.parseInt(String.valueOf(numberTwo.getText()));
            int resultVal = one * two;
            Log.i("MainActivity", String.valueOf(resultVal));
            textViewResult.setText(String.valueOf(resultVal));
        });

        buttonDivide.setOnClickListener(view -> {
            int one = Integer.parseInt(String.valueOf(numberOne.getText()));
            int two = Integer.parseInt(String.valueOf(numberTwo.getText()));
                if (numberTwo.getText().toString().equals("0")){
                    textViewResult.setText("Error");
                } else {
                    int resultVal = one / two;
                    Log.i("MainActivity", String.valueOf(resultVal));
                    textViewResult.setText(String.valueOf(resultVal));
                }

        });
    }
}

