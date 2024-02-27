package AbstractFactory;

import java.awt.*;

public class ApplicationFactory {

    //an application should have button and a checkbox.
    private Button button;
    private CheckBox checkBox;
    private UIFactory activeUIFactory;


    public ApplicationFactory(UIFactory uiFactory)
    {
        this.activeUIFactory = uiFactory;
        this.button = this.activeUIFactory.createButton();
        this.checkBox = this.activeUIFactory.createCheckBox();
    }

    public void createAllComponents()
    {
        this.button.paint();
        this.checkBox.paint();
    }
}
