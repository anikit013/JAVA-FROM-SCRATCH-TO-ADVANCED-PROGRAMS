// Find a key element in a given array using binary search using recurrsion
class KeyFind
{
    public static void main(String[] args)
     {
        int[] a={1,2,3,4,5,6,7,8,9};
        int key=10;
        int high=a[0];
        int low=a[a.length-1];
        if (Key(a,key,high,low))
        {
            System.out.println(" Key found ");
        }
        else{
            System.out.println(" Key not found "); 
        }
    }
    public static boolean Key(int[] a, int high, int low, int key)
    {
        int mid=(high+low)/2;
        if (low>high)
        {
            return false;
        }
        else if (key == a[mid])
        {
            return true;
        }
        else if (key > a[mid])
        {
            return Key(a,mid+1,high,key);
        }
        else 
        {
            return Key(a,low,mid-1,key);
        }
    }

}