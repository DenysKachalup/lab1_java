package com.company;

public class Task6 {
    private int[][] arrayA;
    private int[][] arrayB;

    public Task6(final int rolA,final int col,final int colB) {
        this.arrayA = creatingMatrix(rolA,col);
        this.arrayB = creatingMatrix(col,colB);
    }

    public int[][] creatingMatrix(final int rol,final int col) {
        int [][]matrix = new int[rol][col];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = (int)(Math.random()*10);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
        return matrix;
    }

    public int[][] multiplicationMatrix() throws RuntimeException{
        if(arrayA[0].length != arrayB.length)
            throw new RuntimeException("Error");

        final int[][] result = new int[arrayA.length][arrayB[0].length];

        for(int i=0;i<arrayA.length;i++)
        {
            for(int j=0;j<arrayB[0].length;j++)
            {
                for(int k=0;k<arrayA[0].length;k++)
                {
                    result[i][j] +=arrayA[i][k] * arrayB[k][j];
                }
            }
        }
        return result;
    }

    public static void main(final String[] args) {

        try {
            final Task6 task = new Task6(4,2,5);
            final int[][] multiMatrix = task.multiplicationMatrix();
        }
        catch (final RuntimeException e){
            System.out.println(e);
        }
    }
}