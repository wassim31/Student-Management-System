 public class Course {
    private String name;
    private final double price;

    public Course(String name) {
        this.name = name;
        this.price = 600;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "" + name;
    }
}
