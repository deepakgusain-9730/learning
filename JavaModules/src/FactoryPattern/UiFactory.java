package FactoryPattern;

import FactoryPattern.Components.Button.Button;
import FactoryPattern.Components.Dropdown.Dropdown;
import FactoryPattern.Components.Menu.Menu;

import java.awt.*;

public interface UiFactory {

    public Button createButton();

    public Menu createMenu();

    public Dropdown createDropdown();
}
