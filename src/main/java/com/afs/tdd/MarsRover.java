package com.afs.tdd;

import com.sun.tools.javac.util.Pair;

import static com.afs.tdd.Constants.*;

public class MarsRover {
    private Pair<Integer, Integer> coordinates;
    private char direction;

    public MarsRover(Pair<Integer, Integer> coordinates, char direction) {
        this.coordinates = coordinates;
        this.direction = direction;
    }

    public void executeCommand(char command) {
        if(command == MOVE) {
            move();
        }
        else {
            turn(command);
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
            default :
                coordinates = new Pair<>(coordinates.fst - 1, coordinates.snd);
        }
    }

    private void turn(char command) {

            switch (direction) {
                case 'N':
                    direction = (command==LEFT) ? WEST : EAST;
                    break;
                case 'S':
                    direction = (command==LEFT) ? EAST : WEST;
                    break;
                case 'E':
                    direction = (command==LEFT) ? NORTH : SOUTH;
                    break;
                default:
                    direction = (command==LEFT) ? SOUTH : NORTH;
            }

    }

    public String getStatus() {
        return String.format("%d %d %s", coordinates.fst, coordinates.snd, direction);
    }

    public void executeCommands(String commands) {
        for(int i = 0; i < commands.length(); i++) {
            executeCommand(commands.charAt(i));
        }
    }
}