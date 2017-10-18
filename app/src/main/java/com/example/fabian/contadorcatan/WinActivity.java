package com.example.fabian.contadorcatan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class WinActivity extends AppCompatActivity {

    private int winner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_win);

        // obtenemos el bundle
        Bundle b = getIntent().getExtras();
        // si este no es null
        if( b != null ){
            // obtiene el valor y lo guarda en la variable designada para el numero de jugador ganador
            winner = b.getInt( "winner" );
        }
    }
}
