public class Student {
    private String name;
    private int age;
    private double weight;
    private double GPA;

    // constructor
    public Student(String StudentName, int StudentAge, double Weight, double StudentGPA) {
        name = StudentName;
        age = StudentAge;
        weight = Weight;
        GPA = StudentGPA;
    }

    public void printStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        System.out.println("GPA: " + GPA);
    }
    public void printGoodStudent(){
        if (GPA >= 3) {               // player 1 is greater
            System.out.println("your GPA is "+GPA + " you are a good student") ;
        } else {                       // they are equal
            System.out.println("your GPA is "+GPA + " you need to study harder") ;
        }
    }
    }
