package com.clintmonroe.bugtracker.model;

import java.time.LocalDateTime;

public class Ticket {

    private long id;
    private String userName;
    private String module;
    private String application;
    private String description;
    private int Urgency;
    private LocalDateTime ticketOpened;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getUrgency() {
        return Urgency;
    }

    public void setUrgency(int urgency) {
        Urgency = urgency;
    }

    public LocalDateTime getTicketOpened() {
        return ticketOpened;
    }

    public void setTicketOpened(LocalDateTime ticketOpened) {
        this.ticketOpened = ticketOpened;
    }
}
