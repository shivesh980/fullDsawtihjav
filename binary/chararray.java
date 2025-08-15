package binary;

public class chararray {
    public static void main(String[] args) {
        char [] arr={'c','f','j'};
        char target='c';
        System.out.println(nextgretterchar(arr, target));
    }
    static char nextgretterchar(char []arr,char target)
    {
        int start=0,end=arr.length-1,mid;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            if(arr[mid]>target)
                end=mid-1;
            else
                start=mid+1;
        }
        return arr[start % arr.length];
    }
}
