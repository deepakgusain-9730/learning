package BuilderPattern;

public class Main {

    public static void main(String[] args) {
        Student s = Student.getBuilder()
                .setAge(25)
                .setName("Deepak").setGradYear(2025).buildStudent();
        System.out.println(s.gradYear);

    }
}
