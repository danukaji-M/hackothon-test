import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        sum();
    }
    public static void sum(){
         Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first Number");
        double num1 = scanner.nextDouble();
        
        System.out.println("Enter Second Number");
        double num2 = scanner.nextDouble();
        double sumoftwo = num1+num2;
        System.out.println("Sum Of :" + num1 +"+"+ num2+"=" +sumoftwo );
    }
}
