package again;
import java.util.*;
public class Charecter {
    public static void main(String[] args){
        System.out.println("Charecter Operation");
        Scanner s = new Scanner(System.in);
        int i, j, n;
        n = s.nextInt();
        char ch[] = new char[n];
        char cch[] = new char[n];
        //String st = new String();
        String st;
        st = s.nextLine();
        
        ch = st.toCharArray();
        for(i=0; i<n; i++)
        {
            System.out.println(ch[i]);
            if(ch[i]=='h')
            {
                cch[i]=ch[i];
            }else
            {
                cch[i]='p';
            }
        }
        for(j=0; j<n; j++)
        {
            System.out.println(cch[j]);
        }
    }

}
