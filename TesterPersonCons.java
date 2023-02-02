@FunctionalInterface
interface MyPersonInterface{
	Person getPerson(String name, Integer age);
}

public class TesterPersonCons {

public static void main(String[] args) {
		
		MyPersonInterface obj = Person :: new;
		System.out.println(obj.getPerson("Sudipta", 21));
        System.out.println(obj.getPerson("Tanya", 21));
}
}

/*
 * Output:
 * Person [name=Sudipta, age=21]
 * Person [name=Tanya, age=21]
 */