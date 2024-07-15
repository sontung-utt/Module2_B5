public class Student {
    private int rollno;
    private String name;
    private static String college = "Tùng";

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    static void changeCollege(){
        college = "CODEGYM";
    }

    void display(){
        System.out.println(rollno + " " + name + " " + college);
    }
}
