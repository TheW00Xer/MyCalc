package com.example.mycalc;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public int getInt(EditText editText) {              //getInt is function name, (EditText editText) is declaration of object type we are working with and it's name
        String text = (editText.getText().toString());  //we created variable "text" it's type is String and it is equal to value of editText which we got (.getText) and converted it to String (.toString)
        if (text.equals("")) {                          //possible to use "==" instead of equal
            editText.setText("0");                      //after executing function we set "editText" value to 0 if the condition is met
            return 0;                                   //return ends this section "if" of the function
        }
        else {
            return Integer.parseInt(text);              //if condition isn't met function will return us the original value of variable "text"
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

        EditText numberOne = findViewById(R.id.editTextNumber1);
        EditText numberTwo = findViewById(R.id.editTextNumber2);
        TextView textViewResult = findViewById(R.id.textViewResult);

        Button buttonPlus = findViewById(R.id.buttonPlus);
        buttonPlus.setOnClickListener(view -> {
            int one = getInt(numberOne);
            int two = getInt(numberTwo);

            int resultOf = one + two;
            Log.i("MainActivity", String.valueOf(resultOf));
            textViewResult.setText(String.valueOf(resultOf));
        });

        Button buttonMinus = (Button) findViewById(R.id.buttonMinus);
        buttonMinus.setOnClickListener(view -> {
            int one = getInt(numberOne);
            int two = getInt(numberTwo);

            int resultOf = one - two;
            Log.i("MainActivity", String.valueOf(resultOf));
            textViewResult.setText(String.valueOf(resultOf));
        });

        Button buttonMultiply = (Button) findViewById(R.id.buttonMultiply);
        buttonMultiply.setOnClickListener(view -> {
            int one = getInt(numberOne);
            int two = getInt(numberTwo);

            int resultOf = one * two;
            Log.i("MainActivity", String.valueOf(resultOf));
            textViewResult.setText(String.valueOf(resultOf));
        });

        Button buttonDivide = (Button) findViewById(R.id.buttonDivide);
        buttonDivide.setOnClickListener(view -> {
            int one = getInt(numberOne);
            int two = getInt(numberTwo);
            if (two == 0) {
                textViewResult.setText(R.string.errorMessage);
            }
            else {
                int resultOf = one / two;
                Log.i("MainActivity", String.valueOf(resultOf));
                textViewResult.setText(String.valueOf(resultOf));
            }
        });
    }
}

