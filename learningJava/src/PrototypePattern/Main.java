package PrototypePattern;

public class Main {

    public static void setRegistry(StudentRegistry studentRegistry) {
        Student apr21Batch = new Student();
        apr21Batch.setBatch("April 21");
        apr21Batch.setAvgBatchPsp(80.9);

        studentRegistry.registerStudent("apr21Batch", apr21Batch);

        Student apr22Batch = new Student();
        apr22Batch.setBatch("April 21");
        apr22Batch.setAvgBatchPsp(80.9);

        studentRegistry.registerStudent("apr22Batch", apr22Batch);
    }

    public static void main(String[] args) {

        StudentRegistry studentRegistry = new StudentRegistry();
        setRegistry(studentRegistry);

        Student st = studentRegistry.getStudent("apr21Batch").cloneObject();

        System.out.println(st.toString());

    }
}

/*
1:- Copy details of object to other object.
2:- Creating a new object and copying the details from original object.
3:- Copy constructor we have to create.
4:- Violating OCP of SOLID.
5:- Main class or object will provide the feature to copy the object.
6:- It won't violate OCP if both child and parent are having copy function.
7:- Generally we store this kind of object in registry.
8:- Registry will be a class only which will store objects of prototype.
9:- If you need some template again and again then we store it in registry.
*/
