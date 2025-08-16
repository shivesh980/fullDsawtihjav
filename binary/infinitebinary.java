package binary;

public class infinitebinary {
    public static void main(String[] args) {
        int num[]={1,2,3,4,5,6,7,8,9,10,13,14,15};
        int target=6;
        System.out.println(ans(num, target));
    }
    static int ans(int[] arr,int target)
    {
        int start=0;
        int end=1;
        while(target>arr[end])
        {
            int temp=end+1;//this is my new start 
            //double the box value
            //end=privous end +sizeofbox*2
            end=end+(end-start+1)*2;
            start=temp;
        }
        return binarysearch(arr,target,start,end);
    }
    static int binarysearch(int [] arr,int target,int start,int end)
    {
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(target<arr[mid])
            end=mid-1;
            else if(target>arr[mid])
            start=mid+1;
            else 
            return mid;
        }
        return -1;
    }
}
