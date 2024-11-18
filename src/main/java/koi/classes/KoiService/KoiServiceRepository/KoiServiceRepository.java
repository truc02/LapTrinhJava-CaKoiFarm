package koi.classes.KoiService.KoiServiceRepository;

import koi.classes.KoiService.KoiService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class KoiServiceRepository implements IKoiServiceRepository {

    private final SessionFactory sessionFactory;

    // Constructor nhận vào tên tệp cấu hình
    public KoiServiceRepository(String configFileName) {
        Configuration configuration = new Configuration();
        configuration.configure(configFileName);
        this.sessionFactory = configuration.buildSessionFactory();
    }

    @Override
    public void add(KoiService koiService) {
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.save(koiService);
            tx.commit();
        } catch(Exception e) {
            if(tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close(); //
        }
    }

    @Override
    public void delete(int id) {
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            KoiService koiService = (KoiService) session.get(KoiService.class, id);
            if (koiService != null) {
                session.delete(koiService);
                tx.commit();
            }
        } catch(Exception e) {
            if(tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    @Override
    public void update(KoiService koiService) {
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.update(koiService);
            tx.commit();
        } catch(Exception e) {
            if(tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    @Override
    public KoiService findById(int id) {
        Session session = sessionFactory.openSession();
        KoiService koiService = null;
        try {
            koiService = (KoiService) session.get(KoiService.class, id);
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return koiService;
    }

    @Override
    public List<KoiService> findAll() {
        Session session = sessionFactory.openSession();
        List<KoiService> koiServices = null;
        try {
            koiServices = session.createQuery("FROM KoiService").list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return koiServices;
    }

    public void shutdown() {
        sessionFactory.close();
    }
}
