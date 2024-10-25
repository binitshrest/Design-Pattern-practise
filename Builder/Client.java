package Builder;

public class Client {
    public static void main(String[] args) {
        Builder builder = Student.builder();
        builder.setName("Binit");
        builder.setBatch("Beginner");
        builder.setAge(20);

        Student student = builder.build();
        
    }
}
