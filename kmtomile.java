import java.util.*;
public class kmtomile {
    public static void main(String[] args){
        double km;
        System.out.print("Enter distance in km ");
        Scanner sc = new Scanner(System.in);
        km = sc.nextDouble();
        System.out.println("Distance in miles is "+ km*0.621371); 
    }
}
