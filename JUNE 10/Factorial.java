// WAP to print Factorial
class Factorial
{
    public static void main(String[] args) {
        int num=5;
        System.out.println(" Factorial " +fact(num));
    }
    public static int fact(int num)
    {
        if (num==1 || num==0)
        {
            return 1;
        }
        else
        {
            return num + fact(num -1 );
        }
    }
}