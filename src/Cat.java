public class Cat {
    private String name;
    private int age;
    private double weight;

    // constructor
    public Cat(String catName, int catAge, double catWeight) {
        name = catName;
        age = catAge;
        weight = catWeight;
    }

    // method that introduces the Cat
    public void introduce() {
        if (age >= 7) {               // player 1 is greater
            System.out.println("Hello my name is "+name + " im a older cat") ;
        } else {                       // they are equal
            System.out.println("Hello my name is "+name + " im a younger cat") ;
        }
    }

    // method that prints Cat info
    public void printCatInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
    }
}

