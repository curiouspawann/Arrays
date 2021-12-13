package com.company;

public class WaveArray {

    public static void convertToWave(int arr[], int n){
        int temp = 0;
        for(int i = 0; i<arr.length;i+=2){
            temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }

}
