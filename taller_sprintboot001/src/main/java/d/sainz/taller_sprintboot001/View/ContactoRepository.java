package d.sainz.taller_sprintboot001.View;

import d.sainz.taller_sprintboot001.Model.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//este repositorio nos da la facilidad de interactuar con la base de datos atraves de las operaciones y las consultas
//es una forma sofisticada de consultar y hacer consultas

//en el fondo es una forma de utiliza JPA java persiten api una especificacion parte de de la plataforma java entrerpraice edition
@Repository
public interface ContactoRepository extends JpaRepository<Contacto,Integer> {
}
