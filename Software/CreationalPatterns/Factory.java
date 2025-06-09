interface Animal {
    void speak();
}

class Dog implements Animal {
    public void speak() {
        System.out.println("Woof!");
    }
}

class Cat implements Animal {
    public void speak() {
        System.out.println("Meow!");
    }
}

class AnimalFactory {
    public Animal createAnimal(String type) {
        if (type.equalsIgnoreCase("dog")) return new Dog();
        else if (type.equalsIgnoreCase("cat")) return new Cat();
        return null;
    }
}

public class FactoryDemo {
    public static void main(String[] args) {
        AnimalFactory factory = new AnimalFactory();
        Animal a1 = factory.createAnimal("dog");
        a1.speak();

        Animal a2 = factory.createAnimal("cat");
        a2.speak();
    }
}