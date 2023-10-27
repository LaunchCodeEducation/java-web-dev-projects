package org.launchcode.codingevents.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;

import java.util.Objects;

@Entity
public class Event extends AbstractEntity{
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters.")
    @NotBlank(message = "Name is required.")
    private String name;
    @Size(max = 500, message = "Description is too long.")
    @NotBlank(message = "Description is required.")
    private String description;
    @Email(message = "Invalid email. Try again.")
    @NotBlank(message = "Email is required.")
    private String contactEmail;

    @NotBlank(message = "Event street address is required.")
    private String address;

    private Boolean registrationRequired;

    @Positive(message = "Number of attendees must be greater than zero.")
    private int numAttendees;

@NotBlank(message="Event zipcode required.")
@Size(min=5, max=5, message="Must enter 5-digit zipcode")
    private String zipcode;

//    @Id
//    @GeneratedValue
//    private int id; gone to the abstract entity
    // not needed when using persistent class private static int nextId=1;

    private EventType type;

    public Event(String name, String description, String contactEmail, String address, String zipcode, Boolean registrationRequired, int numAttendees, EventType type) {
//        this(); this no longer sets id since second constructor is now blank. persistent class change
        this.name = name;
        this.description = description;
        this.contactEmail = contactEmail;
        this.address = address;
        this.zipcode = zipcode;
        this.registrationRequired = registrationRequired;
        this.numAttendees = numAttendees;
        this.type = type;

    }
    public Event() {
//        this.id=nextId;
//        nextId++; not needed when using persistent class
    }

    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
    }

    public int getNumAttendees() {
        return numAttendees;
    }

    public void setNumAttendees(int numAttendees) {
        this.numAttendees = numAttendees;
    }

    public Boolean getRegistrationRequired() {
        return registrationRequired;
    }

    public void setRegistrationRequired(Boolean registrationRequired) {
        this.registrationRequired = registrationRequired;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

//    public int getId() {
//        return id;
//    } gone to the abstractentity

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Event event = (Event) o;
//        return id == event.id;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id);
//    } gone to abstract entity 4/4

}
