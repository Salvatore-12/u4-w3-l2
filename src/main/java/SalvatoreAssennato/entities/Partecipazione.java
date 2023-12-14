package SalvatoreAssennato.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="partecipazione")
public class Partecipazione {
    @Id
    @GeneratedValue
    private long id;
    private Persona partecipante;
    private Evento evento;
    private State stato;

    public Partecipazione() {
    }

    public Partecipazione(Persona partecipante, Evento evento, State stato) {
        this.partecipante = partecipante;
        this.evento = evento;
        this.stato = stato;
    }

    public long getId() {
        return id;
    }

    public Persona getPartecipante() {
        return partecipante;
    }

    public void setPartecipante(Persona partecipante) {
        this.partecipante = partecipante;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public State getStato() {
        return stato;
    }

    public void setStato(State stato) {
        this.stato = stato;
    }

    @Override
    public String toString() {
        return "Partecipazione{" +
                "id=" + id +
                ", partecipante=" + partecipante +
                ", evento=" + evento +
                ", stato=" + stato +
                '}';
    }
}
