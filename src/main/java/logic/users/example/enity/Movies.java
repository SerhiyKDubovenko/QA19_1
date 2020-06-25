package logic.users.example.enity;

import lombok.Data;

import javax.persistence.*;


/**
 * @author Serhiy Dubovenko
 */
@Data
@Entity
@Table(name="Movies")
public class Movies {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="MovieID")
    private int id;

    @Column(name="Movies")
    private String movies;

    @Column(name="DirectorKey")
    private int directorKey;

    @Column(name="StudioKey")
    private int studioKey;

    @Column(name="RunningTime")
    private int runningTime;

    @Column(name="Budget")
    private int budget;

    @Column(name="BoxOffice")
    private int boxOffice;

    @Column(name="CountryKey")
    private int countryKey;

    @Column(name="LanguageKey")
    private int languageKey;

    @Column(name="Year")
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
