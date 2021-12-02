package com.afs.tdd;

import com.sun.tools.javac.util.Pair;

public class MarsRover {
    private Pair<Integer, Integer> coordinates;
    private char direction;
    private char command;

    public MarsRover(Pair<Integer, Integer> coordinates, char direction) {
        this.coordinates = coordinates;
        this.direction = direction;
    }

    public void executeCommand(char command) {
        move();
    }

    private void move() {
        switch (direction) {
            case 'N':
                coordinates = new Pair<Integer, Integer>(coordinates.fst, coordinates.snd + 1);
        }

//        switch direction
//        case "N":
//        locationY++;
//        break;
    }

    public String getStatus() {
        return String.format("%d %d %s", coordinates.fst, coordinates.snd, direction);
    }

}