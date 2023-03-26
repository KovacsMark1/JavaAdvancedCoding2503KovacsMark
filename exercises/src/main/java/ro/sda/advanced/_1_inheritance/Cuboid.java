package ro.sda.advanced._1_inheritance;

public class Cuboid extends Rectangle {

    private double height;


    public Cuboid(double width, double length, int height) {
        super(width, length);


        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }

    }

    public double getHeight() {
        return height;
    }


    public double getVolume() {
        return this.getArea() * height;
    }


}