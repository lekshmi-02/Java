//Program to print fibonacci series
import java.util.*;
public class Fib {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit:");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int i;
        int c;
        System.out.println("The fibonacci series is:");
        System.out.println(a);
        System.out.println(b);
        
        for(i=1;i<n-1;i++){
            
            c = a+b;
            a = b;
            b = c;
            System.out.println(c);
        }
        

    }
    
}
