package javaassignment.problemstatement5;

	public class Car {
	    private String name;
	    private String owner;
	    private String modelNumber;
	    private int launchYear;
	    private double price;

	    public Car(String name, String owner, String modelNumber, int launchYear, double price) {
	        this.name = name;
	        this.owner = owner;
	        this.modelNumber = modelNumber;
	        this.launchYear = launchYear;
	        this.price = price;
	    }

	    // Getters and setters
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getOwner() {
	        return owner;
	    }

	    public void setOwner(String owner) {
	        this.owner = owner;
	    }

	    public String getModelNumber() {
	        return modelNumber;
	    }

	    public void setModelNumber(String modelNumber) {
	        this.modelNumber = modelNumber;
	    }

	    public int getLaunchYear() {
	        return launchYear;
	    }

	    public void setLaunchYear(int launchYear) {
	        this.launchYear = launchYear;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public void setPrice(double price) {
	        this.price = price;
	    }

	    @Override
	    public String toString() {
	        return "Car{" +
	                "name='" + name + '\'' +
	                ", owner='" + owner + '\'' +
	                ", modelNumber='" + modelNumber + '\'' +
	                ", launchYear=" + launchYear +
	                ", price=" + price +
	                '}';
	    }
	}
