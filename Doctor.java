//Milind Pathiyal

public class Doctor extends Person
{
    private double debt;
    
    public Doctor()
    {
        super();
        debt = 0.0;
    }
    
    public Doctor(String name, double debt)
    {
        super(name, debt);
        this.debt = debt;
    }
    
    public String getName()
    {
        return "Dr." + super.getName();  
    }
    
    public double getDebt()
    {
        return debt;
    }
    
    public String toString()
    {
        String answer = super.toString();
        answer += "Dr." + name + " has a student debt of " + debt;
        return answer;
    }
}