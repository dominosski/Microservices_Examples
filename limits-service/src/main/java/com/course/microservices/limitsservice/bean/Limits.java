package com.course.microservices.limitsservice.bean;

public class Limits {
    int maximum;
    int minimum;

    public int getMaximum() {
        return maximum;
    }

    public Limits() {
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public Limits(int minimum, int maximum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }
}
