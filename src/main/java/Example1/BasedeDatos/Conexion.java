package Example1.BasedeDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Conexion {

    public static void disconnect(Connection conn) {

            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }


            public static Connection connect () {
                // SQLite connection string
                String url = "jdbc:sqlite:D:\\DOCUMENTOS\\proyectos\\BasedeDatosMaven\\Bd\\sql.db";
                Connection conn = null;
                try {
                    conn = DriverManager.getConnection(url);
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
                return conn;
            }

        }



