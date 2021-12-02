package com.afs.tdd;

import com.sun.tools.javac.util.Pair;

public class MarsRover {
    private Pair<Integer, Integer> coordinates;
    private char direction;

    public MarsRover(Pair<Integer, Integer> coordinates, char direction) {
        this.coordinates = coordinates;
        this.direction = direction;
    }

    public void executeCommand(char command) {
        if(command == 'M') {
            move();
        }
    }

    private void move() {
        switch (direction) {
            case 'N':
                coordinates = new Pair<>(coordinates.fst, coordinates.snd + 1);
                break;
            case 'S':
                coordinates = new Pair<>(coordinates.fst, coordinates.snd - 1);
                break;
            case 'E':
                coordinates = new Pair<>(coordinates.fst + 1, coordinates.snd);
                break;
            case 'W':
                coordinates = new Pair<>(coordinates.fst - 1, coordinates.snd);
                break;
        }

    }

    public String getStatus() {
        return String.format("%d %d %s", coordinates.fst, coordinates.snd, direction);
    }

}