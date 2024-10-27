package PrototypeDesignPattern.Prototype;

public class Student implements Prototype<Student>{
    private String name;
    private int age;
    private double psp;
    private String batchName;
    private double avgBatchPSP;

    @Override
    public Student clone() {
        Student copy = new Student();
        copy.name = this.name;
        copy.age = this.age;
        copy.psp = this.psp;
        copy.batchName = this.batchName;
        copy.avgBatchPSP = this.avgBatchPSP;

        return copy;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public double getPsp() {
        return psp;
    }
    public void setPsp(double psp) {
        this.psp = psp;
    }
    public String getBatchName() {
        return batchName;
    }
    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }
    public double getAvgBatchPSP() {
        return avgBatchPSP;
    }
    public void setAvgBatchPSP(double avgBatchPSP) {
        this.avgBatchPSP = avgBatchPSP;
    }
}