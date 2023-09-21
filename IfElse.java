
package javaapplication9;
import java.util.Scanner;
import java.util.Random;

public class IfElse {
    public static void main(String[] args){
        int sam=0,ram=0,pooja=0;
        Scanner in = new Scanner(System.in);
        Random ra=new Random();
        
        while(true)
        {
             System.out.print("Enter the Name : ");
             String name=in.next();
            if(name.equals("exit")){
                break;
            }
            System.out.println("dice");
            int val=ra.nextInt(4)+1;
            System.out.println(val);
            switch(val){
                case 1:
                    switch(name){
                        case "sam":sam+=1000;break;
                        case "ram":ram+=1000;break;
                        case "pooja":pooja+=1000;break;
                        
                    }
            
                    break;
            
                case 2:
                    switch(name){
                        case "sam":sam+=500;break;
                        case "ram":ram+=500;break;
                        case "pooja":pooja+=500;break;
                        
                    }
        
                   break;
        
                case 3:
                    switch(name){
                        case "sam":sam+=200;break;
                        case "ram":ram+=200;break;
                        case "pooja":pooja+=200;break;
                    }
    
                    break;
    
                case 4:
                    switch(name){
                        case "sam":sam+=100;break;
                        case "ram":ram+=100;break;
                        case "pooja":pooja+=100;break;
                        
                    }

                    break;
            }

                    
            
            System.out.println("value of ram is " +ram);
            System.out.println("value pf sam is " +sam);
            System.out.println("value of pooja is " +pooja);
            
        }
    
}
}
