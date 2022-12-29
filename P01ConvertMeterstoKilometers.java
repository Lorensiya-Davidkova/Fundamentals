package BasicSyntax;

import java.util.Scanner;

public class P01ConvertMeterstoKilometers {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int metres=Integer.parseInt(scanner.nextLine());
        double kilometers=(double)metres/1000;
        System.out.printf("%.2f",kilometers);


    }
}
