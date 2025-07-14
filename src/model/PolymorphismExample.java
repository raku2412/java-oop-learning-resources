package model;

// Please do not specify multiple classes in a single file; this is only for showing inheritance.
public class PolymorphismExample {

    @SuppressWarnings({"ConstantValue", "PatternVariableCanBeUsed", "CastCanBeRemovedNarrowingVariableType"})
    public static void main(String[] args) {

        Parent parent = new Parent("ParentName");
        Child child = new Child("ChildName");

        Parent reference1 = new Child("PolymorphChild1");
        Parent reference2 = new Parent("RegularParent");

        System.out.println(parent.getName());
        System.out.println(child.getName());

        System.out.println(reference1.getName());
        System.out.println(reference2.getName());

        if (reference1 instanceof Child) {
            Child actualChild = (Child) reference1;
            actualChild.setName("UpdatedName");
            System.out.println(actualChild.getName());
        }
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
