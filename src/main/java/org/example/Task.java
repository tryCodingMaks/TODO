package org.example;

import java.time.LocalDateTime;
import java.util.List;

public class Task {
    private String name;
    private String description;
    private LocalDateTime date;
    private int duration;
    private String organizer;
    private List<String> participants;
    private String city;


        public Task(String name, String description) {
            this.name = name;
            this.description = description;
        }

        public String getName() {
            return name;
        }

        public String getDescription() {
            return description;
        }
    }

    /** public Task(String name, String description) {
        this.name = name;
        this.description = description;
    }
        this.date = date;
        this.duration = duration;
        this.organizer = organizer;
        this.participants = participants;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getOrganizer() {
        return organizer;
    }

    public void setOrganizer(String organizer) {
        this.organizer = organizer;
    }

    public List<String> getParticipants() {
        return participants;
    }

    public void setParticipants(List<String> participants) {
        this.participants = participants;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;

     }
     }*/
