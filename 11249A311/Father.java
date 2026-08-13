interface Father {
    void fatherProperty();
}

interface Mother {
    void motherProperty();
}

class Child implements Father, Mother {

    public void fatherProperty() {
        System.out.println("Father's property");
    }

    public void motherProperty() {
        System.out.println("Mother's property");
    }

    void childProperty() {
        System.out.println("Child's own property");
    }
}

class Main {
    public static void main(String[] args) {
        Child c = new Child();

        c.fatherProperty();
        c.motherProperty();
        c.childProperty();
    }
}