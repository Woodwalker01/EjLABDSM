package com.example.ejercicio1222021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class resultadoact extends AppCompatActivity {

    String promedio,resultado,nombre;
private TextView name,prom,res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultadoact);
        Bundle bundle = getIntent().getExtras();
         promedio=bundle.getString("promedio");
         resultado=bundle.getString("resultado");
        nombre=bundle.getString("nombre");
        name=(TextView)findViewById(R.id.txtvname);
        prom=(TextView)findViewById(R.id.txtvnot);
        res=(TextView)findViewById(R.id.txtvresultado);
        name.setText(nombre);
        prom.setText(promedio);
        res.setText(resultado);


    }
}