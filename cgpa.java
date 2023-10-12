import java.util.Scanner;
public class cgpa {
    public static double cgpa(int a, int b, int c){
        double cgpa = (a+b+c)/30;
        return cgpa;
    }
    public static void main(String[] args){
        int a,b,c;
        double cgpa;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter marks in subject 1 ");
        a = sc.nextInt();
        System.out.print("enter marks in subject 2 ");
        b =  sc.nextInt();
        System.out.print("enter marks in subject 3 ");
        c = sc.nextInt();
        cgpa = cgpa(a,b,c);
        System.out.println("Your cgpa is "+cgpa);
    }
}
