package BuilderPattern;

public class Main {

    public static void main(String[] args) {
        Student s = Student.getBuilder()
                .setAge(25)
                .setName("Deepak").setGradYear(2025).buildStudent();
        System.out.println(s.gradYear);

    }
}

/*
1:- Helps to create Object of a class.
2:- Validation will be in builder class.
3:- Main class will provide the builder object.
4:- everything will create in builder first and then will be adding to main object.
5:- builder will create the main object.
 */
