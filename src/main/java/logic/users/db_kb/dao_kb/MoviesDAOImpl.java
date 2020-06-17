package logic.users.db_kb.dao_kb;

import logic.users.db_kb.entity_kb.Movies;
import logic.users.example.dao.BaseDAO;
import logic.users.example.enity.Actor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MoviesDAOImpl extends BaseDAOKB implements MoviesDAO {
    public List<Movies> getMoviesList (){
        List<Movies> moviesList = new ArrayList<Movies>();
        try {
            Statement statement = connection.createStatement();
            statement.execute( "select MoviesID, Name, GenreKey, Timing, Rating, CountryKey, AgeRestrictions, DistributionKey, Translation, ImageQuality, LanguageKey, ProducerKey, RewardsKey  from Movies");
            ResultSet rs = statement.getResultSet();
            while (rs.next()) {
                moviesList.add( new Movies (rs.getInt("MoviesID"),
                        rs.getString("Name"),
                        rs.ge


                        ) );
            }


    } catch (SQLException e) {
            e.printStackTrace();
        }

    }
