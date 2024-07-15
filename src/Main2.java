public class Main2 {
    public static void main(String[] args) {
        Student student1 = new Student(1,"Tùng");
        Student student2 = new Student(2, "Hải");
        Student student3 = new Student(3, "Đức");
        Student.changeCollege();
        student1.display();
        student2.display();
        student3.display();
    }
}
