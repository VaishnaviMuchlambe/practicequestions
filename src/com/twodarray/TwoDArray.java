package com.twodarray;
// two dimensional array
public class TwoDArray {
    public static void main(String[] args) {
        int a[][] = {{1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}};

        for (int i = 0; i < a.length; ++i) {
            for (int j = 0; j < a[i].length; ++j) {
                if (i == 0&&j==0 ||i==1&&j==1 ||i==2 && j == 2) {
                    a[i][j] = 0;
                }
            }
        }
        // ...code to display content of an array
        for (int i = 0; i < a.length; ++i) {
            for (int j = 0; j < a[i].length; ++j) {
                System.out.print(a[i][j] + "    ");
            }
            System.out.println(); // Print a newline after each row
        }
    }
}
