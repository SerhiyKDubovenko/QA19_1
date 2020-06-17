package logic.users.db_kb.entity_kb;
import lombok.Data;

@Data

public class Movies {

    private int moviesID;
    private String name;
    private int genre_key;
    private int timing;
    private int rating;
    private int countryKey;
    private int ageRestrictions;
    private int filmDistributionKey;
    private int translationOfTheFilmKey;
    private int imageQualityKey;
    private int  languageKey;
    private int  producerKey;
    private int  rewardsKey;

    public Movies(int moviesID, String name, int genreKey, String timing, String yearOfBirth, String countryKey) {
    }

    public Movies() {
    }

}

