package logic.users.example.enity;

import lombok.Data;

/**
 * @author Serhiy Dubovenko
 */

@Data
public class Movies {

    // MovieID, Movies, DirectorKey, StudioKey, RunningTime, Budget, BoxOffice, CountryKey, LanguageKey, Year
    private int id;
    private String movies;
    private int directorKey;
    private int studioKey;
    private int runningTime;
    private int budget;
    private int boxOffice;
    private int countryKey;
    private int languageKey;
    private int year;

    public Movies() {
    }

    public Movies(String movies, int directorKey, int studioKey, int runningTime, int budget, int boxOffice, int countryKey, int languageKey, int year) {
        this.movies = movies;
        this.directorKey = directorKey;
        this.studioKey = studioKey;
        this.runningTime = runningTime;
        this.budget = budget;
        this.boxOffice = boxOffice;
        this.countryKey = countryKey;
        this.languageKey = languageKey;
        this.year = year;
    }

    public Movies(int id, String movies, int directorKey, int studioKey, int runningTime, int budget, int boxOffice, int countryKey, int languageKey, int year) {
        this.id = id;
        this.movies = movies;
        this.directorKey = directorKey;
        this.studioKey = studioKey;
        this.runningTime = runningTime;
        this.budget = budget;
        this.boxOffice = boxOffice;
        this.countryKey = countryKey;
        this.languageKey = languageKey;
        this.year = year;
    }
}