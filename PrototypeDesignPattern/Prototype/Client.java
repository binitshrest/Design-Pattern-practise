package PrototypeDesignPattern.Prototype;

public class Client {


    public void populateRegistryDummy(StudentRegistry studentRegistry){
        //create a student prototypes
        Student apr23BatchPrototype = new Student();
        apr23BatchPrototype.setBatchName("APR23 Beg Java Batch");
        apr23BatchPrototype.setAvgBatchPSP(90.0);

        studentRegistry.register("apr23Beg", apr23BatchPrototype);

        //##########################################################
        IntelligentStudent mar24ISPrototype = new IntelligentStudent();
        mar24ISPrototype.setBatchName("MAR24 Beg Java Batch");
        mar24ISPrototype.setAvgBatchPSP(98.0);

        studentRegistry.register("Mar24Beg", mar24ISPrototype);
    }


    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        
        Client client = new Client();
        client.populateRegistryDummy(studentRegistry);
    
        // Retrieve and use the prototype
        Student binit = studentRegistry.get("apr23Beg");
        binit.setName("Binit Shrestha");
        binit.setAge(27);
        
    }
}
