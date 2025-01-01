package PrototypePattern;

public class IntelligentStudent extends Student {
    int iq;

    public void setIq(int iq) {
        this.iq = iq;
    }

    IntelligentStudent(){

    }

    IntelligentStudent(IntelligentStudent intelligentStudent){
        super(intelligentStudent);
        this.iq = intelligentStudent.iq;
    }

    @Override
    public IntelligentStudent cloneObject() {
        return new IntelligentStudent(this);
    }
}

