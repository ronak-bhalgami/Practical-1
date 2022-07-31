import java.lang.Math;
public class StarPyramid {
    public static void main(String[] args) {
        int n=9;
        for(int i=0;i<n;i++)
        {
            for (int j = i; j < n; j++)
            {
                System.out.printf("    ");
            }
            for (int j = 0; j < i-1; j++) 
            {
                double A=Math.pow(2, j);
                System.out.printf("%4d",(int)A);
            }
            for (int j = i-1; j>=0; j--) 
            {
                double A=Math.pow(2, j);
                System.out.printf("%4d",(int)A);
            }
            System.out.println();
        }
    }
}
