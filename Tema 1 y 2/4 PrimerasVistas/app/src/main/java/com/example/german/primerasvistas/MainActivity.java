package com.example.german.primerasvistas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void primeras_vistas(View view){

        setContentView(R.layout.primeras_vistas);
    }

    public void relative_layout(View view){

        setContentView(R.layout.relative_layout);
    }

    public void table_layout(View view){

        setContentView(R.layout.table_layout);
    }


    public void linear_layout(View view){

        setContentView(R.layout.linear_layout);
    }

    public void volver(View view){
        setContentView(R.layout.activity_main);
    }

}
