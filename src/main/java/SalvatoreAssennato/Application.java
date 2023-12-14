package SalvatoreAssennato;

import SalvatoreAssennato.DAO.EventoDAO;
import SalvatoreAssennato.entities.Evento;
import SalvatoreAssennato.entities.EventoType;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestioneeventi");
    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        EventoDAO ed=new EventoDAO(em);

        Evento musicale=new Evento("Pinguini Tattici nucleari", LocalDate.of(2023,12,12),"evento musicale a San Siro",EventoType.PUBLICO,20000 );
        //ed.save(musicale);
        Evento partyCaraibi=new Evento("festa ai Caraibi",LocalDate.of(2024,7,18),"balletti tipici dei caraibi",EventoType.PRIVATO,300);
        //ed.save(partyCaraibi);
// ************************************ FIND BY ID ********************************
        long id=2;
         Evento musicaFromDb=ed.findByid(id);
        if (musicaFromDb != null) {
            System.out.println(musicaFromDb);
        } else {
            System.out.println("Evento con id " + id + " non trovato");
        }
        // metodo per cancellare tramite ID
        ed.findByIdAndDelete(5);

        em.close();
        emf.close();
    }
}
