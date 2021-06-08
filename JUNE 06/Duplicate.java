public class Duplicate {  
    public static void main(String[] args) {  
       String s = "programming";     
       char s1[] = s.toCharArray();  
       duplicate(s1);
   }
   public static void duplicate(char[] s1)
   {
       int count;
       for(int i = 0; i <s1.length; i++) {  
           count = 1;  
           for(int j = i+1; j <s1.length; j++)
               {  
                   if(s1[i] == s1[j] && s1[i] != ' ')
                   {  
                       count++; 
                       s1[j] = '0';  
                   }  
               }    
           if(count > 1 && s1[i] != '0')  
               System.out.println(s1[i]);  
       }
   }
}  