package com.afs.tdd;

import com.sun.tools.javac.util.Pair;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverTest {
    @Test
    void should_locationY_add_one_space_when_execute_command_given_direction_Y_and_command_M() {
        //given
        MarsRover marsRover = new MarsRover(new Pair<Integer, Integer>(0, 0), 'N');
        char command = 'N';

        //when
        marsRover.executeCommand(command);
        String result = marsRover.getStatus();

        //return
        assertEquals("0 1 N", result);

    }

}