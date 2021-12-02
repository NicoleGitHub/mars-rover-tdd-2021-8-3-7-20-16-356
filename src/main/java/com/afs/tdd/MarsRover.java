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
        if(command == 'M') {
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
        switch (command) {
            case 'L':
                switch (direction) {
                    case 'N':
                        direction = WEST;
                        break;
                    case 'S':
                        direction = EAST;
                        break;
                    case 'E':
                        direction = NORTH;
                        break;
                    default:
                        direction = SOUTH;
                }
                break;
            default:
                switch (direction) {
                    case 'N':
                        direction = EAST;
                        break;
                    case 'S':
                        direction = WEST;
                        break;
                    case 'E':
                        direction = SOUTH;
                        break;
                    default:
                        direction = NORTH;
                }
        }
    }

    public String getStatus() {
        return String.format("%d %d %s", coordinates.fst, coordinates.snd, direction);
    }

}