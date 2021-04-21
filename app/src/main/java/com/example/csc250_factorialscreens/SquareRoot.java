package com.example.csc250_factorialscreens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.text.DecimalFormat;
import static java.lang.Math.sqrt;

public class SquareRoot extends AppCompatActivity {
    private TextView sqrRoot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square_root);
        int sqrtNum = Variables.sqrroot;
        double answer = sqrt(sqrtNum);
        this.sqrRoot = this.findViewById(R.id.sqrRoot);
        DecimalFormat df = new DecimalFormat("###.##");
        this.sqrRoot.setText(df.format(answer) + "");

    }

}