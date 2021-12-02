package com.afs.tdd;

import com.sun.tools.javac.util.Pair;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverTest {

    @Test
    void should_locationY_add_one_space_when_execute_command_given_direction_N_and_command_M() {
        //given
        MarsRover marsRover = new MarsRover(new Pair<Integer, Integer>(0, 0), 'N');
        char command = 'M';

        //when
        marsRover.executeCommand(command);
        String result = marsRover.getStatus();

        //return
        assertEquals("0 1 N", result);

    }

    @Test
    void should_locationY_add_one_space_when_execute_command_given_direction_S_and_command_M() {
        //given
        MarsRover marsRover = new MarsRover(new Pair<Integer, Integer>(0, 0), 'S');
        char command = 'M';

        //when
        marsRover.executeCommand(command);
        String result = marsRover.getStatus();

        //return
        assertEquals("0 -1 S", result);

    }

    @Test
    void should_locationX_add_one_space_when_execute_command_given_direction_E_and_command_M() {
        //given
        MarsRover marsRover = new MarsRover(new Pair<Integer, Integer>(0, 0), 'E');
        char command = 'M';

        //when
        marsRover.executeCommand(command);
        String result = marsRover.getStatus();

        //return
        assertEquals("1 0 E", result);

    }

    @Test
    void should_locationX_add_one_space_when_execute_command_given_direction_W_and_command_M() {
        //given
        MarsRover marsRover = new MarsRover(new Pair<Integer, Integer>(0, 0), 'W');
        char command = 'M';

        //when
        marsRover.executeCommand(command);
        String result = marsRover.getStatus();

        //return
        assertEquals("-1 0 W", result);

    }

}