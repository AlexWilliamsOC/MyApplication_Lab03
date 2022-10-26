package com.example.myapplication_lab03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class Activity_Menu extends AppCompatActivity {

    public class Postulante{
        String dni;
        String nombres;
        String apellidoPaterno;
        String apellidoMaterno;
        String fechaNacimiento;
        String colegioProcedencia;
        String carrera;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ArrayList<Postulante> postulantes = new ArrayList<Postulante>();
    }

    public void Nuevo(View view){
        Intent nuevo = new Intent(this, Activity_PostulanteRegistro.class);
        startActivity(nuevo);
    }

    public void PostulanteInfo(View view){
        Intent postulanteInfo = new Intent(this, Activity_PostulanteInfo.class);
        startActivity(postulanteInfo);
    }


    public void Listar(View view){
        Intent listar = new Intent(this, Activity_Listar.class);
        startActivity(listar);
    }
}