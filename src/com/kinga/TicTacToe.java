package com.kinga;

public class TicTacToe {
    private final int SIZE = 3; // final - mozna tylko raz zainicjalizowac, nie mozna zmienic
    private final String x = "x";
    private final String o = "o";
    private final String empty = "-";
    String[][] board;

    public TicTacToe() {
        init();
    }

    private void init() {
        board = new String[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = "-";
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean move(String symbol, int rowIndex, int colIndex) {

        if ((symbol.equals(x) || symbol.equals(o)) && board[rowIndex][colIndex].equals(empty)) {
            board[rowIndex][colIndex] = symbol;
            return true;
        } else {
            return false;
        }
    }

    public boolean isFinished() {
        if ((board[0][2].equals(board[1][1]) && board[0][2].equals(board[2][0]) || (board[0][0].equals(board[1][1])
                && board[0][0].equals(board[2][2]))) && (board[1][1] != "-")) {
            return true;
        }
        

        for (int i = 0; i < SIZE; i++) {

            if (board[i][0].equals(board[i][1]) && board[i][0].equals(board[i][2]) && (board[i][1] != "-")) {
                return true;
            } else if (board[0][i].equals(board[1][i]) && board[1][i].equals(board[2][i]) && (board[1][i] != "-")
                    && (board[1][i] != "-")) {
                return true;
            }
//
        }


        return false;
    }

}