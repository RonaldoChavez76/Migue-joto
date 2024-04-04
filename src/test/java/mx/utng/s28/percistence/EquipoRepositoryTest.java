package mx.utng.s28.percistence;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import mx.utng.s28.model.Equipo;

@SpringBootTest
@ComponentScan(basePackages = "mx.utng.s28")
@ExtendWith(SpringExtension.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class EquipoRepositoryTest {
@Autowired/**este crea un obajeto es como el (= new) */
    private EquipoRepository repository;

    @BeforeAll/**Antes de todo limpia las tablas de las base de datos */
    void cleanDatabase(){
        repository.deleteAll();
    }
@Test
    void canSave(){
        //Instancia un equipo
        Equipo equipo = new Equipo();
        equipo.setNombre("America");

        //Guardo el equipo
        equipo = repository.save(equipo);

        //Prueba de que se guardo un equipo
        assertNotNull(equipo.getId());

    }
    @Test
    @DisplayName("Buscar por nombre")
    void canFindByName(){
        String name ="Chivas";

        Equipo equipo = new Equipo();

    }

}

