//To check whether a number is palindrome or not.
import java.util.*;
public class palindrome {
    public static void main(String args[]){
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev=0,r,i;
        int org = n;
        while(n>0){
            r = n%10;
            rev = (rev*10)+r;
            n = n/10;
        }
        if(rev==org){
            System.out.println("The given number is a palindrome");
        }
        else{
            System.out.println("The given number is not a palindrome");
        }
        

    }
    
}
