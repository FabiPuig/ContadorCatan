package com.example.fabian.contadorcatan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class WinActivity extends AppCompatActivity {

    private int winner;
    private ImageView ivWinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_win);

        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);

        ivWinner = (ImageView) findViewById( R.id.iv_winner );

        // obtenemos el bundle
        Bundle b = getIntent().getExtras();
        // si este no es null
        if( b != null ){
            // obtiene el valor y lo guarda en la variable designada para el numero de jugador ganador
            winner = b.getInt( getString( R.string.saved_winner ) );
        }

        setWinner();
    }

    private void setWinner(){

        switch ( winner ){
            case 1 : ivWinner.setImageResource( R.drawable.one );
                break;
            case 2 : ivWinner.setImageResource( R.drawable.two );
                break;
            case 3 : ivWinner.setImageResource( R.drawable.three );
                break;
            case 4 : ivWinner.setImageResource( R.drawable.four );
                break;
            default:
                break;
        }
    }
}
