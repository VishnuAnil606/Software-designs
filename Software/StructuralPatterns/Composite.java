import java.util.*;

interface Component {
    void showDetails();
}

class Leaf implements Component {
    private String name;

    Leaf(String name) {
        this.name = name;
    }

    public void showDetails() {
        System.out.println(name);
    }
}

class Composite implements Component {
    private List<Component> children = new ArrayList<>();

    public void add(Component component) {
        children.add(component);
    }

    public void showDetails() {
        for (Component c : children) {
            c.showDetails();
        }
    }
}

public class CompositeDemo {
    public static void main(String[] args) {
        Leaf leaf1 = new Leaf("File1.txt");
        Leaf leaf2 = new Leaf("File2.txt");

        Composite folder = new Composite();
        folder.add(leaf1);
        folder.add(leaf2);

        folder.showDetails();
    }
}