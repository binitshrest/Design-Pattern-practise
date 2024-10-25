//This above solution is only applicable to single threaded env

public class DatabaseConnection {
    private static DatabaseConnection dbc = null;
    String url;
    String userName;
    String password;

    private DatabaseConnection(){
        System.out.println("no object can be intantiated or created");
    }

    public static DatabaseConnection getInstance(){
        if(dbc == null) {
            dbc = new DatabaseConnection();
            System.out.println("intialized for  the first time");
        }

        System.out.println("Database is already created");
        return dbc;
    }
}
