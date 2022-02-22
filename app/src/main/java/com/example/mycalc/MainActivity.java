package com.example.mycalc;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    //public double getInt(EditText editText) {           //getInt is function name, (EditText editText) is declaration of object type we are working with and it's name
    //    String text = (editText.getText().toString());  //we created variable "text" it's type is String and it is equal to value of editText which we got (.getText) and converted it to String (.toString)
    //    if (text.equals("")) {                          //possible to use "==" instead of equal
    //        editText.setText("0");                      //after executing function we set "editText" value to 0 if the condition is met
    //        return 0;                                   //return ends this section "if" of the function
    //    }
    //    else {
    //        return Integer.parseInt(text);              //if condition isn't met function will return us the original value of variable "text"
    //    }
    //}

    public double getInt(int viewId) {
        EditText text = findViewById(viewId);
        String message = text.getText().toString();
        if (message.equals("")) {
            text.setText("0");
            return 0;
        }
        else {
            return Integer.parseInt(message);
        }
    }
    //EXAMPLE FUNCTION
    //public int function(int value) {
    //    if (value >1) {
    //        return 1;
    //    }
    //    else {
    //        return 0;
    //    }
    //}

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textViewResult = findViewById(R.id.textViewResult);

        Button buttonPlus = findViewById(R.id.buttonPlus);
        buttonPlus.setOnClickListener(view -> {
            double resultOf = getInt(R.id.editTextNumber1) + getInt(R.id.editTextNumber2);
            Log.i("MainActivity", String.valueOf(resultOf));
            textViewResult.setText(String.valueOf(resultOf));
        });

        Button buttonMinus = findViewById(R.id.buttonMinus);
        buttonMinus.setOnClickListener(view -> {
            double resultOf = getInt(R.id.editTextNumber1) - getInt(R.id.editTextNumber2);
            Log.i("MainActivity", String.valueOf(resultOf));
            textViewResult.setText(String.valueOf(resultOf));
        });

        Button buttonMultiply = findViewById(R.id.buttonMultiply);
        buttonMultiply.setOnClickListener(view -> {
            double resultOf = getInt(R.id.editTextNumber1) * getInt(R.id.editTextNumber2);
            Log.i("MainActivity", String.valueOf(resultOf));
            textViewResult.setText(String.valueOf(resultOf));
        });

        Button buttonDivide = findViewById(R.id.buttonDivide);
        buttonDivide.setOnClickListener(view -> {
            if (getInt(R.id.editTextNumber2) == 0) {
                textViewResult.setText(R.string.errorMessage);
            }
            else {
                double resultOf = getInt(R.id.editTextNumber1) / getInt(R.id.editTextNumber2);
                Log.i("MainActivity", String.valueOf(resultOf));
                textViewResult.setText(String.valueOf(resultOf));
            }
        });
    }
}

