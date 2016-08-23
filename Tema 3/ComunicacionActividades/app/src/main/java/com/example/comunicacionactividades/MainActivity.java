package com.example.comunicacionactividades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText entrada;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        entrada = (EditText) findViewById(R.id.entrada);
        resultado = (TextView) findViewById(R.id.resultado);
    }


    public void verificar(View view) {
        Intent intent = new Intent(this, Verificar.class);
        intent.putExtra("nombre", entrada.getText().toString());
        startActivityForResult(intent, 1234);
    }

    @Override
    protected void onActivityResult (int requestCode, int resultCode, Intent data){
        if (requestCode == 1234 && resultCode == RESULT_OK) {
            resultado.setText("Resultado: Aceptado");
        }
        else if (requestCode == 1234 && resultCode == RESULT_CANCELED) {
            resultado.setText("Resultado: Rechazado");
        }
    }


}
