package com.company;

/**
 * Created by karo on 7/28/15.
 */
public class GameBoard {

    private int [][] gameBoard;

    public static stateOfTheBoard state;
    public static typeOfSelection winner;

    public int getSelectionAtPosition(int x, int y){

        return gameBoard[x][y];

    }

    public void setSelectionAtPosition(boolean ifCross, int x, int y) {

        if (ifCross) {
            gameBoard[x][y] = 1;
        } else {
            gameBoard[x][y] = -1;
        };

    }

    public void setStateOfTheBoard(){

        if (isTheWinner(typeOfSelection.CIRCLE)) {

            state = stateOfTheBoard.SOLVED;
            winner = typeOfSelection.CIRCLE;

        } else if (isTheWinner(typeOfSelection.CROSS)){

            state = stateOfTheBoard.SOLVED;
            winner = typeOfSelection.CROSS;

        } else {

            state = stateOfTheBoard.UNSOLVED;
            winner = null;

        }

    };


    public boolean isTheWinner(typeOfSelection tos){

        int result=0;

        for (int i = 0; i < gameBoard.length ; i++) {



            for (int j = 0; j < gameBoard[0].length ; j++) {

                 result = gameBoard[i][j];

            }

         if((result)==gameBoard.length) {



         } else if (result==gameBoard.length*-1){


         }

         }
        }

        return true;
    };



enum typeOfSelection
{
    CROSS,
    CIRCLE;

}

enum stateOfTheBoard{

    SOLVED,
    UNSOLVED;
}


}
