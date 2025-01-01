package BuilderPattern;

public class Student {
    int id;

    String name;

    double psp;

    int age;

    String universityName;

    int gradYear;

    public static class Builder {
        int id;

        String name;

        double psp;

        int age;

        String universityName;

        int gradYear;

        public int getId() {
            return id;
        }

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getUniversityName() {
            return universityName;
        }

        public Builder setUniversityName(String universityName) {
            this.universityName = universityName;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }
        public Student buildStudent() {
            if (age>25){
                throw new IllegalArgumentException("Age must be less than 25");
            }

            return new Student(this);
        }
    }


    private Student(Builder builder){
        this.age = builder.getAge();
        this.name = builder.getName();
        this.gradYear = builder.getGradYear();

    }

    public static Builder getBuilder(){
        return new Builder();
    }

}
