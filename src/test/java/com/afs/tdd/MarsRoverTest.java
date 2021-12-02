package com.afs.tdd;

import com.sun.tools.javac.util.Pair;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.afs.tdd.Constants.*;

public class MarsRoverTest {


    @Test
    void should_locationY_add_one_space_when_execute_command_given_direction_N_and_command_M() {
        //given
        MarsRover marsRover = new MarsRover(new Pair<Integer, Integer>(0, 0), NORTH);
        char command = MOVE;

        //when
        marsRover.executeCommand(command);
        String result = marsRover.getStatus();

        //return
        assertEquals("0 1 N", result);

    }

    @Test
    void should_locationY_add_one_space_when_execute_command_given_direction_S_and_command_M() {
        //given
        MarsRover marsRover = new MarsRover(new Pair<Integer, Integer>(0, 0), SOUTH);
        char command = MOVE;

        //when
        marsRover.executeCommand(command);
        String result = marsRover.getStatus();

        //return
        assertEquals("0 -1 S", result);

    }

    @Test
    void should_locationX_add_one_space_when_execute_command_given_direction_E_and_command_M() {
        //given
        MarsRover marsRover = new MarsRover(new Pair<Integer, Integer>(0, 0), EAST);
        char command = MOVE;

        //when
        marsRover.executeCommand(command);
        String result = marsRover.getStatus();

        //return
        assertEquals("1 0 E", result);

    }

    @Test
    void should_locationX_add_one_space_when_execute_command_given_direction_W_and_command_M() {
        //given
        MarsRover marsRover = new MarsRover(new Pair<Integer, Integer>(0, 0), WEST);
        char command = MOVE;

        //when
        marsRover.executeCommand(command);
        String result = marsRover.getStatus();

        //return
        assertEquals("-1 0 W", result);

    }

    @Test
    void should_W_add_one_space_when_execute_command_given_direction_N_and_command_L() {
        //given
        MarsRover marsRover = new MarsRover(new Pair<Integer, Integer>(0, 0), NORTH);
        char command = LEFT;

        //when
        marsRover.executeCommand(command);
        String result = marsRover.getStatus();

        //return
        assertEquals("0 0 W", result);

    }

    @Test
    void should_E_add_one_space_when_execute_command_given_direction_S_and_command_L() {
        //given
        MarsRover marsRover = new MarsRover(new Pair<Integer, Integer>(0, 0), SOUTH);
        char command = LEFT;

        //when
        marsRover.executeCommand(command);
        String result = marsRover.getStatus();

        //return
        assertEquals("0 0 E", result);

    }

    @Test
    void should_N_add_one_space_when_execute_command_given_direction_E_and_command_L() {
        //given
        MarsRover marsRover = new MarsRover(new Pair<Integer, Integer>(0, 0), EAST);
        char command = LEFT;

        //when
        marsRover.executeCommand(command);
        String result = marsRover.getStatus();

        //return
        assertEquals("0 0 N", result);

    }

    @Test
    void should_S_add_one_space_when_execute_command_given_direction_W_and_command_L() {
        //given
        MarsRover marsRover = new MarsRover(new Pair<Integer, Integer>(0, 0), WEST);
        char command = LEFT;

        //when
        marsRover.executeCommand(command);
        String result = marsRover.getStatus();

        //return
        assertEquals("0 0 S", result);

    }

}