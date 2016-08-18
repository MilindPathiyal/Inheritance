//Milind Pathiyal

//Class gives name, age, gender, gpa, id, major, year
public class CollegeStudent extends Student
{
    private String major;
    private int year;
    
    public CollegeStudent()
    {
        super();
        major = "";
        year = 0;
    }
    
    public CollegeStudent(String name, int age, char gender, double gpa, String id, String major, int year)
    {
        super(name, age, gender, gpa, id);
        this.major = major;
        this.year = year;
    }
    
    public String getMajor()
    {
        return major;
    }
    
    public int getYear()
    {
        return year;
    }
    
    public String toString()
    {
        String answer = super.toString();
        answer += "Major = " + major + " Year of Graduation = " + year;
        return answer;
    }
}