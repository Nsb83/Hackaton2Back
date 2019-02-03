package fr.wild.Hackaton.model;


import javax.persistence.*;

@Entity
@Table(name = "phone")
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String brand;
    private String model;
    private String phoneNote;
    private Integer phoneScore;

    private Phone (){}

    private Phone (String brand, String model, String phoneNote, Integer phoneScore) {
        this.brand = brand;
        this.model = model;
        this.phoneNote = phoneNote;
        this.phoneScore = phoneScore;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String phone) {
        this.model = phone;
    }

    public String getPhoneNote() {
        return phoneNote;
    }

    public void setPhoneNote(String phoneNote) {
        this.phoneNote = phoneNote;
    }

    public int getPhoneScore() {
        return phoneScore;
    }

    public void setPhoneScore(int phoneScore) {
        this.phoneScore = phoneScore;
    }
}
