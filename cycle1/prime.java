//program to check whether a number is prime or not.
import java.util.*;
public class prime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n =sc.nextInt();

        if(n==0|n==1){
            System.out.println(n+" is neither prime nor composite.");
        }
        int i;
        int b = 0;
        for(i=2;i<n/2;i++){
            if(n%i==0){
                b =1;
            }
        }
        if(b==1){
            System.out.println(n+"is a composite number.");
        }
        else{
            System.out.println(n+"is a prime number.");
        }
         

    }
    
}
