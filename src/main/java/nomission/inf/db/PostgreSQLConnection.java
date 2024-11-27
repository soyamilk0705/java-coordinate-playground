package nomission.inf.db;

public class PostgreSQLConnection implements DatabaseConnection {
    @Override
    public void connect() {
        System.out.println("Connecting to PostgreSQL...");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from PostgreSQL...");
    }
}
