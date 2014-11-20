import java.util.*;

public class StringTokenizer_eg
{
    public void splitWords()
    {
        StringTokenizer st=new StringTokenizer("this is a test");
        while(st.hasMoreTokens())
        {
            System.out.println(st.nextToken());
        }
        System.out.println();
        StringTokenizer st1=new StringTokenizer("this~is~a~test","~");
        while(st1.hasMoreTokens())
        {
            System.out.println(st1.nextToken());
        }
    }

    public static void main(String args[])
    {
        StringTokenizer_eg ste=new StringTokenizer_eg();
        ste.splitWords();
    }
}
