package at.htl.vehicle.rental;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

@ApplicationScoped
public class RentalDao {

    @Inject
    EntityManager em;

    public List<Rental> findAll() {
        return em.createQuery("select r from Rental r", Rental.class)
                .getResultList();
    }

}
