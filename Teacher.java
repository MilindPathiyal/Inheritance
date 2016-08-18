//Milind Pathiyal

//Class gives name, gender, age, subject, and salary
public class Teacher extends Person
{
    private String subject;
    private double salary;
    
    public Teacher()
    {
        super();
        subject = "";
        salary = 0;
    }
    
    public Teacher(String name,int age, char gender, String subject, double salary)
    {
     super(name, age, gender);
     this.subject = subject;
     this.salary = salary;
    }
    
    public String getSubject()
    {
        return subject;
    }
    
    public double getSalary()
    {
        return salary;
    }
    
    public void setSubject()
    {
       this.subject = subject; 
    }
    
    public void setSalary()
    {
        this.salary = salary;
    }
    
    public String toString()
    {
        String answer = super.toString()+ "Subject:" + subject + "Salary:"
        + salary;
        return answer;
    }
}
