package s1510.demo.service;

import org.springframework.http.ResponseEntity;
import s1510.demo.dtos.SportDTO;
import s1510.demo.model.Sport;

import java.util.List;
import java.util.Optional;

public interface SportService {

    List<Sport> findAll();
    Optional<Sport> findById(Long sportId);
    Sport create(SportDTO saveSport);
    Sport update(Long sportId, SportDTO updateSport);
    ResponseEntity<Sport> delete(Long sportId);

    void disabled(Long id);
    void enabled(Long id);

}
