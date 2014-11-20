public class Person
{
    private String surName, firstName, secondName;

    public Person(String surN, String fN, String sN)
    {
        this.surName=surN;
        this.firstName=fN;
        this.secondName=sN;
    }

    public Person(String surN, String fN)
    {
        this.surName=surN;
        this.firstName=fN;
    }
    
    public String getSurName()
    {
        return surName;
    }

    public void setSurName(String surName)
    {
        this.surName=surName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName=firstName;
    }

    public String getSecondName()
    {
        return secondName;
    }

    public void setSecondName(String secondName)
    {
        this.secondName=secondName;
    }

    public void show()
    {
        System.out.println(firstName+secondName);
    }
}
