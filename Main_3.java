//This program is done by Ronak Bhalgami(21CE009)
import java.util.Scanner;

public class Main_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A : ");
        int A = sc.nextInt();
        System.out.print("Enter B : ");
        int B = sc.nextInt();
        Class_3 check=new Class_3();
        check.LastDig(A, B);
    }
}
