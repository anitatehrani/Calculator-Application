package com.example.calc_end;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    String resultt="";
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putDouble("result", Double.parseDouble(resultt));

    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState != null) {
            resultt = String.valueOf(savedInstanceState.getDouble("result"));
            TextView res = findViewById(R.id.result);
            res.setText(resultt);
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Button one = findViewById(R.id.one);
        Button two = findViewById(R.id.two);
        Button three = findViewById(R.id.three);
        Button four = findViewById(R.id.four);
        Button five = findViewById(R.id.five);
        Button six = findViewById(R.id.six);
        Button seven = findViewById(R.id.seven);
        Button eight = findViewById(R.id.eight);
        Button nine = findViewById(R.id.nine);
        Button zero = findViewById(R.id.zero);
        Button plus = findViewById(R.id.plus);
        Button min = findViewById(R.id.minus);
        Button mul = findViewById(R.id.mult);
        Button div = findViewById(R.id.divid);
        Button equal = findViewById(R.id.equal);
        Button clear = findViewById(R.id.clear);
        Button dot = findViewById(R.id.decimal);
        TextView res = findViewById(R.id.result);

        one.setOnClickListener(v ->
        {
            resultt=resultt +"1";
            res.setText(resultt);
        });
        two.setOnClickListener(v ->
        {
            resultt=resultt +"2";
            res.setText(resultt);
        });
        three.setOnClickListener(v ->
        {
            resultt=resultt +"3";
            res.setText(resultt);
        });
        four.setOnClickListener(v ->
        {
            resultt=resultt +"4";
            res.setText(resultt);
        });
        five.setOnClickListener(v ->
        {
            resultt=resultt +"5";
            res.setText(resultt);
        });
        six.setOnClickListener(v ->
        {
            resultt=resultt +"6";
            res.setText(resultt);
        });
        seven.setOnClickListener(v ->
        {
            resultt=resultt +"7";
            res.setText(resultt);
        });
        eight.setOnClickListener(v ->
        {
            resultt=resultt +"8";
            res.setText(resultt);
        });
        nine.setOnClickListener(v ->
        {
            resultt=resultt +"9";
            res.setText(resultt);
        });
        zero.setOnClickListener(v ->
        {
            resultt=resultt +"0";
            res.setText(resultt);
        });
        plus.setOnClickListener(v ->
        {
            resultt=resultt +"+";
            res.setText(resultt);
        });
        min.setOnClickListener(v ->
        {
            resultt=resultt +"-";
            res.setText(resultt);

        });
        mul.setOnClickListener(v ->
        {
            resultt=resultt +"*";
            res.setText(resultt);
        });
        div.setOnClickListener(v ->
        {
            resultt=resultt +"/";
            res.setText(resultt);
        });
        dot.setOnClickListener(v ->
        {
            resultt=resultt +".";
            res.setText(resultt);
        });
        clear.setOnClickListener(v ->
        {
            resultt="";
            res.setText(resultt);
        });
        equal.setOnClickListener(v -> {
            if(resultt.equals(""))
            {
                res.setText("Error");
                return;
            }
            String[] arr = resultt.split("[+\\-*/]");
            double num1 = Double.parseDouble(arr[0]);
            double num2 = Double.parseDouble(arr[1]);
            if (resultt.contains("+")) {
                res.setText(String.valueOf(num1 + num2));
            } else if (resultt.contains("-")) {
                res.setText(String.valueOf(num1 - num2));
            } else if (resultt.contains("*")) {
                res.setText(String.valueOf(num1 * num2));
            } else if (resultt.contains("/") && num2 != 0){
                res.setText(String.valueOf(num1 / num2));
            }
            else
            {
                res.setText("Error");
            }
            resultt=res.getText().toString();
        });
    }
}
