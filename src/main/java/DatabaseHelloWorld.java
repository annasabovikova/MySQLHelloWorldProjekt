import java.sql.SQLException;

public class DatabaseHelloWorld {
    public static void main(String[] args) throws SQLException {
        DatabazaMetody.uloz();
        DatabazaMetody.odstran();
        DatabazaMetody.aktualizuj();
        DatabazaMetody.vyber();
    }
}