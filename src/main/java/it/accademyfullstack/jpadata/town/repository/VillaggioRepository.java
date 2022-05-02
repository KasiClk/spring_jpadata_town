package it.accademyfullstack.jpadata.town.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import it.accademyfullstack.jpadata.town.model.Villaggio;

public interface VillaggioRepository extends JpaRepository<Villaggio, Long> {

}
