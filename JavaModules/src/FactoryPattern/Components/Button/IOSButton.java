package FactoryPattern.Components.Button;

public class IOSButton implements Button {

    @Override
    public int getSize(){
        return 5;
    }
}
