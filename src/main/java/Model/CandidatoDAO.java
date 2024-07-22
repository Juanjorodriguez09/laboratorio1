package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CandidatoDAO {
    public List<Candidato> obtenerTodosCandidatos() {
        List<Candidato> candidatos = new ArrayList<>();
        String sql = "SELECT * FROM candidatos";
        try (Connection conn = DataBase.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                candidatos.add(new Candidato(rs.getInt("id"), rs.getString("nombre"), rs.getString("jornada"), rs.getString("foto")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return candidatos;
    }
}
