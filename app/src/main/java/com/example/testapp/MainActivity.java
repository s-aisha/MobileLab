package com.example.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MainActivity extends AppCompatActivity {

    private Button myButton;
    private TextView ShowText;
    private EditText entername;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myButton = findViewById(R.id.button2);
        entername = findViewById(R.id.editText);
        myButton.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View v){

                String name = entername.getText().toString();

                ShowText.setText("Welcome to the Android! " + name);
            }
        });
        ShowText = findViewById(R.id.textView);



    }
}
