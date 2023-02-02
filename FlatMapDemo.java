import java.util.*;
import java.util.stream.Collectors;

class Products{
	int id;
	String name;
	int price;
	public Products(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Products [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
}

public class FlatMapDemo {

	public static void main(String[] args) {
		List<Products> proList1 = new ArrayList<Products>();
		List<Products> proList2 = new ArrayList<Products>();
		List<Products> proList3 = new ArrayList<Products>();
		
		proList1.add(new Products(100, "Hp", 100000));
		proList1.add(new Products(101, "Acer", 50000));
		proList1.add(new Products(102, "Samsung", 50000));
		
		proList2.add(new Products(100, "Oneplus", 10000));
		proList2.add(new Products(101, "Realme", 50000));
		proList2.add(new Products(102, "Oppo", 50000));
		
		proList3.add(new Products(100, "Sony", 10000));
		proList3.add(new Products(101, "Canon", 50000));
		proList3.add(new Products(102, "Nikon", 50000));
		
		List<List<Products>> newList = new ArrayList<List<Products>>();
		newList.add(proList1);
		newList.add(proList2);
		newList.add(proList3);
		
		
		List<Products> allProducts = newList.stream().flatMap(plist -> plist.stream()).collect(Collectors.toList());
		System.out.println("Collection of all Products: "+ allProducts);

	}

}

/*
 * Output:
 * Collection of all Products: [Products [id=100, name=Hp, price=100000], Products [id=101, name=Acer, price=50000],
 *  Products [id=102, name=Samsung, price=50000], Products [id=100, name=Oneplus, price=10000], Products [id=101, name=Realme, price=50000], 
 * Products [id=102, name=Oppo, price=50000], Products [id=100, name=Sony, price=10000], Products [id=101, name=Canon, price=50000], Products [id=102, name=Nikon, price=50000]]
 */
