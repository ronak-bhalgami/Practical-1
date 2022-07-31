public class Class_6 {
    public void StringArray(String arr1[],String arr2[])
    {
        int N=arr1.length;
        int count=0;
        for (int i = 0; i < N; i++) {
            if(arr1[i].equals(arr2[0]))
            {
                count++;
            }
        }
        int NewLen=N-count;
        String ST[]=new String [NewLen];
        for (int i = 0; i < NewLen; i++) {
            for (int j = 0; j < N; j++) {
                if(!(arr1[j].equals(arr2[0])))
                {
                    ST[i]=arr1[j];
                    i++;
                }
            }
        }
        System.out.println("After removing Array 2");
        for (int i = 0; i <NewLen; i++) {
            System.out.print(ST[i]);
            System.out.print(" ");
        }
    }
}
