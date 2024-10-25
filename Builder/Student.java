package Builder;

import javax.management.RuntimeErrorException;

public class Student {
    private String name;
    private int age;
    private double psp;
    private String batch;
    private String gradYear;
    private String phone;

    public Student(Builder builder){
        if(builder.getAge() > 100){
            throw new RuntimeErrorException(null);
        }
        this.name = builder.getName();
        this.age = builder.getAge();
        this.psp = builder.getPsp();
        this.batch = builder.getBatch();
        this.gradYear = builder.getGradYear();
        this.phone = builder.getPhone();
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
    public String getBatch() {
        return batch;
    }
    public void setBatch(String batch) {
        this.batch = batch;
    }
    public String getGradYear() {
        return gradYear;
    }
    public void setGradYear(String gradYear) {
        this.gradYear = gradYear;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public static Builder builder() {
        return new Builder();
    }
}
