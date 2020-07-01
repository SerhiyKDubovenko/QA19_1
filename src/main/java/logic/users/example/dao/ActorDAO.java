package logic.users.example.dao;

import logic.users.example.enity.Actor;
import logic.users.example.enity.Movies;
import org.hibernate.Session;

import java.util.List;

public interface ActorDAO {

    List<Actor> getActorsList();
    boolean updateActor(Actor actor);
    boolean deleteActor( Actor actor);
    boolean addActor(Actor actor);
    void addActorJPA(Session session, Actor actor);
    List<Actor> getActorsJPA(Session session);
}
