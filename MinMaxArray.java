/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class MinMaxArray {
    public static void main(String[] args){
        int[] a={5,3,22,17};
        int min=a[0],max=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
            if(a[i]<min){
                min=a[i];
            }
           
            
    
    
}
         System.out.println("maximum value is " + max);
            System.out.println("minimum value is " + min);
    }
}