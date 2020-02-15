package com;

public class East extends Direction {

    public East() {
        super('E');
    }

    @Override
    public Direction turnRight() {
        return new South();
    }

    @Override
    public Direction turnLeft() {
        return new North();
    }
}
