public class CatRunner {
    public static void main(String[] args) {

        // creating one instance/object from the Rectangle class
        Cat cat1 = new Cat("johj", 6, 12.5);
        cat1.introduce();
        cat1.printCatInfo();  // calling a method on the object

        Cat cat2 = new Cat("jack", 7, 12.5);
        cat2.introduce();
        cat2.printCatInfo();  // calling a method on the object

    }

}
