import java.util.*;

public class array_resizing
{
    public static void main(String args[])
    {
        String[] names=new String[4];
        names[0]="A";
        names[1]="B";
        names[2]="C";
        names[3]="D";
        for(String n: names)
        {
            System.out.println(n);
        }
        System.out.println("After resizing");
        names= Arrays.copyOf(names, 10);
        for(String n: names)
            System.out.println(n);
    }
}
