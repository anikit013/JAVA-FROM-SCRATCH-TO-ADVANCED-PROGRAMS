// Reverse of a string
class Reverse
{
    public static void main(String[] args)
     {
        String s= "tikina";
        String rev = ReverseString(s.length()-1,s);
        System.out.println( rev );

    }
    public static String ReverseString(int index, String s)
    {
        String rev="";
        if (index>=0)
        {
        return  rev + s.charAt(index) + ReverseString(index-1,s);
        }
        return rev;
    }

}