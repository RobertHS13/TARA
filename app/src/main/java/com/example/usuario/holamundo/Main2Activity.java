package com.example.usuario.holamundo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private TextView c1;
    @Override

    ////android.support.constraint.ConstraintLayout
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().hide();
        setTitle("TARA");
        c1=(TextView)findViewById(R.id.c1);
    }

    public void una(View view) {
        c1.setText("Número de coronas: 1");
    }

    public void dos(View view) {
        c1.setText("Número de coronas: 2");
    }

    public void tres(View view) {
        c1.setText("Número de coronas: 3");
    }

    public void cuatro(View view) {
        c1.setText("Número de coronas: 4");
    }

    public void cinco(View view) {
        c1.setText("Número de coronas: 5");
    }
}
