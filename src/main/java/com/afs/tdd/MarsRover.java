package com.afs.tdd;

import com.sun.tools.javac.util.Pair;

import static com.afs.tdd.Constants.*;

public class MarsRover {
    private Pair<Integer, Integer> coordinates;
    private Direction direction;

    public MarsRover(Pair<Integer, Integer> coordinates, Direction direction) {
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
            case NORTH:
                coordinates = new Pair<>(coordinates.fst, coordinates.snd + 1);
                break;
            case SOUTH:
                coordinates = new Pair<>(coordinates.fst, coordinates.snd - 1);
                break;
            case EAST:
                coordinates = new Pair<>(coordinates.fst + 1, coordinates.snd);
                break;
            default :
                coordinates = new Pair<>(coordinates.fst - 1, coordinates.snd);
        }

    }

    private void turn(char command) {

        switch (direction) {
            case NORTH:
                direction = (command==LEFT) ? Direction.WEST : Direction.EAST;
                break;
            case SOUTH:
                direction = (command==LEFT) ? Direction.EAST : Direction.WEST;
                break;
            case EAST:
                direction = (command==LEFT) ? Direction.NORTH : Direction.SOUTH;
                break;
            default:
                direction = (command==LEFT) ? Direction.SOUTH : Direction.NORTH;
        }

    }

    public String getStatus() {
        return String.format("%d %d %s", coordinates.fst, coordinates.snd, direction.getDirection());
    }

    public void executeCommands(String commands) {
        for(char command : commands.toCharArray()) {
            executeCommand(command);
        }
    }
}