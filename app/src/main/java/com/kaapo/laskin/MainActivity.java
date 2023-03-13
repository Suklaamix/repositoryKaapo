package com.kaapo.laskin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private EditText textInput;
    private EditText textInput1;

    private TextView textViewOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textInput = findViewById(R.id.editText);
        textInput1 = findViewById(R.id.editText1);
        textViewOutput = findViewById(R.id.textViewOutput);

    }

    public void increaseNumber(View view) {
    int num1 = Integer.parseInt(textInput.getText().toString());
    int num2 = Integer.parseInt(textInput1.getText().toString());
    int tulos = num1 + num2;
    textViewOutput.setText(String.valueOf(tulos));
    }

    public void decreaseNumber(View view) {
    int num1 = Integer.parseInt(textInput.getText().toString());
    int num2 = Integer.parseInt(textInput1.getText().toString());
    int tulos = num1 - num2;
    textViewOutput.setText(String.valueOf(tulos));
    }

    public void multiplyNumber(View view) {
    int num1 = Integer.parseInt(textInput.getText().toString());
    int num2 = Integer.parseInt(textInput1.getText().toString());
    int tulos = num1 * num2;
    textViewOutput.setText(String.valueOf(tulos));
    }

    public void divideNumber(View view) {
    int num1 = Integer.parseInt(textInput.getText().toString());
    int num2 = Integer.parseInt(textInput1.getText().toString());
    float tulos = (float) num1 / num2;
    DecimalFormat decimalFormat = new DecimalFormat("#.##");
    float pyoristys = Float.parseFloat(decimalFormat.format(tulos));
    textViewOutput.setText(String.valueOf(pyoristys));
    }
}