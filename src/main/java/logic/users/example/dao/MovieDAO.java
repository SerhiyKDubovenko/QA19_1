package logic.users.example.dao;

import logic.users.example.enity.Actor;
import logic.users.example.enity.Movies;
import org.hibernate.Session;

import java.util.List;

/**
 * @author Serhiy Dubovenko
 */
public interface MovieDAO {

    List<Movies> getMovies(Session session);
    void updateMovie(Session session,  Movies movies);
    void deleteMovie(Session session,  Movies movies);
    void addMovie(Session session,  Movies movies);
}
