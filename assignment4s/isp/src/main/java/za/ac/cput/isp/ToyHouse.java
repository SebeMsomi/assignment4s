package za.ac.cput.isp;

public class ToyHouse {
    private double price;
   private String color;

    public ToyHouse(double price, String color) {
        this.price = price;
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "ToyHouse{" +
                "price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
