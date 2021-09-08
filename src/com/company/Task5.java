package com.company;

public class Task5 {
    private int[][] matrix = new int[4][5];

    public Task5() {
        CreatingMatrix();
    }

    public void CreatingMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = (int)(Math.random()*10);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }

    }
    public int[][] Transpose(){
        final int [][]array = new int[matrix[0].length][matrix.length];
        for(int i = 0;i <matrix[0].length;i++) {
            for (int j = 0; j < matrix.length; j++) {
                array[i][j] = matrix[j][i];
                System.out.print(array[i][j] + "   ");
            }
            System.out.println("");
        }
        return array;
    }

    public static void main(final String[] args) {
        final Task5 A = new Task5();
        final int[][] arrayAB = A.Transpose();

    }
}
