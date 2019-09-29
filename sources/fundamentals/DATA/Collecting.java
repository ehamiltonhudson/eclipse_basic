package fundamentals.DATA;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// A collection is a terminal reduction operation which reduces elements
// of a stream into a Java collection, string, value, or specific grouping
class Vehicle {

    private String name;
    private int price;

    public Vehicle(String name, int price) {

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
        return "Vehicle{" + "name=" + name + ", price=" + price + '}';
	}
}


public class Collecting {
	
	public static void main(String[] args) {
		
		List<Vehicle> vehicles = Arrays.asList(new Vehicle("Citreon", 23000), 
				new Vehicle("Porsche", 65000), new Vehicle("Skoda", 18000), 
				new Vehicle("Volkswagen", 33000), new Vehicle("Volvo", 47000));
		
		List<String> names = vehicles.stream().map(Vehicle::getName)
				.filter(name -> name.startsWith("Vo"))
				.collect(Collectors.toList());
		
		for (String name : names) {
			System.out.println(name);
		}
	}

}
