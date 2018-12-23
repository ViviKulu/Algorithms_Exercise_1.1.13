package com.company;

import java.util.Random;

public class Main {

//    Write a code fragment to print the transposition (rows and columns changed)
//    of a two-dimensional array with M rows and N columns.

    public static void main(String[] args) {
        // write your code here

        int x = 7;
        int y = 7;

        int[][] array = new int[x][y];
        int[][] transposed = new int[y][x];
        Random rand = new Random(20);
        System.out.println("Original matrix: ");
        System.out.println();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                int tempInt = rand.nextInt(10);
                array[i][j] = tempInt;
                transposed[j][i] = tempInt;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Transposed matrix: ");
        System.out.println();
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(transposed[i][j] + " ");
            }
            System.out.println();
        }
    }
}
