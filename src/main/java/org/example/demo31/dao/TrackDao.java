package org.example.demo31.dao;

import jakarta.annotation.Resource;
import jakarta.ejb.Stateless;
import org.example.demo31.data.Track;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class TrackDao {

    @Resource(name = "jdbc/gfldemo")
    private DataSource ds;

    public List<Track> findAll() {
        try (Connection connection = ds.getConnection();
             PreparedStatement ps = connection.prepareStatement(
                     "select track_id, name, milliseconds, unit_price from track")
        ) {
            List<Track> result = new ArrayList<>();
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    result.add(new Track(
                            rs.getInt("track_id"),
                            rs.getString("name"),
                            rs.getInt("milliseconds"),
                            rs.getDouble("unit_price")));
                }
            }
            return result;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
