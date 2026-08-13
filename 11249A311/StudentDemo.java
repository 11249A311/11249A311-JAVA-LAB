class Student {
    String name;
    int rollNo;
    int marks;

    // Constructor
    Student(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    // Method to calculate grade
    char calculateGrade() {
        if (marks >= 90)
            return 'A';
        else if (marks >= 75)
            return 'B';
        else if (marks >= 60)
            return 'C';
        else if (marks >= 50)
            return 'D';
        else
            return 'F';
    }

    // Method to display student information
    void display() {
        System.out.println("Name    : " + name);
        System.out.println("Roll No : " + rollNo);
        System.out.println("Marks   : " + marks);
        System.out.println("Grade   : " + calculateGrade());
        System.out.println();
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Arun", 101, 85);
        Student s2 = new Student("Priya", 102, 92);

        s1.display();
        s2.display();
    }


}