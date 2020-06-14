package logic.users.example.enity;

import lombok.Data;

@Data

public class Actor {

    // ActorID, Name, Midlename, Surname, YearOfBirth, CountryKey

    private String  actorID;
    private String  Name;
    private String midlename;
    private String surname;
    private String yearOfBirth;
    private String countryKey;

    public Actor() {
    }

    public Actor(String actorID, String name, String midlename,
                 String surname, String yearOfBirth, String countryKey) {
        this.actorID = actorID;
        Name = name;
        this.midlename = midlename;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.countryKey = countryKey;
    }

    public Actor(String name, String midlename, String surname, String yearOfBirth, String countryKey) {
        Name = name;
        this.midlename = midlename;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.countryKey = countryKey;
    }

    public String getActorID() {
        return actorID;
    }

    public void setActorID(String actorID) {
        this.actorID = actorID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getMidlename() {
        return midlename;
    }

    public void setMidlename(String midlename) {
        this.midlename = midlename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getCountryKey() {
        return countryKey;
    }

    public void setCountryKey(String countryKey) {
        this.countryKey = countryKey;
    }
}
