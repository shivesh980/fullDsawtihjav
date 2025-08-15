public class findmininarray {
    public static void main(String[] args) {
        int num[]={12,21,3,45,124,3,5,0};
        System.out.println(findmin(num));
    }
    static int findmin(int num[])
    {
        if(num.length==0)
        return Integer.MAX_VALUE;
        int min=num[0];
        for(int i:num)
        {
            if(i<min)
            {
                min=i;
            }
        }
        return min;
    }
}
