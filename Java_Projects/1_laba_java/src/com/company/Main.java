package com.company;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[12];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 30) - 15);
            System.out.println(array[i]);
        }
        bubbleSort(array);
        System.out.println("\nSort array:\n");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void bubbleSort(int[] arr){
        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( arr[j] > arr[j+1] ){
                  int tmp = arr[j];
                  arr[j] = arr[j+1];
                  arr[j+1] = tmp;
                }
            }
        }
    }
}


