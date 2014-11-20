public class Facility
{
    private String name, description;

    public Facility(String name, String desc)
    {
        this.name=name;
        this.description=desc;
    }

    public Facility(String name)
    {
        this(name,null);
    }

    public String getName()
    {
        return name;
    }

    public void setName()
    {
        this.name=name;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription()
    {
        this.description=description;
    }

    public void show()
    {
        System.out.println(name+", "+description);
    }
}
