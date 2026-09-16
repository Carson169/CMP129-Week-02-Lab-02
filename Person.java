//Carson Samples
//Lab Assignment 4A
//9.16.26
//Course CMP-129-80231
public class Person 
{
    private String name;
    private double age;
    private String email;
    public String getName() 
    {
        return name;
    }
    public void setName(String name) 
    {
        this.name = name;
    }
    public double getAge() 
    {
        return age;
    }
    public void setAge(double age) 
    {
        this.age = age;
    }
    public String getEmail() 
    {
        return email;
    }
    public void setEmail(String email) 
    {
        this.email = email;
    }
    public void displayInfo() 
    {
        System.out.println("Person Information");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email + "\n");
    }
}
