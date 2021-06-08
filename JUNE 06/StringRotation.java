import java.util.Scanner;
class StringRotation  
{  
    public static void main(String[] args)
	{  
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two Strings");
        String str1 = sc.nextLine();
		String str2 = sc.nextLine(); 
          
        if(str1.length() != str2.length())
		{  
            System.out.println("String are not rotation of each other");  
        }  
        else 
		{  
            str1 = str1.concat(str1);  
            
            if(str1.indexOf(str2) != -1)  
                System.out.println("String are rotation of each other");  
            else  
                System.out.println("Second string is not a rotation of first string");  
        }  
    }  
}