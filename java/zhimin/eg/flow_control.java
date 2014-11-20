public class switch_case
{
    public static int getDaysInMonth(int month, int year)
    {
        int numDays=0;
        switch(month)
        {
            case 4:
            case 6:
            case 9:
            case 11:
                numDays=30;
                break;
            case 2:
                boolean isLeap=((year%400)==0)||((year%100)!=0)&&((year%4)==0);
                numDays=isLeap?29:28;
                break;
            default:
                numDays=31; break;
        }
        return numDays;
    }

    public static void main(String args[])
    {
//        switch_case sc=new switch_case();
//        int mth=sc.getDaysInMonth(2,2000);
//        System.out.println(mth);
        System.out.println(getDaysInMonth(2, 2000));
    }
}
