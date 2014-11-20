public class ClubApplication
{
    public static void main(String args[])
    {
        Person p=new Person("Kyaw Sint"," Kyaw"," Sint");
        Person p1=new Person("Sint Kyaw", "Kyaw");
        p.show();
        p1.show();

        Facility f=new Facility("Software House","Create ERP software");
        Facility f1=new Facility("Computer Centre");
        f.show();
        f1.show();
    }
}
