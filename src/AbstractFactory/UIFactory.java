package AbstractFactory;

public interface UIFactory {
    //MAC Factory and WindowsFactory will implement diffrently.
    public Button createButton();
    public CheckBox createCheckBox();
}
