public class Class_8 {
    public void CheckAns(char Arr[])
    {
        char RightAns[] = {'D','B','D','C','C','D','A','E','A','D'};
        int count=0;
        for (int i = 0; i < RightAns.length; i++)
        {   
            if(RightAns[i]==Arr[i])
            {
                // System.out.println("Hello");
                // System.out.println(count++);
                count++;
            }
        }
        System.out.println("Correct answers : "+count);
        System.out.println("Wrong answers : "+(10-count));
    }
}
