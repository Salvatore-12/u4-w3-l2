package SalvatoreAssennato.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "events")
public class Evento {
    @Id
    @GeneratedValue
    private long id;

    @Column(name = "titolo")
    private String title;

    @Column(name = "data_evento")
    private LocalDate dateEvent;

    @Column(name="descrizione")
    private String description;
    @Column(name = "tipo")
    @Enumerated(EnumType.STRING)
    private EventoType eventoType;
    @Column(name = "numero_massimo_partecipanti")
    private int numberMaxPartecipants;
    public Evento(){};
    public Evento(String title, LocalDate dateEvent, String description, EventoType eventoType, int numberMaxPartecipants) {
        this.title = title;
        this.dateEvent = dateEvent;
        this.description = description;
        this.eventoType = eventoType;
        this.numberMaxPartecipants = numberMaxPartecipants;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDateEvent() {
        return dateEvent;
    }

    public void setDateEvent(LocalDate dateEvent) {
        this.dateEvent = dateEvent;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EventoType getEventoType() {
        return eventoType;
    }

    public void setEventoType(EventoType eventoType) {
        this.eventoType = eventoType;
    }

    public int getNumberMaxPartecipants() {
        return numberMaxPartecipants;
    }

    public void setNumberMaxPartecipants(int numberMaxPartecipants) {
        this.numberMaxPartecipants = numberMaxPartecipants;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", dateEvent=" + dateEvent +
                ", description='" + description + '\'' +
                ", eventoType=" + eventoType +
                ", numberMaxPartecipants=" + numberMaxPartecipants +
                '}';
    }
}

