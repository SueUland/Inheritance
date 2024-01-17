public class ClientTester {
    // Why are we putting the main method in a separate class?
    // So you can see the encapsulation and that is how classes in
    // industry are created
    public static void main(String[] args) {

        // construct a Rectangle?
        Rectangle rect = new Rectangle(4, 5);


        // call toString()?
        System.out.println(rect);

        System.out.println("Rect area: " + rect.area());

        // construct a Square
        Square square = new Square(4);

        // call toString()
        System.out.println(square);

        System.out.println("Square Area" + square.area());
    }
}
