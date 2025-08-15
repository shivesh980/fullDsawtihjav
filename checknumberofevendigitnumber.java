public class checknumberofevendigitnumber
{
    public static void main(String[] args) {
        int num[]={12,13,23,332332,332,443};
        System.out.println(numbercount(num));
        int a= (int) (Math.log10(num[0])+1);
        System.out.println(a);
    }
    static int numbercount(int num[])
    {
        int count=0;
        for(int i=0;i<num.length;i++)
        {
            int res=Integer.toString(num[i]).length();
            if(res%2==0)
             count++;
        }
        return count;
    }
}