package com.geekbrains.Home_Work_2;

public class Main {

    public static void main(String[] args) {                     //Задача 1
	int [] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] == 1){
                arr[i] = 0;
                System.out.print("[" + i + "]=" + arr[i] + " ");
            }
            else {
                arr[i] = 1;
                System.out.print("[" + i + "]=" + arr[i] + " ");
            }
        }
        System.out.println(" ");
        fillArray();
        System.out.println(" ");
        changeArray();
        System.out.println(" ");
        sqrArray();
        System.out.println(" ");
        MaxMinArray();
    }
    public static void fillArray(){                                //Задача 2
        int [] arr = new int[8];
        for (int i = 0, x = 0; i <arr.length ; i++, x = x + 3) {
            arr[i] = x;
            System.out.print("[" + i + "]=" + arr[i] + " ");
        }
    }
    public static void changeArray(){                             //Задача 3
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] < 6){
                arr[i] = arr[i] * 2;
            }
            System.out.print("[" + i + "]=" + arr[i] + " ");
        }
    }
    public static void sqrArray(){                               //Задача 4
        int [][] table = new int [4][4];
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j){
                    table[i][j] = 1;
                }else if (i + j == 3){
                    table[i][j] = 1;
                }
                System.out.print("[" + i + "]" + "[" + j + "]=" + table[i][j] + " ");
            }
        }
    }
    public static void MaxMinArray(){                            //Задача 5
        int[] arr = new int[5];
        int a = 0;
        int b = 10;
        for (int i = 0; i <5 ; i++) {
            arr[i] = a + (int) (Math.random()*b);
        }
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i <5 ; i++) {
            if (arr[i] > max){
                max = arr[i];
            }else if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Максимальное: "+ max + " Минимальное:" + min);
    }
}
