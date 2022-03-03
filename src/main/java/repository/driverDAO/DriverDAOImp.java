package repository.driverDAO;

import bean.Driver;
import org.hibernate.Session;
import repository.HibernateUtil;

import java.util.List;

public class DriverDAOImp implements DriverDAO{
    @Override
    public List<Driver> getAll() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            List<Driver> drivers = session.createQuery("from Driver").list();
            session.getTransaction().commit();
            return drivers;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Driver getById(int id) {
        return null;
    }

    @Override
    public boolean addNew(Driver driver) {
        return false;
    }

    @Override
    public boolean update(Driver driver) {
        return false;
    }

    @Override
    public boolean delete(Driver driver) {
        return false;
    }

    @Override
    public int getMaxId() {
        return 0;
    }
}
