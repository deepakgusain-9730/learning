package FactoryPattern;

import FactoryPattern.Components.Button.Button;

public class Client {

    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UiFactory f = flutter.createUiFactory("Android");
        Button b = f.createButton();
        b.getSize();

    }
}
