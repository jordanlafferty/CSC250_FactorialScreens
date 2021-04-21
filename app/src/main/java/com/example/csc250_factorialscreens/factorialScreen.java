package com.example.csc250_factorialscreens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.text.DecimalFormat;
import static java.lang.Math.sqrt;

public class factorialScreen extends AppCompatActivity {
    private TextView factorialText;

    private int factorialRec(int n)
    {
        // also can be written as if (n== 1) return 1;
        if (n== 1)
        {
            return 1;
        }
        return n* factorialRec(n-1);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factorial_screen);
        int factorial = Variables.factorial;
        int answer = factorialRec(factorial);
        this.factorialText = this.findViewById(R.id.factorialNum);
        this.factorialText.setText(answer + "");
        Variables.sqrroot = answer;
    }

    public void onSquareRootButtonClicked(View v)
    {
        Intent i = new Intent(this, SquareRoot.class);
        this.startActivity(i);
    }
}