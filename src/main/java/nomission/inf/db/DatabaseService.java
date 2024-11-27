package nomission.inf.db;

public class DatabaseService {
    private DatabaseConnection connection;

    public DatabaseService(DatabaseConnection connection){
        this.connection = connection;
    }

    public void performDbOperation(){
        connection.connect();
        connection.disconnect();
    }
}
