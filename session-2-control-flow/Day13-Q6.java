import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int naturalNum = scn.nextInt();

        for(int i=4; i<=naturalNum; i+=4){
            System.out.print(i+ " ");
        }
    }
}