package gestion.notes.jdbc1;

import gestion.notes.jdbc1.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Map;

@SpringBootApplication
public class Jdbc1Application implements CommandLineRunner {

    @Autowired
    private NoteRepository noteRepository;

    public static void main(String[] args) {
        SpringApplication.run(Jdbc1Application.class, args);
    }

    @Override
    public void run(String... args) {
        List<Map<String, Object>> notes = noteRepository.getAllNotes();
        if (notes.isEmpty()) {
            System.out.println("Aucune note trouvée.");
        } else {
            notes.forEach(note -> System.out.println("Note : " + note));
        }
    }
}
