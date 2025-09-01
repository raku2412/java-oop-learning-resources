package model;

import java.time.LocalDateTime;

public class Sensor<T> {
    private String id;
    private T value;
    private LocalDateTime timestamp;

    public Sensor(String id, T value) {
        this.id = id;
        this.value = value;
        this.timestamp = LocalDateTime.now();
    }

    public String getId() {
        return id;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
        this.timestamp = LocalDateTime.now();
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "Sensor[" + id + "] = " + value + " at " + timestamp;
    }
}
