package org.bmshackathon;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity
public class Client {
    @Id
    Long id;

    String fullName;

    @Enumerated(EnumType.STRING)
    Status status;

    public Client() {
    }

    public Client(Long id, String name, Status status) {
        this.id = id;
        this.fullName = name;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", status=" + status +
                '}';
    }
}
