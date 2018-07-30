package com.corejava.TwoDementionalArray;

import java.util.ArrayList;
import java.util.Arrays;

//Find the maximum value in each row and each column;//
public class Java2dArray {


    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int sum = 0;
        int value = 0;
        int value1 = 0;
        int[][] gridCopy = new int[grid.length][grid.length];
        int[][] newGrid = new int[grid.length][grid.length];
        int[][] substracion = new int[newGrid.length][newGrid.length];
        ArrayList<Integer> maxI = new ArrayList<>();
        ArrayList<Integer> maxJ = new ArrayList<>();

        for (int row = 0; row < gridCopy.length; row++) {
            for (int column = 0; column < gridCopy[row].length; column++) {
            gridCopy[row][column] = grid[row][column];
            }
        }

        for (int row = 0; row < gridCopy.length; row++) {
            for (int column = 0; column < gridCopy[row].length; column++) {

                if (gridCopy[row][0] < gridCopy[row][column]) {
                    gridCopy[row][0] = gridCopy[row][column];
                    value = gridCopy[row][column];
                } else {
                    value = gridCopy[row][0];
                }
            }
            maxJ.add(value);
        }

        for (int column = 0; column < gridCopy.length; column++) {
            for (int row = 0; row < gridCopy[column].length; row++) {
                if (gridCopy[0][column] < gridCopy[row][column]) {
                    gridCopy[0][column] = gridCopy[row][column];
                    value1 = gridCopy[row][column];
                } else {
                    value1 = gridCopy[0][column];
                }
            }
            maxI.add(value1);
        }

        for (int row = 0; row < gridCopy.length; row++) {
            for (int column = 0; column < gridCopy[row].length; column++) {
                int comparetor = Math.min(maxJ.get(row), maxI.get(column));
                newGrid[row][column] = comparetor;
                substracion[row][column] = newGrid[row][column]-grid[row][column];
                sum = sum + substracion[row][column];
            }
        }
        System.out.println("maxI: " + maxI);
        System.out.println("maxJ: " + maxJ);
        System.out.println("New grid looks like: " + Arrays.deepToString(newGrid));
        System.out.println("grid looks like: " + Arrays.deepToString(grid));
        System.out.println("subtraction looks like: " + Arrays.deepToString(substracion));
        System.out.println("sum: " + sum);
        return sum;
        }

}
