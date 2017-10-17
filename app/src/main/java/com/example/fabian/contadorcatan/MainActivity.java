package com.example.fabian.contadorcatan;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btAddOne;
    private Button btRemoveOne;
    private Button btAddTwo;
    private Button btRemoveTwo;
    private Button btAddThree;
    private Button btRemoveThree;
    private Button btAddFour;
    private Button btRemoveFour;

    private TextView tvScoreOne;
    private TextView tvScoreTwo;
    private TextView tvScoreThree;
    private TextView tvScoreFour;

    private int scoreOne;
    private int scoreTwo;
    private int scoreThree;
    private int scoreFour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btAddOne = (Button) findViewById( R.id.bt_add_player_one );
        btRemoveOne =(Button) findViewById( R.id.bt_remove_player_one );
        btAddTwo = (Button) findViewById( R.id.bt_add_player_two );
        btRemoveTwo = (Button) findViewById( R.id.bt_remove_player_two );
        btAddThree = (Button) findViewById( R.id.bt_add_player_three );
        btRemoveThree = (Button) findViewById( R.id.bt_remove_player_three );
        btAddFour = (Button) findViewById( R.id.bt_add_player_four );
        btRemoveFour = (Button) findViewById( R.id.bt_remove_player_four );

        tvScoreOne = (TextView) findViewById( R.id.tv_score_one );
        tvScoreTwo = (TextView) findViewById( R.id.tv_score_two );
        tvScoreThree = (TextView) findViewById( R.id.tv_score_three );
        tvScoreFour = (TextView) findViewById( R.id.tv_score_four );

        resetScores();
        playerOneControl();
        playerTwoControl();
        playerThreeControl();
        playerFourControl();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /** Metodo para poner las puntuaciones a 0
     *
     */
    private void resetScores(){

        scoreOne = 0;
        tvScoreOne.setText( String.valueOf( scoreOne ) );
        scoreTwo = 0;
        tvScoreTwo.setText( String.valueOf( scoreTwo ) );
        scoreThree= 0;
        tvScoreThree.setText( String.valueOf( scoreThree ) );
        scoreFour = 0;
        tvScoreFour.setText( String.valueOf( scoreFour ) );

    }

    private void playerOneControl(){

        btAddOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreOne++;
                tvScoreOne.setText( String.valueOf( scoreOne ) );
            }
        });

        btRemoveOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreOne--;
                tvScoreOne.setText( String.valueOf( scoreOne ) );
            }
        });
    }

    private void playerTwoControl(){

        btAddTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTwo++;
                tvScoreTwo.setText( String.valueOf( scoreTwo ) );
            }
        });

        btRemoveTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTwo--;
                tvScoreTwo.setText( String.valueOf( scoreTwo ) );
            }
        });
    }

    private void playerThreeControl(){

        btAddThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreThree++;
                tvScoreThree.setText( String.valueOf( scoreThree ) );
            }
        });

        btRemoveThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreThree--;
                tvScoreThree.setText( String.valueOf( scoreThree ) );
            }
        });
    }

    private void playerFourControl(){

        btAddFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreFour++;
                tvScoreFour.setText( String.valueOf( scoreFour ) );
            }
        });

        btRemoveFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreFour--;
                tvScoreFour.setText( String.valueOf( scoreFour ) );
            }
        });
    }
}
