import javax.lang.model.util.ElementScanner6;

public class Palindrome{
    public static boolean is_palindrome(String s)
    {
       int a = (s.length()-1);
       int b = 0;
       while(b < a && s.charAt(b) == s.charAt(a)) {
        b+=1;
        a-=1;
       }
       if(s.charAt(b)!=s.charAt(a)) {
         return false;}
         else {
              return true;
              }
          
    }
}
