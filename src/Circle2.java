public class Circle2 {
    private double radius = 1;
    private double PI = 3.14;
    public Circle2(double radius) {
        this.radius = radius;
    }
    public Circle2(){
    }

    public double getAcreage() {
        return this.PI * this.radius * this.radius;
    }

    public double getPerimeter(){
        return this.PI * 2 * this.radius;
    }
}
