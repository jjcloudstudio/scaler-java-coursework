import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num_A = scn.nextInt();
        int num_B = scn.nextInt();

        int HCF = 0;
        int LCM = 0;

        int max_common_divisor = num_A * num_B; // i think i am doing it wrong please check and comment it

        for(int i=1; i<=max_common_divisor; i++){
            if(num_A%i==0 && num_B%i==0){
                HCF = i;
            }
        }

        System.out.println(HCF);
    }
}
