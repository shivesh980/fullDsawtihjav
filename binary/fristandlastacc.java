package binary;

public class fristandlastacc {
    public static void main(String[] args) {
        int nums[]={5,7,7,7,8,8,10};
        int target=7;
        int result[]=fristandlast(nums, target);
        System.out.println("["+result[0]+" "+result[1]+"]" );
    }
    static int[] fristandlast(int []num,int target)
    {
        int ans[]={-1,-1};
        ans[0]=search(num,target,true);
        if(ans[0]!=-1)
        ans[1]=search(num,target,false);
        return ans;
    }
    static int search(int num[],int target,boolean searchforfrist)
    {
        int ans=-1;
        int start=0,end=num.length-1,mid;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            if(target < num[mid])
            {
                end=mid-1;
            }
            else if(target > num[mid])
                start=mid+1;
            else{
                    ans=mid;
                    if(searchforfrist)
                    end=mid-1;
                    else
                    start=mid+1;
            }
        }
        return ans;
    }
}
