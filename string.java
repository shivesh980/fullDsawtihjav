public class string {
    public static void main(String[] args) {
        String name= "shivesh";
        char target='h';
        int result=stringl(name, target);
        System.out.println(result);
    }
    static int stringl(String name,char target)
    {
        if(name.length()==0)
        return -1;
        for(int i=0;i<name.length();i++)
        {
            if(name.charAt(i)==target)
            return i;
        }
        return -1;
    }
}
