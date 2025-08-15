
import java.lang.reflect.Array;
import java.util.Arrays;

class alpha{
    public static void main(String[] args) {
        String name="shiv";
        char target='i';
        System.out.println(search(name, target));
        System.out.println(Arrays.toString(name.toCharArray()));
    }
    static boolean search(String str,char target)
    {
        if(str.length()==0)
        return false;
        for(char c:str.toCharArray())
        {
            if(c==target)
            {
                return true;
            }
        }
        return false;
    }
}