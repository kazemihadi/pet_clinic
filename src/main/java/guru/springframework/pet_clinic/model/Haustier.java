package guru.springframework.pet_clinic.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Haustier {

    private HausTierType hausTierType;
    private Besitzer besitzer;
    private LocalDate birthday;



    public HausTierType getHausTierType() {
        return hausTierType;
    }

    public void setHausTierType(HausTierType hausTierType) {
        this.hausTierType = hausTierType;
    }

    public Besitzer getBesitzer() {
        return besitzer;
    }

    public void setBesitzer(Besitzer besitzer) {
        this.besitzer = besitzer;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}
