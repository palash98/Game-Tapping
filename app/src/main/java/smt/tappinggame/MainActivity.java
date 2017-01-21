package smt.tappinggame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int scoreP1 = 0, scoreP2 = 0;
    TextView myAwesomeTextView;
    TextView myAwesomeTextView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // globally
        myAwesomeTextView = (TextView) findViewById(R.id.textView3);
        myAwesomeTextView1 = (TextView) findViewById(R.id.textView2);


//in your OnCreate() method

    }

    public void onClickPlayerTwo(View v) {
        scoreP2++;
        myAwesomeTextView.setText("Player 2 score " + scoreP2);

    }

    public void onClickPlayerOne(View v) {
        scoreP1++;
        myAwesomeTextView1.setText("Player 1 score " + scoreP1);
    }

}