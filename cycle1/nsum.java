import java.util.*;
public class nsum {
    public static void main(String args[]){
    System.out.println("Enter the limit:");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum = 0;
    int i;
    for(i=1;i<=n;i++){
        sum = sum+i;
    }
    System.out.println("The sum of "+n+" numbers is: "+sum);
}
    
    
}
