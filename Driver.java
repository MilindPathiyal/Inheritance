//Milind Pathiyal

//Uses all classes to perform task
public class Driver
{
    public static void main()
    {
        Person bob = new Person("Bob", 27, 'M');
        System.out.println(bob);
        
        Student lynne = new Student("Lynne", 16, 'F',3.5, "95129abc");
        System.out.println(lynne);
        
        Teacher John = new Teacher("John", 14, 'M', "Math", 30000000);
        System.out.println(John);
        
        CollegeStudent ima = new CollegeStudent("Ima Frosh", 18, 'F', 4.0, "UCB123", "English",2015);
        System.out.println(ima);
    }
}
/*
 * Bob, age: 27, gender: M
Lynne, age: 16, gender: F, GPA = 3.5, ID Number = 95129abc
John, age: 14, gender: M, Subject: Math, Salary:3.0E7
Ima Frosh, age: 18, gender: F, GPA = 4.0, ID Number = UCB123, Major = English, Year of Graduation = 2015
 */