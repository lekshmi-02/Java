//To check whether a number is armstrong or not.
import java.util.*;
public class armstrong {
    public static void main(String args[]){
    System.out.println("Enter the number:");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int i,rem,result =0;
    int temp = n;
    while(n>0){
        rem = n%10;
        result = result + rem*rem*rem;
        n = n/10;
    }
    if(result==temp){
        System.out.println("The given number is an armstrong.");
    }
    else{
        System.out.println("The given number is not an armstrong");
    }
    

    
    
}
    
    
}