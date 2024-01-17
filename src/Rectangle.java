public class Rectangle {
    // fields - length height/width
    private int length;
    private int height;

    // constructors
    public Rectangle(int length, int height){
        this.length = length;
        this.height = height;
    }

    // getters/setters
    public int getLength(){
        return this.length;
    }

    public int getHeight() {
        return this.height;
    }
// other methods
    public int area(){
        return length * height;
    }

    // toString
    @Override
    public String toString(){
        return getClass().getName() +
                ": length->" + length + " height->" + height;
    }
}
