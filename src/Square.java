// Only use inheritance for "is-a" relationships
// Square is-a Rectangle
public class Square extends Rectangle { //Rectangle is super or parent of Square

    public Square(int side){
        // need to explicitly call the parameterized
        // Rectangle constructor
        // super is always the first in the constructor
        super(side,side);
    }

    @Override
    public int area(){
        return super.getHeight() * super.getLength();
    }
}
