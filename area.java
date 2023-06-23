class RectangleTest {
    public static void main(String[] args) {
	System.out.println("Jivesh Lakhani 047");
        // create a rectangle object with length 5 and width 3
        Rectangle rectangle = new Rectangle(5, 3);
        // calculate and print the area and perimeter
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
        // set the length and width using setters
        rectangle.setLength(8);
        rectangle.setWidth(4);
        // calculate and print the new area and perimeter
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
    }
}
class Rectangle {
    // instance variables
    private double length;
    private double width;
    // constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    // methods to calculate area and perimeter
    public double calculateArea() {
        return length * width;
    }
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
    // getters and setters for length and width
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
}
