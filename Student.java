//Milind Pathiyal

//Class gives name, age, gender, gpa, and id
public class Student extends Person
{
    private double gpa;
    private String id;

    public Student()
    {
        super();
        gpa = 0.0;
        id = "";
    }
    
    public Student(String name, int age, char gender, double gpa, String id)
    {
        super(name, age, gender);
        this.gpa = gpa;
        this.id = id;
    }
    
    public double getGPA()
    {
        return gpa;
    }
    
    public String getID()
    {
        return id;
    }
    
    public String toString()
    {
        String answer = super.toString();
        answer += "GPA = " + gpa + " ID Number = " + id;
        return answer;
    }
}