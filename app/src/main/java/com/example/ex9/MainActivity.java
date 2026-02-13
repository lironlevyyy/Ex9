package com.example.ex9;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText etn;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etn = findViewById(R.id.etn);
        btn = findViewById(R.id.btn);
    }

    public void clickme(View view) {
        String input = etn.getText().toString();


        if (!input.isEmpty()) {

                int num = Integer.parseInt(input);

                if (num % 7 == 0) {
                    btn.setText("BOOM!");
                } else {
                    btn.setText(String.valueOf(num));
                }



        }
    }
}

