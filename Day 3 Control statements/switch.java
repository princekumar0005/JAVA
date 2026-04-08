import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
    
        System.out.print("Enter your nanumber: ");
        int i = scanner.nextInt();
        
        
        

        switch (i) {
            case 1:
                System.out.println("i is one");
                break; 
            case 2:
                System.out.println("i is two");
                break;
            case 3:
                System.out.println("i is three");
                break;
            default:
                System.out.println("i is greater than 3"); 
                break;
            
        }
        scanner.close();
    }
}

