import java.util.*;
public class factorial {
    public static void main(String args[]){
    System.out.println("Enter the limit:");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long factorial = 1;
    int i;
    for(i=1;i<=n;i++){
        factorial = factorial*i;
    }
    System.out.println("The factorial is: "+factorial);
}
    
    
}
