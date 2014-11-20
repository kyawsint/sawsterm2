import java.io.*;

public class test
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.print("Enter somethings : ");
//        try
//        {
            System.out.println("You typed : "+br.readLine());
//        }
//        catch(Exception e)
//        {
//            System.err.print("Exception error= "+ e.getMessage());
//        }
    }
}
