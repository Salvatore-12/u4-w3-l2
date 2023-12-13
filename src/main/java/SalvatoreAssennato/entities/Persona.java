package SalvatoreAssennato.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="persons")
public class Persona {

    @Id
    @GeneratedValue
    private long id;
    private String name;

    private String surname;

    private String email;

    private LocalDate dataDiNascita;

    @Enumerated(EnumType.STRING)
    private  SexType sexType;


}
