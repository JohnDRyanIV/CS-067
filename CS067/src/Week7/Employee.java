/**
 * @author John Ryan - john.ryan@drake.edu
 * CS 067 - Fall 2024
 * Oct 8, 2024
 */
package Week7;

/**
 * 
 */
public class Employee extends Person {
	
	private String company;
	private double salary;
	private String position;
	
	public Employee(String n, int a, double s, String c, String p) {
        super(n,a);
        setSalary(s);
        setCompany(c);
        setPosition(p);
    }
	
	public void giveRaise(double raiseAmt) {
		setSalary(getSalary() + raiseAmt);
	}
	
	public void changePosition(String newPos) {
		setPosition(newPos);
	}

	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}

	/**
	 * @param company the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}

	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}

	/**
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(String position) {
		this.position = position;
	}

}
