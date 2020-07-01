package logic.users.example.dao;

import logic.users.example.ConnectionManager;
import logic.users.example.enity.Actor;
import logic.users.example.enity.Movies;
import org.hibernate.Session;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ActorDAOImpl extends BaseDAO implements ActorDAO {

    public List<Actor> getActorsList() {
        List<Actor> actorList = new ArrayList<Actor>();
        try {
            Statement statement = connection.createStatement();
            statement.execute("select ActorID, Name, Midlename, Surname, YearOfBirth, CountryKey from Actor");
            ResultSet rs = statement.getResultSet();
            while (rs.next()) {
                actorList.add(new Actor(rs.getString("ActorID"),
                        rs.getString("Name"),
                        rs.getString("Midlename"),
                        rs.getString("Surname"),
                        rs.getString("YearOfBirth"),
                        rs.getString("CountryKey")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return actorList;
    }



    public boolean updateActor(Actor actor) {
        Actor actorForUpdate  =getActorsList().stream().filter(o ->o.getName().contains(actor.getName()))
                .filter(o -> o.getSurname().contains(actor.getSurname()))
                .findFirst().get();
        try {
            Statement statement = connection.createStatement();
            statement.execute("UPDATE Actor a SET  a.Name = '"+actor.getName()+"', a.Surname='"+actor.getSurname()+"', a.YearOfBirth="+actor.getYearOfBirth()+", a.CountryKey="+actor.getCountryKey()+"  WHERE a.ActorID = "+actorForUpdate.getActorID());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return getActorsList().stream().filter(o -> Integer.valueOf(o.getActorID()) == Integer.valueOf(actorForUpdate.getActorID())).filter(o -> o.getSurname().contains(actor.getSurname())).findFirst().isPresent();
    }

    public boolean deleteActor(Actor actor) {

        Actor actorForDelete  =getActorsList().stream().filter(o ->o.getName().contains(actor.getName()))
                .filter(o -> o.getSurname().contains(actor.getSurname()))
                .findFirst().get();

        try {
            Statement statement = connection.createStatement();
            statement.execute("DELETE FROM Actor WHERE ActorID = "+actorForDelete.getActorID());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return getActorsList().stream().filter(o ->o.getName().contains(actor.getName()))
                .filter(o -> o.getSurname().contains(actor.getSurname()))
                .findFirst().isPresent();
    }

    public boolean addActor(Actor actor) {
        try {
            Statement statement = connection.createStatement();
            statement.execute("INSERT INTO Actor (Name, Midlename, Surname, YearOfBirth, CountryKey) VALUES ('"+actor.getName()+"', '"+actor.getMidlename()+"', '"+actor.getSurname()+"', "+actor.getYearOfBirth()+", "+actor.getCountryKey()+")");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return getActorsList().stream().filter(o ->o.getName().contains(actor.getName()))
                .filter(o -> o.getSurname().contains(actor.getSurname()))
                .findFirst().isPresent();
    }

    @Override
    public void addActorJPA(Session session, Actor actor) {
        session.beginTransaction();
        session.save(actor);
        session.getTransaction().commit();
    }

    @Override
    public List<Actor> getActorsJPA(Session session) {
        List<Actor> list = session.createQuery("from Actor").list();
        return list;
    }
}
