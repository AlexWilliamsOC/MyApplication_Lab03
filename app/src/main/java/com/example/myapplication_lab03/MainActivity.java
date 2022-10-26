package com.example.myapplication_lab03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Metodo boton autenticarse
    public void Autenticarse(View view){
        Intent autenticarse = new Intent(this, Activity_Login.class);
        startActivity(autenticarse);
    }

}