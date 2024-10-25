//Con of below code 
//1. Application startup time might increase;
//2. wastage of resources
public class DatabaseConnection2 {
    private static DatabaseConnection2 dbc = new DatabaseConnection2();

    private  DatabaseConnection2() {System.out.println("no object can be intantiated or created");}

    public static DatabaseConnection2 getInstance(){
        return dbc;
    }

}

