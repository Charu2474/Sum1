import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        int a=t.nextInt();
        int b=t.nextInt();
        int c=t.nextInt();
        int sum=0,tot=0;
        sum=c+b;
        tot=a-sum;
        System.out.println(tot);
    }
}
