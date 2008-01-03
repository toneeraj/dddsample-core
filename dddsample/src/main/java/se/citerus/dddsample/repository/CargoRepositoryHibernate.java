package se.citerus.dddsample.repository;

import org.hibernate.SessionFactory;
import se.citerus.dddsample.domain.Cargo;
import se.citerus.dddsample.domain.TrackingId;

public class CargoRepositoryHibernate implements CargoRepository {

  private SessionFactory sessionFactory;

  public void setSessionFactory(SessionFactory sessionFactory) {
    this.sessionFactory = sessionFactory;
  }

  public Cargo find(TrackingId trackingId) {
    return (Cargo) sessionFactory.getCurrentSession().
            get(Cargo.class, trackingId);
  }
}