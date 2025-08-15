import java.util.Arrays;

public class search2dlinear {
    public static void main(String[] args) {
        int arr[][]={{12,13,14},{23,243,221,6},{10,3,21,4}};
        int k=6;
        System.out.println(Arrays.toString(search(arr, k)));
    }
    public static int[] search(int[][] arr,int k)
    {
        for(int row=0;row<arr.length;row++)
        {
            for(int col=0;col<arr[row].length;col++)
            {
                if(arr[row][col]==k)
                return new int[]{row,col};
            }
        }
        return new int[]{-1,-1};
    }
}
