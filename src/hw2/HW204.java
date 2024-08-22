package hw2;

public class HW204 {
	
	public static void main (String[]args){
		
		int a = 1;
        int b = 3;

        System.out.print(a);

        for (int i = 1; i <= 9; i++) {
            a += b;   
            System.out.print(" " + a);
            b += 2;        
        }
	}

}
