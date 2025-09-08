package model;

public interface DataProcessor<T> {
    void process(T value);
}