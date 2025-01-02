package FactoryPattern;

import FactoryPattern.Components.Button.AndroidButton;
import FactoryPattern.Components.Button.Button;
import FactoryPattern.Components.Dropdown.Dropdown;
import FactoryPattern.Components.Menu.Menu;

public class AndoidUiFactory implements UiFactory {

    @Override
    public AndroidButton createButton(){
        return new AndroidButton();

    }

    @Override
    public Menu createMenu(){
        return null;
    }

    @Override
    public Dropdown createDropdown(){
        return null;
    }
}
