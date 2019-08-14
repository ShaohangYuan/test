public class PrintStudent {

    public static void main(String[] args) {
        PrintStudent printStudent = new PrintStudent();
        printStudent.print();
    }

    private void print() {
        Student student = new Student(1,"Alex");
        System.out.println(student.toString());
        Student student2 = new Student(2,"Alma");
        System.out.println(student2.toString());
    }
}
