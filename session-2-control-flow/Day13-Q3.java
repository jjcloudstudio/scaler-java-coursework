import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int naturalNum = scn.nextInt();

        int i = 1;
        while (naturalNum > 0) {
            System.out.print(naturalNum+ " ");
            naturalNum--;
        }
    }
}