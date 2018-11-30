package com.example.jay.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private android.widget.Button buttonList[][];
    private TextView text;
    private TicTacToeBoard board;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        board = new TicTacToeBoard();
        buttonList = new android.widget.Button[3][3];
        text = (TextView)findViewById(R.id.TextAlert);
        buttonList[0][0] = findViewById(R.id.button11);
        buttonList[0][1] = findViewById(R.id.button12);
        buttonList[0][2] = findViewById(R.id.button13);
        buttonList[1][0] = findViewById(R.id.button21);
        buttonList[1][1] = findViewById(R.id.button22);
        buttonList[1][2] = findViewById(R.id.button23);
        buttonList[2][0] = findViewById(R.id.button31);
        buttonList[2][1] = findViewById(R.id.button32);
        buttonList[2][2] = findViewById(R.id.button33);

    }
    public void Button11ActionPerformed( View view) {//GEN-FIRST:event_Button11ActionPerformed
        // TODO add your handling code here:
        handleMove(0, 0);
    }//GEN-LAST:event_Button11ActionPerformed

    public void Button12ActionPerformed( View view) {//GEN-FIRST:event_Button12ActionPerformed
        // TODO add your handling code here:
        handleMove(0, 1);
    }//GEN-LAST:event_Button12ActionPerformed

    public void Button13ActionPerformed( View view) {//GEN-FIRST:event_Button13ActionPerformed
        // TODO add your handling code here:
        handleMove(0, 2);
    }//GEN-LAST:event_Button13ActionPerformed

    public void Button21ActionPerformed(View view) {//GEN-FIRST:event_Button21ActionPerformed
        // TODO add your handling code here:
        handleMove(1, 0);
    }//GEN-LAST:event_Button21ActionPerformed

    public void Button22ActionPerformed(View view) {//GEN-FIRST:event_Button22ActionPerformed
        // TODO add your handling code here:
        handleMove(1, 1);
    }//GEN-LAST:event_Button22ActionPerformed

    public void Button23ActionPerformed(View view) {//GEN-FIRST:event_Button23ActionPerformed
        // TODO add your handling code here:
        handleMove(1, 2);
    }//GEN-LAST:event_Button23ActionPerformed

    public void Button31ActionPerformed(View view) {//GEN-FIRST:event_Button31ActionPerformed
        // TODO add your handling code here:
        handleMove(2, 0);
    }//GEN-LAST:event_Button31ActionPerformed

    public void Button32ActionPerformed(View view) {//GEN-FIRST:event_Button32ActionPerformed
        // TODO add your handling code here:
        handleMove(2, 1);
    }//GEN-LAST:event_Button32ActionPerformed

    public void Button33ActionPerformed(View view) {//GEN-FIRST:event_Button33ActionPerformed
        // TODO add your handling code here:
        handleMove(2, 2);
    }//GEN-LAST:event_Button33ActionPerformed

    public void ResetButtonActionPerformed(View view) {//GEN-FIRST:event_ResetButtonActionPerformed
        // TODO add your handling code here:

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttonList[i][j].setText("");
                buttonList[i][j].setEnabled(true);
            }
        }


        text.setText("X turn");

        board.reset();
    }//GEN-LAST:event_ResetButtonActionPerformed


    private void handleMove(int row, int col) {
        board.makeMove(row, col);
        buttonList[row][col].setText(board.givePlayer1Turn());

        if (board.checkWin(row, col).equals(board.givePlayer1Turn())) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    buttonList[i][j].setEnabled(false);
                }
            }
            text.setText(board.givePlayer1Turn() + " Wins!");
        } else if (board.checkWin(row, col).equals("tied")) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    buttonList[i][j].setEnabled(false);
                }
            }
            text.setText("There is a Tie!");
        } else {
            board.nextTurn();
            text.setText(board.givePlayer1Turn() + " turn");
            buttonList[row][col].setEnabled(false);
        }

    }
}
