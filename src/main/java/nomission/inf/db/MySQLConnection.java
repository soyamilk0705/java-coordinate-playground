package nomission.inf.db;

public class MySQLConnection implements DatabaseConnection{
    @Override
    public void connect() {
        System.out.println("Connecting to MySQL...");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from MySQL...");
    }
}
