package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class VotoDAO {
    public boolean registrarVoto(Voto voto) {
        if (votoDuplicado(voto)) {
            return false;
        }
        String sql = "INSERT INTO votos (id_estudiante, id_candidato) VALUES (?, ?)";
        try (Connection conn = DataBase.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, voto.getIdEstudiante());
            pstmt.setInt(2, voto.getIdCandidato());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    private boolean votoDuplicado(Voto voto) {
        String sql = "SELECT * FROM votos WHERE id_estudiante = ? AND id_candidato = ?";
        try (Connection conn = DataBase.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, voto.getIdEstudiante());
            pstmt.setInt(2, voto.getIdCandidato());
            ResultSet rs = pstmt.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
