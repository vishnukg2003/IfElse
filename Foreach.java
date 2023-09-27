
package javaapplication9;


public class Foreach {

    public static void main(String[] args) {
        int[] ary = {6, 7545, 5, 46, 67, 76, 55};
        
        int max=ary[0],min=ary[0];
        for(int val:ary)
            
  {
      if(max<val){
          max=val;
          
      }
         if(min>val){
             min=val;
         }   
              
  }
        System.out.println(max);
        System.out.println(min);

}
}
