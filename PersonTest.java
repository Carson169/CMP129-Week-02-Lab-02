//Carson Samples
//Lab Assignment 4A
//9.16.26
//Course CMP-129-80231
public class PersonTest 
{
    public static void main(String[] args) 
    {
        Person person1 = new Person();
        Person person2 = new Person();
        person1.setName("Maria Johnson");
        person1.setAge(28);
        person1.setEmail("maria@example.com");
        person2.setName("David Smith");
        person2.setAge(35);
        person2.setEmail("david@example.com");
        System.out.println("Retrieving first person's name: " + person1.getName() + "\n");
        person1.displayInfo();
        person2.displayInfo();
    }  
}
