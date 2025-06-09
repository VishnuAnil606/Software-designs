interface Button {
    void paint();
}

class WinButton implements Button {
    public void paint() {
        System.out.println("Windows Button");
    }
}

class MacButton implements Button {
    public void paint() {
        System.out.println("Mac Button");
    }
}

interface GUIFactory {
    Button createButton();
}

class WinFactory implements GUIFactory {
    public Button createButton() {
        return new WinButton();
    }
}

class MacFactory implements GUIFactory {
    public Button createButton() {
        return new MacButton();
    }
}

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        GUIFactory factory = new MacFactory(); // Change to WinFactory
        Button button = factory.createButton();
        button.paint();
    }
}