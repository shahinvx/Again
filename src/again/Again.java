package again;
import java.util.*;
public class Again {
    public static void main(String[] args) {
        System.out.println("I am back");
        int i;
        Scanner s = new Scanner(System.in);
        int n;
        String str;
        str = s.nextLine();
        n = s.nextInt();
        int arr[] = new int[n];
        char ch[] = new char[n];
        ch = str.toCharArray();
        String st = new String(ch);
        st = s.nextLine();
        for (i=0; i<n; i++)
        {
            arr[i]=i;
            System.out.println(arr[i]);
            //System.out.println(ch[i]);
        }
        for(i=0; i<n; i++)
        {
            //[i]=s.nextLine();
            System.out.println(ch[i]);
        }
    }  
}
