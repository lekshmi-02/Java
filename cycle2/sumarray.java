//Program to find sum  of elements of an array
import java.util.*;
public class sumarray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array limit:");
        int n = sc.nextInt();
        int[] a = new int[50];
        System.out.println("Enter the array elements:");
        
        int i,sum=0;
        for(i=0;i<n;i++){
            a[i] = sc.nextInt();
            sum = sum + a[i];
        }
        System.out.println("The sum of array elements is: "+sum);
    }
    
}
