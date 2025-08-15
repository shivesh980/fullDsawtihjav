package binary;

public class secondbi {
    public static void main(String[] args) {
        int arr[]={2,3,5,9,14,16,17,18};
        int target=15;
        System.out.println(search(arr, target));
    }
    static int search(int num[],int target)
    {
        if(num.length==0)
        {
            return -1;
        }
        int h,l,mid;
        h=num.length-1;
        l=0;
        while(l<=h)
        {
            mid=(l+h)/2;
            //mid=l+(h-l)/2;
            if(num[mid]==target)
            {
                return mid;
            }
            else if(num[mid]<target)
            {
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return l;
    }
}

