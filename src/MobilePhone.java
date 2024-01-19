
public class MobilePhone {
    private String brand;
    private String model;
    private int yearReleased;

    public MobilePhone(String brand, String model, int yearReleased) {
        this.brand = brand;
        this.model = model;
        this.yearReleased = yearReleased;
    }

    public void displayInfo() {
        System.out.println("Mobile Information:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year Released: " + yearReleased);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearReleased() {
        return yearReleased;
    }

    public void setYearReleased(int yearReleased) {
        this.yearReleased = yearReleased;
    }
}