

public class Student {

    public int studentID;
    public String studentName;

    public Student(int ID, String name){
        this.studentName = name;
        this.studentID = ID;
    }

    public void setStudentID(int id){
        this.studentID = id;
    }

    public void setStudentName(String name){
        this.studentName = name;
    }

    @Override
    public String toString(){
        return("Student ID: "+studentID+" StudentName: "+studentName);
    }
}
