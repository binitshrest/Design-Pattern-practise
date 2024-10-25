public class DatabaseConnection4 implements Runnable {
    // Using volatile to ensure visibility of changes to the instance across threads
    private static volatile DatabaseConnection4 dbc = null;

    private String url;
    private String username;
    private String password;

    // Constructor to prevent instantiation
    private DatabaseConnection4() {
        System.out.println("No object can be initialized");
    }

    @Override
    public void run() {
        // Logic for thread-specific tasks can be added here
    }

    // Thread-safe method to return the singleton instance
    public static DatabaseConnection4 getInstance() {
        if (dbc == null) { // First check (no locking)
            synchronized (DatabaseConnection4.class) { // Locking at class level
                if (dbc == null) { // Second check (after acquiring lock)
                    dbc = new DatabaseConnection4(); // Lazy initialization
                }
            }
        }
        return dbc;
    }

    // Example method to set database connection details
    public void setConnectionDetails(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    // Example method to display connection details
    public void displayConnectionDetails() {
        System.out.println("URL: " + url);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }
}
