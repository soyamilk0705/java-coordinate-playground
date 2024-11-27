package nomission.inf.db;

public class Main {
    public static void main(String[] args) {
        DatabaseService mysqlService = new DatabaseService(new MySQLConnection());

        DatabaseService postreService = new DatabaseService(new PostgreSQLConnection());

        mysqlService.performDbOperation();
        postreService.performDbOperation();
    }

    // spring 에서 Repository 인터페이스를 통해 DB 를 사용하는데 이와 같은 원리
    // 1. application.properties 같은 설정 파일에서 DB 정보 읽음
    // 2. Spring IoC 컨테이너가 위에 new MySQLConnection(), PostgreSQLConnection 같은 DB 연결 객체를 생성해 자동으로 주입
    // 3. service 코드에서 repository 인터페이스 주입 받아서 사용

}
