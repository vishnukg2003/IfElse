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
public class Pyramid {
    public static void main(String[] args)
{
    Scanner inp=new Scanner(System.in);
    System.out.print("Enter the length :");
    int len=inp.nextInt();
    for(int r=1;r<=len;r++){
        for(int s=1;s<=len-r;s++){
            System.out.print(" ");
        }
        for(int c=1;c<=r+(r-1);c++){
            System.out.print("*");
        }
        System.out.println();
    }


    
}
}
