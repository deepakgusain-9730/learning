package FactoryPattern;

public class Flutter {

    public void setRefreshRate(){
        System.out.println("Refresh rate: 10%");
    }

    public void setTheme(){
        System.out.println("Set theme.");
    }

    public  UiFactory createUiFactory(String platform){
        return UiFactoryFactory.getUiFactory(platform);
    }
}
