package org.example.controllers;

import java.util.Random;

public class ScrambleWords {
    //This function takes 3 parameters(shuffles values between start position and end position),
    //indexes are being explicitly supplied
     public int[] scramble(int[] arr, int startIndex, int currentIndex ){
        if(startIndex >= currentIndex)
            return arr;

        Random rand = new Random();
        int temp;
        while(currentIndex>=startIndex + 1){
            int randomIndex =  rand.nextInt((currentIndex - startIndex)) + startIndex;
            temp=arr[randomIndex];
            arr[randomIndex] = arr[currentIndex];
            arr[currentIndex] = temp;
            currentIndex--;

        }

        return arr;
    }
    public void printOutput(int[] arr){
        for(int i = 0;i<arr.length;i++)
            System.out.print(" "+arr[i]);
    }
}
