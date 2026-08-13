class StudentInfo {
    int rollNo;
    String name;

    StudentInfo(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
}

class StudentMarks extends StudentInfo {
    int m1, m2, m3, m4, m5;

    StudentMarks(int rollNo, String name, int m1, int m2, int m3, int m4, int m5) {
        super(rollNo, name);
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.m4 = m4;
        this.m5 = m5;
    }
}

class StudentResult extends StudentMarks {
    int total;
    double average;
    char grade;

    StudentResult(int rollNo, String name, int m1, int m2, int m3, int m4, int m5) {
        super(rollNo, name, m1, m2, m3, m4, m5);
    }

    void calculate() {
        total = m1 + m2 + m3 + m4 + m5;
        average = total / 5.0;

        if (average >= 90)
            grade = 'A';
        else if (average >= 75)
            grade = 'B';
        else if (average >= 60)
            grade = 'C';
        else if (average >= 50)
            grade = 'D';
        else
            grade = 'F';
    }

    void display() {
        calculate();

        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
    }
}

class Main {
    public static void main(String[] args) {
        StudentResult r = new StudentResult(101, "Kumar", 85, 90, 78, 88, 92);
        r.display();
    }
}