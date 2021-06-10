// to search a key in recursive order
class linearSearch

{
    public static void main(String[] args) {
        int[] a= {2,4,5,6,3,4};
        int key=7;
        if (linearSearch(a,0,key))
        {
            System.out.println(" Found Key ");
        }
        else{
            System.out.println(" Key Not Found ");
        }


    }
    public static boolean linearSearch(int[] a, int i, int key)
    {
        if (i>=a.length)
        { 
            return false;
        }
        else if(a[i]==key)
        {
            return true;

        }
        else 
        { 
            return (linearSearch(a,i+1,key));
        }
    }
}