import java.util.Scanner;
public class greetings {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.print("enter your name ");
        String name = sc.nextLine();
        System.out.println("Hello "+name+", how are you");
    }
}
