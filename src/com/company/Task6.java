package com.company;

public class Task6 {
    private int[][] arrayA = new int[4][2];
    private int[][] arrayB = new int[2][3];

    public Task6() {
        CreatingMatrix(this.arrayA);
        CreatingMatrix(this.arrayB);
    }

    public void CreatingMatrix(final int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
                System.out.print(matrix[i][j] + "   ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    public int[][] MultiplicationMatrix() throws RuntimeException{
        if(arrayA[0].length != arrayB.length)
            throw new RuntimeException("qwe");

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
            final Task6 A = new Task6();
            final int[][] multiMatrix = A.MultiplicationMatrix();
        }
        catch (final RuntimeException e){
            System.out.println(e);
        }
    }
}