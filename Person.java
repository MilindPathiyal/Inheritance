//Milind Pathiyal

//Class is a superclass and gives name, age, and gender
public class Person
{
	private String name;    	// name of the person
  	private int age;        	// person's age
  	private char gender;    	// 'M' for male, 'F' for female

	//******************* constructors ***********************/

	public Person()
	{
		this.name = "";
		this.age = 0;
		this.gender = '?';
	}
	

	public Person(String name, int age, char gender)
	{
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	//******************* get methods ***********************/
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public char getGender()
	{
		return gender;
	}
	
	public String toString()
	{
		return getName() + ", age: " + getAge() + ", gender: " + getGender();
	}
	
	//******************* set methods ***********************/
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public void setGender(char gender)
	{
		this.gender = gender;
	}
}