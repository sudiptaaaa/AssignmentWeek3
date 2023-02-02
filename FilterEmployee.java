import java.util.*;
import java.util.stream.Collectors;

class Employee{
	int id;
	String name;
	double salary;
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
		
}
public class FilterEmployee {

	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<Employee>();
		//List<Double> newList = new ArrayList<Double>();
		List<Employee> newList = new ArrayList<Employee>();
		
		empList.add(new Employee(100, "Ahsdvbe", 10000));
		empList.add(new Employee(101, "Bv kjsfbh", 50000));
		
		
		newList=empList.stream().map(n->new Employee(n.id, n.name, n.salary*1.1)).collect(Collectors.toList());
		System.out.println("After Salary Increment: " + newList);


	}

}

/*
 * Output:
 * After Salary Increment: [Employee [id=100, name=Ahsdvbe, salary=11000.0], Employee [id=101, name=Bv kjsfbh, salary=55000.0]]
 */
