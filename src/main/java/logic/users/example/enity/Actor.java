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
}
