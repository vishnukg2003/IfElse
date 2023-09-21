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
public class Login {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter your role : ");
        String role=in.next();
        switch(role){
            case "HR":{
                System.out.println("Welcome Tom");
                Scanner out=new Scanner(System.in);
                System.out.print("Enter username : ");
                String un=out.next();
                System.out.print("Enter password : ");
                String pass=out.next();
                if(un.equals("tom")&&pass.equals("tom1234")){
                    System.out.println("login Successful");
                }
                else{
                    System.out.println("login Unsuccessful");
                }
                break;
            }
            case "Employee":{
                    System.out.println("Welcome Jerry");
                    Scanner hu=new Scanner(System.in);
                    System.out.print("Enter username : ");
                    String us=hu.next();
                System.out.print("Enter password : ");
                String pss=hu.next();
                if(us.equals("jerry")&&pss.equals("jerry1234")){
                    System.out.println("login Successful");
                }
                else{
                    System.out.println("login Unsuccessful");
                }
            }
        }
    
}
}
