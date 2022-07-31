//This program is done by Ronak Bhalgami(21CE009)
public class Class_4 {
    public void arr123(int arr[])
    {
        int n=arr.length;
        int flag = 0;
        for (int i = 0; i < n; i++)
        {
            if (arr[i]==1) 
            {
                if(arr[i+1]==2)
                {
                    if (arr[i+2]==3) 
                    {
                        flag = 1;
                        break;
                    }
                }
            }
            
        }
        if(flag==1)
                System.out.println("True");
        else
            System.out.println("False");
    }
}
