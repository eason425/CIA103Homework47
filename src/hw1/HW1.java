package hw1;

public class HW1 {
    public static void main (String [] args) {
    	
        int num1 = 12 ,  num2 = 6 ; 
       
        String s1 = "和等於" , s2 = "積等於"  ;
        
        System.out.println(s1 + (num1 + num2));
        
        System.out.println(s2+(num1 * num2));
       
      
    
        int num3 = 200 , num4 = 12 , num5 = num3 / num4 , num6 = num3 % num4 ;
    
        String s3 = "200蛋是" , s4= "盒" , s5="顆";  
    
        System.out.println(s3 + num5 + s4 + num6 + s5);
       
    }
} 
