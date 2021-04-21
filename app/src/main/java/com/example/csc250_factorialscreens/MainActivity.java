package com.example.csc250_factorialscreens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import java.text.DecimalFormat;
import static java.lang.Math.sqrt;

public class MainActivity extends AppCompatActivity {
    private EditText numInput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.numInput = this.findViewById(R.id.num1);

    }

    public void onFactorialButtonClicked(View v)
    {
        Intent i = new Intent(this, factorialScreen.class);
        String num = this.numInput.getText().toString();
        int numInput = Integer.parseInt(num);
        Variables.factorial = numInput;
        this.startActivity(i);
    }
}