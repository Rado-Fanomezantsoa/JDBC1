package gestion.notes.jdbc1.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class NoteRepository {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public NoteRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public List<Map<String, Object>> getAllNotes() {
        return jdbcTemplate.queryForList("SELECT * FROM notes");
    }

}
