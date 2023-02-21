package org.example;

public enum Transportation {
    AIRPLANE(1.5), // продолжительность поездки на самолете - 1.5 часа
    TRAIN(6.5), // продолжительность поездки на поезде - 6.5 часов
    CAR(7.5), // продолжительность поездки на автомобиле - 7.5 часов
    BICYCLE(44.0), // продолжительность поездки на велосипеде - 44 часа
    WALK(200.0); // продолжительность поездки пешком - 200 часов

    private final double duration; // продолжительность поездки в часах

    Transportation(double duration) {
        this.duration = duration;
    }

    public double getDuration() {
        return duration;
    }

    public int getDays() {
        return (int) (duration / 24);
    }

    public int getHours() {
        return (int) (duration % 24);
    }

    public int getMinutes() {
        return (int) ((duration * 60) % 60);
    }

    public int getSeconds() {
        return (int) ((duration * 3600) % 60);
    }

}


