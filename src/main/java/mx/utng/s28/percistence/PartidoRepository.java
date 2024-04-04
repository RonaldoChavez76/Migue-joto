package mx.utng.s28.percistence;

import org.springframework.data.repository.CrudRepository;

import mx.utng.s28.model.Partido;

public interface PartidoRepository extends CrudRepository <Partido, Long>{
    
}
