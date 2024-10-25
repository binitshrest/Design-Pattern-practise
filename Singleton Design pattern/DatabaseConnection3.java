public class DatabaseConnection3 {
    private static DatabaseConnection3 dbc = null;

    String url;
    String username;
    String password;

    private DatabaseConnection3(){System.out.println("no object can initialised");}
    public synchronized static DatabaseConnection3 getInstance(){
        if(dbc == null){
            dbc = new DatabaseConnection3();
            System.out.println("created new object and enter if condition");
        }
        System.out.println("executing...");
        return dbc;
    }
}
