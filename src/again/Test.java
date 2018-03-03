package again;
import java.util.*;
public class Test {
    public static void main(String[] args){
        System.out.println("Charecter Operation");
        Scanner s = new Scanner(System.in);
        int i, j, n;
        String str,cpy;
        str = s.nextLine();
        
        System.out.println(str);
        
        char ch[] = new char[10];
        ch = str.toCharArray();
        
        for(i=0; i<ch.length; i++)
        {
            System.out.println(ch[i]);
        }
        str = str.toUpperCase();
        System.out.println(str);
    }

}
