package com.example.myapplication_lab03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Activity_PostulanteRegistro extends AppCompatActivity {

    private EditText txtDNI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_postulante_registro);
        txtDNI = findViewById(R.id.txtDNI);
    }

    public void Registrar(View view){
        Intent i = new Intent(this, Activity_Listar.class);
        i.putExtra("dni", txtDNI.getText().toString());
        startActivity(i);
    }
}