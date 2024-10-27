package PrototypeDesignPattern.CopyConstructor;

class Student {
    private String name = "Binit";
    private int age = 19;
    private String grade = "A";
    private String batch = "Tuesday";
    private String count = "30";

    // Protected copy constructor
    protected Student(Student student) {
        this.name = student.name;
        this.age = student.age;
        this.grade = student.grade;
        this.batch = student.batch;
        this.count = student.count;
    }

    public Student copy() {
        return new Student(this);
    }

    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", grade=" + grade + ", batch=" + batch + ", count=" + count + "]";
    }
}