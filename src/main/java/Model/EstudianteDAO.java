package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EstudianteDAO {
    public Estudiante obtenerEstudiante(int id) {
        String sql = "SELECT * FROM estudiantes WHERE id = ?";
        try (Connection conn = DataBase.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return new Estudiante(rs.getInt("id"), rs.getString("nombre"), rs.getString("jornada"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
