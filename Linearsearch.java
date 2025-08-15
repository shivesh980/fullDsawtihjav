class liner
{
    public static void main(String[] args) {
        int num[]={12,1223,23,12,0,43,67};
        int t=231;
        int result=linearsearch(num, t);
        System.out.println(result);
    }
    static int linearsearch(int num[],int target)
    {
        if(num.length==0)
          return -1;

        for(int i=0;i<num.length;i++)
        {
            if(num[i]==target)
            {
                return i;
            }
        }
        return -1;
    }
}