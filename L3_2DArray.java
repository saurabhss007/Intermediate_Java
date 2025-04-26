package org.example;

public class L3_2DArray {
    public static void main(String[] args){
        //2D array declaration
        int[][] num = {{1,2,3,4}, {5,6,7,8}};

        System.out.println(num[1][1]);

        System.out.println(num.length);

        //for loop
        for(int i = 0; i < num.length; i++){
            for(int j = 0; j < num[i].length; j++){
                System.out.println(num[i][j]);
            }
        }

        //for each loop
        for(int[] i : num){
            for(int j : i){
                System.out.println(j);
            }

        }

    }
}
