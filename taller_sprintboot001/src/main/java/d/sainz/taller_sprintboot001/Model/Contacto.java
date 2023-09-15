package d.sainz.taller_sprintboot001.Model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;

//usamos parametros de entidad es dicir que vendra apertir de una tabla de base de datos y datos
@Entity
@Data
public class Contacto {
    //identicamos el id de la entidas con el parametro @Id  adenas para que este valor se genere de forma automatica usamos el parametro @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private String nombre;
    @Column
    private String email;
    @Column
    private int telefono;
    @Column
    private String direccion;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate fechaNacimineto;
    @DateTimeFormat(iso =DateTimeFormat.ISO.DATE)
    private LocalDate fechaRegitro;
    public Contacto() {
    }

    @PrePersist
    public void asignarFechaRegistro(){
        fechaRegitro= LocalDate.now();
    }
}
