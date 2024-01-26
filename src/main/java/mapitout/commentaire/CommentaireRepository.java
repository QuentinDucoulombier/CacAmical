package mapitout.commentaire;
import mapitout.caca.Caca;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository
public interface CommentaireRepository extends JpaRepository<Commentaire, Long> {
    List<Commentaire> findByCaca(Caca caca);
}