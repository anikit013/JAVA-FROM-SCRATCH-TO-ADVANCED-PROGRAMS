// Sum of digit of given number
class SumofDigit 
{
    public static void main(String[] args) {
        int num=456;
        System.out.println(" The sum  is " + sum(num));
    }
    public static int sum(int num)
    {
       if  (num > 0)
       {
           return num%10 +sum(num/10);
       }
       else 
       {
           return 0;
       }
}
}