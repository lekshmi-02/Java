//Program to find the smallest element in an array.
import java.util.*;
public class smallest {
    public static void main(String args[]){
        int i,small;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array limit:");
        int n = sc.nextInt();
        
        int[] a = new int[100];
        
        System.out.println("Enter the array elements:");
        for(i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        small = a[0];
        for(i=0;i<n;i++){
            if(small>a[i]){
                small = a[i];
            }
        }
        System.out.println("The smallest element in this array is "+small);

    }
    
}
