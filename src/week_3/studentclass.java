package week_3;

public class studentclass {
    public static void main(String[] args) {
        Student s1 = new Student("Goms",23082000,85);
        s1.display("Student_1");
        Student s2 = new Student("Siva",23072004,87);
        s2.display("Student_2");
        Student s3 = new Student("Durka",22082006,84);
        s3.display("Student_3");

    }
}
class Student{
    String name;
    int rollnumber;
    int marks;
    Student(String name,int rollnumber,int marks){
        this.name = name;
        this.rollnumber = rollnumber;
        this.marks = marks;
    }
    void display(String Studentorder){
        System.out.println(  Studentorder + " -> " + "name: " + name + "|" + " rollnumber: " + rollnumber + "|" +  " mark: " + marks );
    }
}