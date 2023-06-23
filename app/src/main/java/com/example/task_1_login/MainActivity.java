package com.example.task_1_login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void limpiar (View view){

        EditText usuario = (EditText)findViewById(R.id.txtnombre);
        EditText apellido = (EditText)findViewById(R.id.txtapellido);
        EditText ciudad = (EditText)findViewById(R.id.txtciudad);
        EditText email = (EditText)findViewById(R.id.txtemail);
        EditText telefono = (EditText)findViewById(R.id.txttelefono);
        EditText fecha = (EditText)findViewById(R.id.txtfecha);
        RadioButton masculino = (RadioButton)findViewById(R.id.btmasculino);
        RadioButton femenino = (RadioButton)findViewById(R.id.btfemenino);
        usuario.setText("");
        apellido.setText("");
        ciudad.setText("");
        email.setText("");
        telefono.setText("");
        fecha.setText("");
        masculino.setText("");
        
    }

    public void enviar (View view){

        EditText usuario = (EditText)findViewById(R.id.txtnombre);
        EditText apellido = (EditText)findViewById(R.id.txtapellido);
        EditText ciudad = (EditText)findViewById(R.id.txtciudad);
        EditText email = (EditText)findViewById(R.id.txtemail);
        EditText telefono = (EditText)findViewById(R.id.txttelefono);
        EditText fecha = (EditText)findViewById(R.id.txtfecha);
        String  Usuario, Apellido, Ciudad, Email,Telefono, Fecha;
        Usuario = usuario.getText().toString();
        Apellido = apellido.getText().toString();
        Ciudad = ciudad.getText().toString();


    }


}