//Carson Samples
//Lab Assignment 4B
//9.16.26
//Course CMP-129-80231
public class PersonTest 
{
    public static void main(String[] args) 
    {
        //making person objects using parameterized instructor 
        Person person1 = new Person("Maria Johnson" , 28, "maria@example.com");
        Person person2 = new Person("David Smith" , 35 , "david@example.com");
        //using setter method to update object after it was already created
        person2.setAge(999);
        //displaying updated age of guy from 2nd person object
        System.out.println("Updated age for " + person2.getName() + ": " + person2.getAge());
        //displaying the info of both people using the displayinfo method
        person1.displayInfo();
        person2.displayInfo();
    }  
}
