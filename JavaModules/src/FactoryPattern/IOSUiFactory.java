package FactoryPattern;

import FactoryPattern.Components.Button.Button;
import FactoryPattern.Components.Button.IOSButton;
import FactoryPattern.Components.Dropdown.Dropdown;
import FactoryPattern.Components.Menu.Menu;

public class IOSUiFactory implements UiFactory {

    @Override
    public IOSButton createButton() {
        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
        return null;
    }

    @Override
    public Dropdown createDropdown() {
        return null;
    }
}
