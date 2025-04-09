package april8.comparator;

public class Mobile {
    int capacity;
    String name;
    String brand;

    public Mobile(int capacity, String name, String brand) {
        this.capacity = capacity;
        this.name = name;
        this.brand = brand;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "capacity=" + capacity +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
