package com.example.tictactoe_201b249;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    boolean isWinnwe=false;//watch talk variable
    int imageClick=-1;

    int player=1;
    int [][]winningStates={{0,1,2},{3,4,5},{6,7,8}};
    int[]gameState={-1,-1,-1,-1,-1,-1,-1,-1,-1};
    public void load(View view )
    {
        if(isWinnwe==false && imageClick==-1) {
            ImageView v = (ImageView) view;
            int tag = Integer.parseInt(v.getTag().toString());
            if (player == 1) {
                v.setImageResource(R.drawable.cross);
                gameState[tag] = player;
                Toast.makeText(this, "on" + " " + tag + " " + "Cross", Toast.LENGTH_SHORT).show();
                player = 0;

            } else {
                v.setImageResource(R.drawable.zero);
                gameState[tag] = player;

                Toast.makeText(this, "on" + " " + tag + " " + "zero", Toast.LENGTH_SHORT).show();
                player = 1;
            }
            for (int i = 0; i < winningStates.length; i++) {
                if (gameState[winningStates[i][0]] == gameState[winningStates[i][1]] && gameState[winningStates[i][1]] == gameState[winningStates[i][2]] && gameState[winningStates[i][0]] > -1) {
                    Toast.makeText(this, "winner is " + (player == 0 ? 1 : 0), Toast.LENGTH_SHORT).show();
                }
            }
        }

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}