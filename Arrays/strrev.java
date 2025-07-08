import java.util.*;
public class strrev {
    public static String stringrev(String str)
    {
        if(str == null)
        {
            return null;
        }
        else
        {
            return new StringBuffer(str).reverse().toString();
        }
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String str = sc.nextLine();
        String res = stringrev(str);
        System.out.println("The reversed string:"+res);
    }
}
