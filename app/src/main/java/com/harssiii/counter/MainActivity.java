package com.harssiii.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    Button inc;
    Button rs;
    TextView tV;
    Button dec;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Counter");

        inc = findViewById(R.id.increment);
        rs = findViewById(R.id.reset);
        tV = findViewById(R.id.textView);
        dec = findViewById(R.id.decrement);

    }

    public void increment(View view){
        count++;
        tV.setText(Integer.toString(count));
    }

    public void resetvalue(View view){
        count = 0;
        tV.setText(Integer.toString(count));
    }
    public void decrement(View view){
        count--;
        tV.setText(Integer.toString(count));
    }
}
