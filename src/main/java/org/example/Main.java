package org.example;

/*

import java.util.ArrayList;
import java.util.List;

class Person {
    private String name;
    private String address;

    public Person() {
        name = "Oli";
        address = "Ida Albergintie Street 1 00400 Helsinki";
    }

    public Person(String name, String address) { //konstruktor neki
        this.name = name;
        this.address = address;
    }

    public String toString() {
        return name + "\n" + address;
    }
}

class Student extends Person {
    private int credit;

    public Student(String name, String address) {
        super(name, address);
        this.credit = 0;
    }

    public void study() {
        credit += 1;
    }

    public String credits() {
        return "Total credit: \n" + credit;
    }
}

class Teacher extends Person {
    private final String salary;

    public Teacher(String name, String salary, String address) {
        super(name, String.valueOf(address));
        this.salary = String.valueOf(salary);
    }

    @Override
    public String toString() {
        return super.toString() + "salary\n" + salary;
    }

    public static void printDepartment(List<Person> people) {
        for (Person person : people) {
            System.out.println(person);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        //a)


        System.out.println( olli );
            Person pekka = new Person("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa");
            Person esko = new Person("Esko Ukkonen", "Mannerheimintie Street 15 00100 Helsinki");
            System.out.println(pekka);
          System.out.println(esko);

//b)
/*

       /* Student olli = new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki");
        System.out.println(olli);
        System.out.println("credits " + olli.credits());
        olli.study();
        System.out.println("credits " + olli.credits());*/

//c)

        /*Teacher pekka = new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200);
        Teacher esko = new Teacher("Esko Ukkonen", "Mannerheimintie 15 Street 00100 Helsinki", 5400);
        System.out.println( pekka );
        System.out.println( esko );


        Student olli = new Student("Olli", "Ida Albergintie 1 Street 00400 Helsinki");
        for ( int i=0; i < 25; i++ ) {
            olli.study();
        }*/

//d
        /*
        List<Person> people = new ArrayList<Person>();
        people.add(new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", "1200"));
        people.add(new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki"));

        Teacher.printDepartment(people);
    }
}
*/

/* II ZADATAK:
enum FillType {
     FILLED,
     NOT_FILLED;
        }

abstract class Shape {
    private String color;
    private FillType fillType;

    public Shape(String color, FillType fillType) {
        this.color = color;
        this.fillType = fillType;
    }

    public abstract double getArea();

    public void displayInfo() {
        System.out.println("Color: " + color);
        System.out.println("Fill type: " + fillType);
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(String color, FillType fillType, double radius) {
        super(color, fillType);
        this.radius = radius;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference(double r, double PI) {
        return 2 * PI * r;
    }

    public double calculateCircumference(double r) {
        final double PI = Math.PI;
        return 2 * PI * r;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, FillType fillType, double width, double height) {
        super(color, fillType);
        this.width = width;
        this.height = height;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area: " + getArea());
    }

    @Override
    public double getArea() {
        return width * height;
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", FillType.FILLED, 5.0);
        circle.displayInfo();

        System.out.println();

        Rectangle rectangle = new Rectangle("Blue", FillType.NOT_FILLED, 3.0, 4.0);
        rectangle.displayInfo();
    }
}
*/

/*
//III ZADATAK:
import java.util.List;

class Person {
    private String name;
    private String address;
    private String country;
    private int age;


    public String getCountry(){
        return country;
    }

    public void setCountry(String c){
        country = c;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int a){
        age = a;
    }

    public Person() {
        name = "Oli";
        address = "Ida Albergintie Street 1 00400 Helsinki";
    }

    public Person(String name, String address) { //konstruktor neki
        this.name = name;
        this.address = address;
    }
    
    public String toString() {
        return name + "\n" + address;
    }
}

class Student extends Person {
    private int credit;

    public Student(String name, String address) {
        super(name, address);
        this.credit = 0;
    }

    public void study() {
        credit += 1;
    }

    public String credits() {
        return "Total credit: \n" + credit;
    }
}

class Teacher extends Person {
    private final String salary;

    public Teacher(String name, String salary, int address) {
        super(name, String.valueOf(address));
        this.salary = String.valueOf(salary);
    }

    @Override
    public String toString() {
        return super.toString() + "salary\n" + salary;
    }

    public static void printDepartment(List<Person> people) {
        for (Person person : people) {
            System.out.println(person);
        }
    }
}

public class Main {
    public static void main(String[] args) {

        //a)

        /*
        System.out.println();

        Person pekka = new Person("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa");
        Person esko = new Person("Esko Ukkonen", "Mannerheimintie Street 15 00100 Helsinki");

        System.out.println(pekka);
        System.out.println(esko);

        Person person = new Person();
        person.setAge(30);
        person.setCountry("USA");

        System.out.println("Age: " + person.getAge());
        System.out.println("Country: " + person.getCountry());
        */

//b)

    /*
        Student olli = new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki");
        System.out.println(olli);
        System.out.println("credits " + olli.credits());

        olli.study();
        System.out.println("credits " + olli.credits());
    */


//c)
    /*
        Teacher pekka = new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200);
        Teacher esko = new Teacher("Esko Ukkonen", "Mannerheimintie 15 Street 00100 Helsinki", 5400);

        System.out.println(pekka);
        System.out.println(esko);


        Student olli = new Student("Olli", "Ida Albergintie 1 Street 00400 Helsinki");

        for (int i = 0; i < 25; i++) {
            olli.study();
            }

    */


//d
        /*
       List<Person> people = new ArrayList<Person>();
        people.add(new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", "1200"));
        people.add(new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki"));

        Teacher.printDepartment(people);
    }
}

         */


/* IV ZADATAK
import java.util.List;
import java.util.ArrayList;

class Person {
    private String name;
    private String address;
    private String country;
    private int age;

    public String getCountry() {
        return country;
    }

    public void setCountry(String c) {
        country = c;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }

    public Person() {
        name = "Oli";
        address = "Ida Albergintie Street 1 00400 Helsinki";
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String toString() {
        return name + "\n" + address;
    }
}

class Student extends Person {
    private int credit;
    private String student_id;
    private List<Integer> grades;

    public Student(String name, String address, String student_id) {
        super(name, address);
        this.student_id = student_id;
        this.credit = 0;
        this.grades = new ArrayList<>();
    }

    public String getStudentId() {
        return student_id;
    }

    public void setStudentId(String id) {
        student_id = id;
    }

    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
        } else {
            System.out.println("Invalid grade. Grade must be between 0 and 100.");
        }
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void study() {
        credit += 1;
    }

    public String credits() {
        return "Total credit: \n" + credit;
    }
}

class Teacher extends Person {
    private final String salary;

    public Teacher(String name, String salary, String address) {
        super(name, address);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSalary: " + salary;
    }

    public static void printDepartment(List<Person> people) {
        for (Person person : people) {
            System.out.println(person);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // a)
        Person pekka = new Person("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa");
        Person esko = new Person("Esko Ukkonen", "Mannerheimintie Street 15 00100 Helsinki");

        System.out.println(pekka);
        System.out.println(esko);

        Person person = new Person();
        person.setAge(30);
        person.setCountry("USA");

        System.out.println("Age: " + person.getAge());
        System.out.println("Country: " + person.getCountry());

        // b)
        Student olli = new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki", "12345");
        System.out.println(olli);
        System.out.println("credits " + olli.credits());

        olli.study();
        System.out.println("credits " + olli.credits());

        // c)
        Teacher pekkaTeacher = new Teacher("Pekka Mikkola", "1200", "Korsontie Street 1 03100 Vantaa");
        Teacher eskoTeacher = new Teacher("Esko Ukkonen", "5400", "Mannerheimintie 15 Street 00100 Helsinki");

        System.out.println(pekkaTeacher);
        System.out.println(eskoTeacher);

        Student olliStudent = new Student("Olli", "Ida Albergintie 1 Street 00400 Helsinki", "67890");

        for (int i = 0; i < 25; i++) {
            olliStudent.study();
        }

        // d)
        List<Person> people = new ArrayList<Person>();
        people.add(pekkaTeacher);
        people.add(eskoTeacher);
        people.add(olliStudent);

        Teacher.printDepartment(people);
    }
}
*/



