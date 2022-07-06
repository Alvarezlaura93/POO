package Example1.BasedeDatos;
import Example1.Curso;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class ConsultasDb {





    public static List<Curso> selectAll() {
        String sql = "SELECT * FROM cursos";

        List<Curso> cursosRealizado = new ArrayList<>();


        try (Connection conn = Conexion.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            // loop through the result set
            while (rs.next()) {
                System.out.println(rs.getInt("id") + "\t" +
                        rs.getString("nombre") + "\t" +
                        rs.getDouble("cantidadHoras"));
                cursosRealizado.add(new Curso(rs.getString("nombre"), rs.getDouble("cantidadHoras")));

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            return cursosRealizado;
        }


    }
}
