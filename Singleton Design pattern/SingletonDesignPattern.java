class SingletonDesignPattern{
    public static void main(String[] args) {
        // DatabaseConnection dbc =  DatabaseConnection.getInstance();
        // DatabaseConnection dbc1 =  DatabaseConnection.getInstance();
        // DatabaseConnection  dbc2 =  DatabaseConnection.getInstance();

        // System.out.println(dbc);
        // System.out.println(dbc1);
        // System.out.println(dbc2);

        DatabaseConnection2 db =   DatabaseConnection2.getInstance();
        DatabaseConnection2 db1  =   DatabaseConnection2.getInstance();
        DatabaseConnection2 db2 =    DatabaseConnection2.getInstance();
        System.out.println(db);
        System.out.println(db1);
        System.out.println(db2);

        DatabaseConnection3 d =   DatabaseConnection3.getInstance();
        DatabaseConnection3 d1  =   DatabaseConnection3.getInstance();
        DatabaseConnection3 d2 =    DatabaseConnection3.getInstance();
        System.out.println(d);
        System.out.println(d1);
        System.out.println(d2);
    }
}