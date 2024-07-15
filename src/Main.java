public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(9);
        Circle circle2 = new Circle(8);
        Circle circle3 = new Circle(3);
        Circle circle4 = new Circle(6);
        System.out.println("Số lượng hình tròn đã được khởi tạo là: " + Circle.getCountCircle());
        System.out.println("Hình tròn có bán kính lớn nhất là: " + Circle.getMaxRadius().getRadius());
        System.out.println("Tổng diện tích các hình tròn là: " + Circle.getSumCircle());
    }
}