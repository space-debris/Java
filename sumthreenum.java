import java.util.Scanner;
public class sumthreenum{
    public static double sum(double a, double b, double c){
        double sum = a+b+c;
        return sum;
    }
    public static void main(String[] args) {
        double x,y,z,sum;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number ");
        x = sc.nextInt();
        System.out.print("enter second number ");
        y = sc.nextInt();
        System.out.print("enter third number ");
        z = sc.nextInt();
        sum = sum(x,y,z);
        System.out.print(("sum of three numbers is "+sum));
    }
}