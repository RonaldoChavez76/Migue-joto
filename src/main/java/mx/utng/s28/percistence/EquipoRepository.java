package mx.utng.s28.percistence;

import org.springframework.data.repository.CrudRepository;

import mx.utng.s28.model.Equipo;

public interface EquipoRepository extends CrudRepository<Equipo, Long>{
    Iterable <Equipo> findByName(String nombre);
}
