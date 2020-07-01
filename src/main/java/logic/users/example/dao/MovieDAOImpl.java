package logic.users.example.dao;

import logic.users.persistence.HibernateUtil;
import logic.users.example.enity.Movies;
import org.hibernate.Session;

import java.util.List;

/**
 * @author Serhiy Dubovenko
 */
public class MovieDAOImpl implements MovieDAO {

    @Override
    public List<Movies> getMovies(Session session) {
        List<Movies> list = session.createQuery("from Movies").list();
        session.close();
        return list;
    }



    @Override
    public void updateMovie(Session session, Movies movies) {
        session.clear();
        session.beginTransaction();
        session.update(movies);
        session.flush();
        session.getTransaction().commit();

    }

    @Override
    public void deleteMovie(Session session, Movies movies) {
        session.beginTransaction();
        session.delete(movies);
        session.getTransaction().commit();

    }

    @Override
    public void addMovie(Session session, Movies movies) {
        session.beginTransaction();
        session.save(movies);
        session.getTransaction().commit();

    }

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        // GET
        List<Movies> list = new MovieDAOImpl().getMovies(session);
        list.forEach(x->{
                    System.out.println(x.toString());
                }
        );

        // ADD
       // Movies m1 = new Movies("test", 1, 3, 120, 125, 500, 37, 17, 2005);
      //  new MovieDAOImpl().addMovie(session, m1);

        //UPDATE
        //Movies m2 = new Movies(21, "test", 1, 3, 140, 125, 500, 37, 17, 2005);
      //    new MovieDAOImpl().updateMovie(session, m2);

        //DELETE
     //   new MovieDAOImpl().deleteMovie(session, m2);
        session.close();

    }

}
