package com.example.jay.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//*


import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

/**
 * @author Jay
 */
public class TicTacToeUI extends Activity {
    private TicTacToeBoard board = new TicTacToeBoard();
    private android.widget.Button buttonList[][] = new android.widget.Button[3][3];
    private TextView text = (TextView)findViewById(R.id.TextAlert);
    /**
     * Creates new form TicTacToeUI
     */

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

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

    private void Button11ActionPerformed() {//GEN-FIRST:event_Button11ActionPerformed
        // TODO add your handling code here:
        handleMove(0, 0);
    }//GEN-LAST:event_Button11ActionPerformed

    private void Button12ActionPerformed() {//GEN-FIRST:event_Button12ActionPerformed
        // TODO add your handling code here:
        handleMove(0, 1);
    }//GEN-LAST:event_Button12ActionPerformed

    private void Button13ActionPerformed() {//GEN-FIRST:event_Button13ActionPerformed
        // TODO add your handling code here:
        handleMove(0, 2);
    }//GEN-LAST:event_Button13ActionPerformed

    private void Button21ActionPerformed() {//GEN-FIRST:event_Button21ActionPerformed
        // TODO add your handling code here:
        handleMove(1, 0);
    }//GEN-LAST:event_Button21ActionPerformed

    private void Button22ActionPerformed() {//GEN-FIRST:event_Button22ActionPerformed
        // TODO add your handling code here:
        handleMove(1, 1);
    }//GEN-LAST:event_Button22ActionPerformed

    private void Button23ActionPerformed() {//GEN-FIRST:event_Button23ActionPerformed
        // TODO add your handling code here:
        handleMove(1, 2);
    }//GEN-LAST:event_Button23ActionPerformed

    private void Button31ActionPerformed() {//GEN-FIRST:event_Button31ActionPerformed
        // TODO add your handling code here:
        handleMove(2, 0);
    }//GEN-LAST:event_Button31ActionPerformed

    private void Button32ActionPerformed() {//GEN-FIRST:event_Button32ActionPerformed
        // TODO add your handling code here:
        handleMove(2, 1);
    }//GEN-LAST:event_Button32ActionPerformed

    private void Button33ActionPerformed() {//GEN-FIRST:event_Button33ActionPerformed
        // TODO add your handling code here:
        handleMove(2, 2);
    }//GEN-LAST:event_Button33ActionPerformed

    private void ResetButtonActionPerformed() {//GEN-FIRST:event_ResetButtonActionPerformed
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

    // End of variables declaration//GEN-END:variables
}
