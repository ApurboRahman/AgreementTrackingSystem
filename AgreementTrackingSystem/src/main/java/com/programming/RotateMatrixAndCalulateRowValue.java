package com.programming;

import java.util.Scanner;

/**
 * Created by ${Apurbo} on 4/4/2018.
 */
public class RotateMatrixAndCalulateRowValue {
    public static void main(String[] args) {
        int m = 7, n = 8;
        // int matirx[][] = new int[m][n];
        int[][] matirx = new int[][]{
                {5, 3, 8, 9, 4, 1, 3, -2},
                {4, 6, 0, 3, 6, 4, 2, 1},
                {4, -5, 3, 1, 9, 5, 6, 6},
                {3, 7, 5, 3, 2, 8, 9, 4},
                {5, 3, -3, 6, 3, 2, 8, 0},
                {5, 7, 5, 3, 3, -9, 2, 2},
                {0, 4, 3, 2, 5, 7, 5, 4}

        };
        int rows = matirx.length;
        int columns = matirx[0].length;
        System.out.println("rows: " + rows);
        System.out.println("columns: " + columns);
        System.out.println("[00]: " + matirx[0][0]);
        System.out.println("[05]: " + matirx[0][5]);
        System.out.println(calculateMartix(matirx));

/*
        int newMatirx[][] = new int[matirx.length-2][matirx[0].length-1];
        int newRows = matirx.length-2;
        int newColumns = matirx[0].length-1;
        for(int i = 0;i<newRows;i++){
            for (int j = 0;j<newColumns;j++){
                newMatirx[i][j]=matirx[i+1][j+1];
            }
        }

        System.out.println("[00]: "+newMatirx[0][0]);
        //System.out.println("[40]: "+newMatirx[4][0]);

        System.out.println("Original Matrix :");
        printMatrix(newMatirx);

        int[][] rotatedMatrix = rotateMatrix(newMatirx);
        // int[][] rotatedMatrix = rotateMatrixBy90DegreeClockwise(matrix);
        System.out.println("Rotated Matrix :");
        printMatrix(rotatedMatrix);
       */

        /*
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matirx[i][j] = scanner.nextInt();
            }
        }
        scanner.close();

        */
    }

    static int calculateMartix(int[][] matirx) {
        int total = 0;
        int rows = matirx.length;
        int columns = matirx[0].length;
        // int[][] rotatedMatrix = new int[][];
        for (int j = 0; j < columns; j++) {
            total += matirx[0][j];
        }
        if (rows > 2) {
            int newMatirx[][] = new int[matirx.length - 2][matirx[0].length - 1];
            int newRows = matirx.length - 2;
            int newColumns = matirx[0].length - 1;
            for (int i = 0; i < newRows; i++) {
                for (int j = 0; j < newColumns; j++) {
                    newMatirx[i][j] = matirx[i + 1][j + 1];
                }
            }

            int[][] rotatedMatrix = rotateMatrix(newMatirx);
            for (int j = 0; j < rotatedMatrix[0].length; j++) {
                total += rotatedMatrix[0][j];
            }
            int matrixLength = 1;
            while (matrixLength != 0) {
                int rowsNumber = rotatedMatrix.length - 1;
                int columnsNumber = rotatedMatrix[0].length - 1;
                if (rowsNumber != 0 && columnsNumber != 0) {
                    int matrixAfterDeleteFirstRow[][] = new int[rowsNumber][columnsNumber];
                    for (int i = 0; i < rotatedMatrix.length - 1; i++) {
                        for (int j = 0; j < rotatedMatrix[0].length - 1; j++) {
                            matrixAfterDeleteFirstRow[i][j] = rotatedMatrix[i + 1][j + 1];
                        }
                    }
                    if (matrixAfterDeleteFirstRow.length == 1) {
                        for (int j = 0; j < matrixAfterDeleteFirstRow[0].length; j++) {
                            total += rotatedMatrix[0][j];
                        }
                        matrixLength = 0;
                    } else {
                        rotatedMatrix = rotateMatrix(matrixAfterDeleteFirstRow);
                        for (int j = 0; j < rotatedMatrix[0].length; j++) {
                            total += rotatedMatrix[0][j];
                        }
                    }
                }else {
                    matrixLength = 0;
                }


            }
        }

        //if rows>1

        return total;
    }

    //rotateMatrixBy90DegreeCounterClockwise
    static int[][] rotateMatrix(int[][] matrix) {

        int totalRowsOfRotatedMatrix = matrix[0].length; //Total columns of Original Matrix
        int totalColumsOfRotatedMatrix = matrix.length; //Total rows of Original Matrix

        int[][] rotatedMatrix = new int[totalRowsOfRotatedMatrix][totalColumsOfRotatedMatrix];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                rotatedMatrix[(totalRowsOfRotatedMatrix - 1) - j][i] = matrix[i][j];
            }
        }
        return rotatedMatrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "   ");
            }
            System.out.println();
        }
    }
}
