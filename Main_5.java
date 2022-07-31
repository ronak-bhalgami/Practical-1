import java.util.Scanner;

public class Main_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string 1 : ");
        String st1=sc.next();
        System.out.println("Enter string 2 :");
        String st2=sc.next();
        Class_5 p= new Class_5();
        p.IsSub(st1, st2);
    }
}
