package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b;
    EditText E;
    TextView T;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        b =(Button) findViewById(R.id.hButton);
        E = (EditText) findViewById(R.id.personName);
        T=(TextView) findViewById(R.id.TextView);
        b.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
             String s=E.getText().toString();
             T.setText("Hello "+s);
             
            }
        });

    }


}