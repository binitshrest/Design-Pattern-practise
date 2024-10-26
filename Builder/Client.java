package Builder;

public class Client {
    public static void main(String[] args) {
        // Builder builder = Student.builder();
        // builder.setName("Binit");
        // builder.setBatch("Beginner");
        // builder.setAge(20);

        Student student = Student
                            .builder()
                            .setName("Binit")
                            .setAge(27)
                            .setPsp(99.00)
                            .build();
        
        // Student.Builder  stu =  Student.builder();
    }
}
