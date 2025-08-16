package binary;

public class findmountaionelement {
    public static void main(String[] args) {
        int num[]={1,2,3,4,5,6,7,3,2,1};
        System.out.println(mountain(num));
    }
    static int mountain(int [] arr)
    {
        int start=0;
        int end=arr.length;
        while(start<end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1])
            {
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return arr[start];
    }
}
