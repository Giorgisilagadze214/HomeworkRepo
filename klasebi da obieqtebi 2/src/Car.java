public class Car {
    private String brand;
    private String model;
    private int year;
    private String plateNumber;

    public Car(String brand, String model, int year, String plateNumber) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.plateNumber = plateNumber;
    }

    public void printInfo() {
        System.out.println(brand);
        System.out.println(model);
        System.out.println(year);
        System.out.println(plateNumber);
        System.out.println();
    }
}

