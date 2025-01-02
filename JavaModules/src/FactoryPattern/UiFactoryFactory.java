package FactoryPattern;

public class UiFactoryFactory {

    public static UiFactory getUiFactory(String platform) {
        if (platform.equals("android")){
            return new AndoidUiFactory();
        }else{
            return new IOSUiFactory();
        }
    }
}
