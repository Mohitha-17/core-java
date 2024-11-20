package keywords;

public class ThisKeywordExample {
	    private String model;
	    private int year;
	    public ThisKeywordExample(String model, int year) {
	        this.model = model;  
	        this.year = year;    
	    }
	    public void displayDetails() {
	        System.out.println("Car Model: " + this.model); 
	        System.out.println("Car Year: " + this.year);   
	    }
	    public void updateYear(int year) {
	        this.year = year;  
	    }
	    public static void main(String[] args) {
	        Car car = new Car("Toyota");
	        car.displayType();
	        car.updateYear(2022);
	        System.out.println("After Update:");
	        car.displayType();  
	    }
	}
