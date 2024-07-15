public class Circle {
    private int id;
    private double radius;
    private static final double PI = 3.14;
    private static int countCircle = 0;
    private static double sumCircle = 0;
    private static Circle maxRadius = null;

    public Circle(double radius) {
        this.id = countCircle++;
        this.radius = radius;
        sumCircle += getAcreage();
        if (maxRadius == null || this.radius > maxRadius.radius) {
            maxRadius = this;
        }
    }

    public double getRadius() {
        return this.radius;
    }

    public double getAcreage() {
        return PI * this.radius * this.radius;
    }

    public double getPerimeter() {
        return 2 * PI * this.radius;
    }

    public static int getCountCircle() {
        return countCircle;
    }

    public static double getSumCircle() {
        return sumCircle;
    }

    public static Circle getMaxRadius() {
        return maxRadius;
    }

}
