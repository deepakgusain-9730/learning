package PrototypePattern;

public class Student implements Prototype<Student> {

    private int age;

    private String name;

    private String batch;

    private Double avgBatchPsp;

    private Double studentPsp;

    Student(){

    }

    Student(Student student) {
        this.age = student.age;
        this.name = student.name;
        this.avgBatchPsp = student.avgBatchPsp;
        this.studentPsp = student.studentPsp;
        this.batch = student.batch;

    }


    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setBatch(String batch) {
        this.batch = batch;
    }


    public void setAvgBatchPsp(Double avgBatchPsp) {
        this.avgBatchPsp = avgBatchPsp;
    }


    public void setStudentPsp(Double studentPsp) {
        this.studentPsp = studentPsp;
    }

    @Override
    public Student cloneObject(){
        return new Student(this);
    }
}
