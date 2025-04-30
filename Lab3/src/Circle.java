public class Circle implements Shape {
    private double price; // Price attribute

    public Circle(double price) {
        this.price = price;
    }

    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }

    @Override
    public double computerCost() {
        return price; // Return the price of the circle
    }
}