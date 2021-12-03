package com.afs.tdd;

public enum Direction {
    NORTH('N'),
    SOUTH('S'),
    EAST('E'),
    WEST('W');

    private final char direction;

    Direction(char direction) {
        this.direction = direction;
    }

    public char getDirection() {
        return direction;
    }
}
