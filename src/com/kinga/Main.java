package com.kinga;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TicTacToe logic = new TicTacToe();
        logic.printBoard();
        Random gen = new Random();
        int i = 0;
        while (!logic.isFinished()) {
//            if(i%2==0) {
//                int rowIndex = gen.nextInt(3);
//                int colIndex = gen.nextInt(3);
//                logic.move("x", rowIndex, colIndex);
//                logic.printBoard();
//                i++;
//            } else {
            Scanner value = new Scanner(System.in);
            Scanner rowIndex = new Scanner(System.in);
            Scanner colIndex = new Scanner(System.in);
            logic.move(value.nextLine(), rowIndex.nextInt(), colIndex.nextInt());
            logic.printBoard();
            i++;
            //  }

        }
        System.out.println("end game");
    }
}
