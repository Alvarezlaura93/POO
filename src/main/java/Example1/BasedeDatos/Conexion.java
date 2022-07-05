package Example1.BasedeDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Conexion {

        public static void connect() {
            Connection conn = null;
            try {
                // db parameters
                Class.forName("org.sqlite.JDBC");
                String url = "jdbc:sqlite:D:\\DOCUMENTOS\\proyectos\\BasedeDatosMaven\\Bd\\sql.db";
                // create a connection to the database
                conn = DriverManager.getConnection(url);

                System.out.println("Connection to SQLite has been established.");

            } catch (SQLException e) {
                System.out.println(e.getMessage());
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            } finally {
                try {
                    if (conn != null) {
                        conn.close();
                    }
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }



}
