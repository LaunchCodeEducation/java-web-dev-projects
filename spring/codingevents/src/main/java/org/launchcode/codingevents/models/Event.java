package org.launchcode.codingevents.models;

import java.util.Objects;

public class Event {
    private String name;
    private String description;
    private int id;
    private static int nextId=1;

    public Event(String name, String description) {
        this.name = name;
        this.description = description;
        this.id=nextId;
        nextId++;
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
