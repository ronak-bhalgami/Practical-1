public class Class_5 {
    public void IsSub(String st1,String st2)
    {
        int count=0;
        for (int i = 0; i < st1.length()-1; i++) {
            if(st1.charAt(i)==st2.charAt(i) && st1.charAt(i+1)==st2.charAt(i+1))
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
