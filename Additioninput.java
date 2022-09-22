package Addition;
import java.util.Scanner;

public class Additioninput {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        System.out.println("Summe: " + add(n1,n2));
    } 
    public static int add(int n1, int n2) { 
        return n1+n2; 
    
    }
}
