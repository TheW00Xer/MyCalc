package com.example.mycalc;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.robotemi.sdk.Robot;
import com.robotemi.sdk.listeners.OnRobotReadyListener;

public class MainActivity extends AppCompatActivity implements OnRobotReadyListener {
    Robot mRobot;
    String TAG;

    public double getInt(int viewId) {                  //function called getInt, is using object view Id (int viewId) to find object
        EditText text = findViewById(viewId);           //declared object type EditText as "text" which is found using viewId
        String message = text.getText().toString();     //created variable "message" type "String" which value we get from object "text"
        if (message.equals("")) {
            text.setText("0");                          //if value of "message" equals nothing, "text" value is set to "0" to prevent app from crashing in case of missing value
            return 0;
        }
        else {
            return Integer.parseInt(message);           //if value of "message" equals any number, we return this value back
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRobot = Robot.getInstance();
        TextView textViewResult = findViewById(R.id.textViewResult);

        Button buttonPlus = findViewById(R.id.buttonPlus);
        buttonPlus.setOnClickListener(view -> {
            double resultOf = getInt(R.id.editTextNumber1) + getInt(R.id.editTextNumber2);      //calling out function "getInt" to get values for number1 and number2
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

    @Override
    protected void onStart() {
        super.onStart();

        mRobot.addOnRobotReadyListener(this);
    }

    @Override
    protected void onStop() {
        super.onStop();

        mRobot.removeOnRobotReadyListener(this);
    }

    @Override
    public void onRobotReady(boolean isReady) {
        if (isReady) {
            Log.i(TAG, "Robot is ready");
            mRobot.hideTopBar();
        }
    }
}

