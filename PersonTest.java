//Carson Samples
//Lab Assignment 4A
//9.16.26
//Course CMP-129-80231
public class PersonTest 
{
    public static void main(String[] args) 
    {
        //making person objects
        Person person1 = new Person();
        Person person2 = new Person();
        //using set methods to set values for 2 different objects 
        person1.setName("Maria Johnson");
        person1.setAge(28);
        person1.setEmail("maria@example.com");
        person2.setName("David Smith");
        person2.setAge(35);
        person2.setEmail("david@example.com");
        //using a get function to recieve the name variable of the person1 object
        System.out.println("Retrieving first person's name: " + person1.getName() + "\n");
        //displaying the info of both people using the displayinfo method
        person1.displayInfo();
        person2.displayInfo();
    }  
}
