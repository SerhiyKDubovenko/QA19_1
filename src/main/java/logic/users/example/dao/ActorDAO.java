package logic.users.example.dao;

import logic.users.example.enity.Actor;

import java.util.List;

public interface ActorDAO {

    List<Actor> getActorsList();
    boolean updateActor(Actor actor);
    boolean deleteActor( Actor actor);
    boolean addActor(Actor actor);

}
