package BasicSyntax;

import java.math.BigDecimal;
import java.util.Scanner;

public class P03ExactSumofRealNumbers {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int broi=Integer.parseInt(scanner.nextLine());
        BigDecimal result=new BigDecimal("0");
        for(int i=0;i<broi;i++){
            String num_string=scanner.nextLine();
            BigDecimal obekt=new BigDecimal(num_string);
            result=result.add(obekt);
        }
        System.out.println(result);

    }
}
