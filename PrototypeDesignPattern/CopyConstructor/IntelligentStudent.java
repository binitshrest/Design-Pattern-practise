// IntelligentStudent.java
package PrototypeDesignPattern.CopyConstructor;

public class IntelligentStudent extends Student {
    private int intelligenceLevel = 100;
    private int creativityLevel = 99;

    // Constructor to copy both Student and IntelligentStudent fields
    private IntelligentStudent(IntelligentStudent student) {
        super(student); // Call Student's copy constructor
        this.intelligenceLevel = student.intelligenceLevel;
        this.creativityLevel = student.creativityLevel;
    }

    @Override
    public IntelligentStudent copy() {
        return new IntelligentStudent(this);
    }

    public String toString() {
        return super.toString() + ", IntelligentStudent [intelligenceLevel=" + intelligenceLevel + ", creativityLevel=" + creativityLevel + "]";
    }
}