public class StudentInfo {
    private String studentName = "John";
    private String studentClass = "C02";
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
     public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
     }

     public void getInfo(){
        System.out.println(studentName + " " + studentClass);
     }

}
