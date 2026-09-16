//Carson Samples
//Lab Assignment 4B
//9.16.26
//Course CMP-129-80231
public class Person 
{
    //initalizing private variables for name, age and email
    private String name; 
    private double age;
    private String email;
    //paramterized constructor to initalize a person object with all attributes
    public Person(String name, double age, String email) 
    {
        this.name = name;
        this.age = age;
        this.email = email;
    }
    //get and set methods for each of the variables
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
    //method to format the person's info with each variable and display it 
    public void displayInfo() 
    {
        System.out.println("Person Information");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email + "\n");
    }
}
