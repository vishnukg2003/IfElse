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
public class Age {
    public static void main(String[] args){
        int a,b,c;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the age of a :");
        a=in.nextInt();
        System.out.print("Enter the age of b : ");
        b=in.nextInt();
        System.out.print("Enter the age of c : ");
        c=in.nextInt();
        if(a>b&&a>c){
            System.out.println("a is elder than b and c");
        }
        else if(a<b&&b>c){
            System.out.println("b is elder than a and b");
            
        }
        else{
            System.out.println("c is elder than a and b");
        }
    
}
}
