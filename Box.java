/*
    CSC 205: <37533> / <Monday: 5pm - 8:30pm>
    Minilab: 3 - Inheritance
    Author: Dominic Morgadez (35654175)
    Description: A program that has a Box class that takes data from the Rectangle class and adds a third
                 data which characterizes a third-dimensional object.
 */
public class Box extends Rectangle {

    //---------- third data
    int depth = 0;

    //---------- Constructors
    //---------- Default Constructor
    public Box() {

        width = 5;
        height = 2;
        depth = 6;

    }

    public Box(int newWidth, int newHeight, int newDepth) {

        if (newWidth < 0 || newHeight < 0 || newDepth < 0) {
            throw new IllegalArgumentException("No negative dimensions!");
        }

        this.width = newWidth;
        this.height = newHeight;
        this.depth = newDepth;
    }

    public String toString() {
        return this.getClass().getName() + ": " + width + "x" + height + "x" + depth;
    }

    public int getPerimeter() {
        throw new IllegalStateException("A box cannot have a perimeter!");
    }

    public int getSumOfDimensions() {
        return width + height + depth;
    }

    public int getSurfaceArea() {
        return (2 * width * height)  + (2 * width * depth)  + (2 * height * depth);
    }

}
