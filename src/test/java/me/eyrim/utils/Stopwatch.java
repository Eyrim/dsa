package me.eyrim.utils;

public class Stopwatch {
    private Long startTime = null;
    private Long endTime;
    private Long elapsed;

    public void start() {
        this.startTime = System.nanoTime();
    }

    public long finish() {
        if (this.startTime == null) {
            throw new IllegalStateException("Stopwatch start time must not be null");
        }

        this.endTime = System.nanoTime();
        this.elapsed = this.endTime - this.startTime;

        return this.elapsed;
    }

    public long inSeconds() {
        return this.elapsed / 1000000000;
    }
}

