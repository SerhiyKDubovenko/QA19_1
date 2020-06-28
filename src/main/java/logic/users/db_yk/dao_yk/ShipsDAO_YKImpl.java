package logic.users.db_yk.dao_yk;

import logic.users.HibernateUtil;
import logic.users.db_yk.enity_yk.Ships;
import org.hibernate.Session;

import java.util.List;

public class ShipsDAO_YKImpl implements ShipsDAO {
    @Override
    public List<Ships> getShipsList(Session session) {
        List list = session.createQuery("from Ships").list();
        session.close();
        return list;
    }

    @Override
    public void updateShips(Session session, Ships ships) {
        session.clear();
        session.beginTransaction();
        session.update(ships);
        session.flush();
        session.getTransaction().commit();

    }

    @Override
    public void deleteShips(Session session, Ships ships) {
        session.beginTransaction();
        session.delete(ships);
        session.getTransaction().commit();

    }

    @Override
    public void addShips(Session session, Ships ships) {
        session.beginTransaction();
        session.save(ships);
        session.getTransaction().commit();

    }

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        // GET
        List<Ships> list;
        list = new ShipsDAO_YKImpl().getShipsList(session);
        list.forEach(x->{
                    System.out.println(x.toString());
                }
        );

        // ADD
        Ships sh1 = new Ships("xxx","1","1","1","1","1","1","1","1","1","1");
        new ShipsDAO_YKImpl().addShips(session, sh1);

        //UPDATE
        Ships sh2 = new Ships("", "","","","","","","","","","","");
        new ShipsDAO_YKImpl().updateShips(session, sh2);

        //DELETE
        new ShipsDAO_YKImpl().deleteShips(session, sh2);
        session.close();

    }

}
