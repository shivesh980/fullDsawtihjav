public class rangesearchlinear {
    public static void main(String[] args) {
        int arr[]={12,13,14,15,19};
        int start=2;
        int end=4;
        int target=14;
        System.out.println(search(arr, start, end, target));
    }
     static boolean search(int a[],int start,int end,int target)
     {
        if(a.length==0)
        return false;
        for(int i=start;i<end;i++)
        {
            if(a[i]==target)
            return true;
        }
        return false;
     }
}
