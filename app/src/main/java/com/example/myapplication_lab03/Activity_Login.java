package com.example.myapplication_lab03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Activity_Login extends AppCompatActivity {

    private EditText edtUsuario;
    private EditText edtPassword;
    private TextView txtMensaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    //Metodo boton anterior
    public void anterior(View view){
        Intent anterior = new Intent(this, MainActivity.class);
        startActivity(anterior);
    }
    /*
    EditText edtUsuario = findViewById(R.id.edtUsuario);
    EditText edtPassword = findViewById(R.id.edtPassword);
    TextView txtMensaje = findViewById(R.id.txtMensaje);
    */

    //Metodo boton login
    public void Login(View view){
        //Intent login = new Intent(this, Activity_Menu.class);
        //startActivity(login);
        edtUsuario = findViewById(R.id.edtUsuario);
        edtPassword = findViewById(R.id.edtPassword);
        txtMensaje = findViewById(R.id.txtMensaje);

        String usuario = edtUsuario.getText().toString();
        String password = edtPassword.getText().toString();

        if(usuario.equals("test@gmail.com") && password.equals("1234")){
            txtMensaje.setText("Autentificacion valida");
            Intent login = new Intent(this, Activity_Menu.class);
            startActivity(login);
        } else{
            txtMensaje.setText("Autentificacion no valida");
        }

    }
}