public class TestCircle {
    public static void main(String[] args) {
        Circle2 circle21 = new Circle2();
        System.out.println("Diện tích hình tròn là: " + circle21.getAcreage());
        System.out.println("Chu vi hình tròn là: " + circle21.getPerimeter());
        Circle2 circle22 = new Circle2(4);
        System.out.println("Diện tích hình tròn là: " + circle22.getAcreage());
        System.out.println("Chu vi hình tròn là: " + circle22.getPerimeter());
    }
}
