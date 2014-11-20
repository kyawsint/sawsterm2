public class Array_eg
{
    public static void main(String args[])
    {
        String[] names=new String[4];
        // String[] name={"Pete", "Jane", "Tom", "Mary"};
        names[0]="Pete";
        names[1]="Jane";
        names[2]="Tom";
        names[3]="Mary";
        for(int i=0;i<names.length;i++)
        {
            System.out.println(names[i]);
        }
        System.out.println();
        for(String n:names)
        {
            System.out.println(n);
        }
    }
}
