package binary;

public class binarysearch {
    public static void main(String[] args) {
        int num[]={1,2,3,4,5,6,7,8,9,10};
        int target=4;
        System.out.println(search(num, target));
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
        return -1;
    }
}
