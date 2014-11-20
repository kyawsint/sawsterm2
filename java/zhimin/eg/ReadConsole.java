import java.io.*;

public class ReadConsole
{
    public static String getReadLine(String prompt)
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.print(prompt+ ": ");
        try{
            return (br.readLine());
        }
        catch(Exception ex)
        {
            System.err.print("Exception error=" +ex.getMessage());
            return null;
        }
    }

    public static void main(String args[])
    {
        String line= getReadLine("Type some text");
        System.out.println("You typed: "+line);
    }
}
