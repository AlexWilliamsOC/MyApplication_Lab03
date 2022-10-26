package com.example.myapplication_lab03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activity_Listar extends AppCompatActivity {

    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar);

        tv1 = findViewById(R.id.tv1);

        String dato = getIntent().getStringExtra("dni");
        tv1.setText(dato);
    }
}