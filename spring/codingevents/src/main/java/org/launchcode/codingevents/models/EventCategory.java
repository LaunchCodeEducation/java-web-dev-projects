package org.launchcode.codingevents.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.Objects;

@Entity
public class EventCategory extends AbstractEntity{
//    @Id
//    @GeneratedValue
//    private int id; gone to abstractentity

    @Size(min=3, message="Name must be at least 3 characters long")
    @NotBlank(message = "Input is required.")
    private String name;

    public EventCategory(String name){
        this.name=name;
    }
    public EventCategory(){}

//    public int getId() {
//        return id;
//    } gone to abstractentity


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    @Override
////    public int hashCode() {
////        return Objects.hash(id);
////    }
////
////    @Override
////    public boolean equals(Object o) {
////            if (this == o) return true;
////            if (o == null || getClass() != o.getClass()) return false;
////            EventCategory that = (EventCategory) o;
////            return id == that.id;
//        } gone to abstractentity


    @Override
    public String toString() {
        return name;
    }
}
