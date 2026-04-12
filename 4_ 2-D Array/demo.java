class Person {
    String name;
    int age;

    void talk() {
        System.out.println("Hello " + name);
        System.out.println("Age: " + age);
    }
}

class Demo {
    public static void main(String[] args) {
        Person raju = new Person();
        raju.name = "Raju";
        raju.age = 22;

        raju.talk();
        System.out.println("Hash Code = " + raju.hashCode());
    }
}
