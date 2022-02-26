//Program to find the factors a number.
import java.util.*;
public class factors{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int i;
        System.out.println("The factors are:");
        for(i=1;i<=n;i++){
            if(n%i==0){
                
                System.out.println(i);
            }
        }
    }
}