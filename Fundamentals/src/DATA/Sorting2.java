package hh_ex.DATA;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// compare a stream of objects
class Car {
	private String name;
	private int price;
	
	public Car(String name, int price) {
		this.name = name;
		this.price = price;
	}
		
	public String getName() {
		return name;
	}
		
	public void setName(String name) {
		this.name = name;
	}
		
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Car{" + "name=" + name + ", price=" + price + '}';
	}
}
	
public class Sorting2 {
	
	public static void main(String[] args) {
		List<Car> cars = Arrays.asList(new Car("Citreon", 23000), new Car("Porsche", 65000), new Car("Skoda", 18000), new Car("Volkswagen", 33000), new Car("Volvo", 47000));
		
		cars.stream().sorted(Comparator.comparing(Car::getPrice))
			.forEach(System.out::println);
	}
}
