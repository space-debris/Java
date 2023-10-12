import java.util.Scanner;
public class isinteger {
    public static void main(String[] args){
        double num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to check ");
        num = sc.nextDouble();
        if (num % 1 == 0){
            System.out.println("The number you entered is integer");
        }
        else{
            System.out.println("The number you enetered is not integer");
        }
    }
}
