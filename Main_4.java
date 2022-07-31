//This program is done by Ronak Bhalgami(21CE009)
import java.util.Scanner;
public class Main_4 {
    public static void main(String[] args) {
        System.out.println("Enter size of array : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elemrnts of array : ");
        for (int i = 0; i < n; i++) 
        {
            arr[i]=sc.nextInt();
        }
        Class_4 p =new Class_4();
        p.arr123(arr);
    }
}
