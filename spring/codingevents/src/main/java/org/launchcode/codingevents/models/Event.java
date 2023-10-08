package org.launchcode.codingevents.models;

import jakarta.validation.constraints.*;

import java.util.Objects;

public class Event {
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

    private int id;
    private static int nextId=1;

    public Event(String name, String description, String contactEmail, String address, String zipcode, Boolean registrationRequired, int numAttendees) {
        this();
        this.name = name;
        this.description = description;
        this.contactEmail = contactEmail;
        this.address = address;
        this.zipcode = zipcode;
        this.registrationRequired = registrationRequired;
        this.numAttendees = numAttendees;

    }
    public Event() {
        this.id=nextId;
        nextId++;
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

    public int getId() {
        return id;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return id == event.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
