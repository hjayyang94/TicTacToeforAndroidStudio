package com.example.jay.test;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jay
 */


public class TicTacToeBoard
{
    private String player1Turn;
    private String[][] board = new String[3][3];
    private int movesLeft;

    public TicTacToeBoard ()
    {
        this.player1Turn = "X";
        movesLeft = 9;
    }


    public void nextTurn()
    {
        if(this.player1Turn.equals("X"))
            this.player1Turn = "O";
        else{
            this.player1Turn = "X";
        }
    }

    public void makeMove(int row, int col)
    {
        board[row][col] = this.player1Turn;
        movesLeft--;
    }
    public String checkWin(int row, int col)
    {
        if(board[row][0] == this.player1Turn
                && board[row][1] == this.player1Turn
                && board[row][2] == this.player1Turn){
            return this.player1Turn;
        }
        else if (board[0][col] == this.player1Turn
                && board[1][col] == this.player1Turn
                && board[2][col] == this.player1Turn){
            return this.player1Turn;
        }

        else if (board[0][0] == this.player1Turn
                && board[1][1] == this.player1Turn
                && board[2][2] == this.player1Turn){
            return this.player1Turn;
        }
        else if (board[0][2] == this.player1Turn
                && board[1][1] == this.player1Turn
                && board[2][0] == this.player1Turn){
            return this.player1Turn;
        }
        else if (movesLeft==0){
            return "tied";
        };

        //if win, true, else false

        return "continue";
    }



    public String givePlayer1Turn()
    {
        return this.player1Turn;
    }

    public void reset()
    {
        this.player1Turn = "X";
        this.movesLeft = 9;
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++)
            {
                board[i][j] = "";
            }
        }
    }

}
