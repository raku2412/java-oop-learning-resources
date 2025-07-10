package model;

// Please do not specify multiple classes in a single file; this is only for showing inheritance.
public class InheritanceExample {

    public static void main(String[] args) {
        Parent parent = new Parent("ParentName");
        Child child = new Child("ChildName");

        System.out.println(parent.getName());
        System.out.println(child.getName());
    }
}

class Parent {
    private String name;

    public Parent(String name) {
        this.name = name;
    }

    public String getName() {
        return "Parent: " + name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

class Child extends Parent {

    public Child(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return "Child: " + super.getName();
    }

    public void setName(String name) {
        super.setName(name);
    }
}
