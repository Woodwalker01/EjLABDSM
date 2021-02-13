package com.example.ejercicio1222021;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.EditText;
import android.view.View;
import android.os.Bundle;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    private EditText nota1, nota2, nota3, nota4,nombretxt;
    int n1, n2, n3, n4;
    float promedio;
    String resultado,nom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nota1 = (EditText) findViewById(R.id.not1);
        nota2 = (EditText) findViewById(R.id.not2);
        nota3 = (EditText) findViewById(R.id.not3);
        nota4 = (EditText) findViewById(R.id.not4);
        nombretxt=(EditText) findViewById(R.id.nameAlumno);
    }

    public void calcular(View view){
        n1 = Integer.parseInt(nota1.getText().toString());
        n2 = Integer.parseInt(nota2.getText().toString());
        n3 = Integer.parseInt(nota3.getText().toString());
        n4 = Integer.parseInt(nota4.getText().toString());

        promedio=(n1+n2+n3+n4)/4;
        if(promedio>7&&promedio<10){
            resultado= "Felicidades Continue Asi";
        }
        if(promedio>5&&promedio<7){
            resultado="Regular";
        }
        if(promedio<5){
            resultado="Reprobado";
        }
        Intent i = new Intent(this, resultadoact.class);
        i.putExtra("promedio",""+promedio);
        i.putExtra("resultado", resultado);
        i.putExtra("nombre",nombretxt.getText().toString());
        startActivity(i);
        }

    }