import java.util.Scanner;

public class Main_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array 1 : ");
        int n=sc.nextInt();
        System.out.println("Enter array 1 :");
        String arr1[]=new String [n];
        for (int i = 0; i < arr1.length; i++) 
        {
            arr1[i]=sc.next();
        }
        String arr2[] =new String [1];
        System.out.println("Enter array 2 : ");
        arr2[0]=sc.next();
        Class_6 che = new Class_6();
        che.StringArray(arr1, arr2);
    }
}
