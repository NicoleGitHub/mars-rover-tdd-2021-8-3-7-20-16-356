package com.afs.tdd;

import com.sun.tools.javac.util.Pair;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.afs.tdd.Constants.*;

public class MarsRoverTest {


    @Test
    void should_return_return_locationY_add_one_space_when_execute_command_given_direction_N_and_command_M() {
        //given
        MarsRover marsRover = new MarsRover(new Pair<>(0, 0), Direction.NORTH);
        char command = MOVE;

        //when
        marsRover.executeCommand(command);
        String result = marsRover.getStatus();

        //return
        assertEquals("0 1 N", result);

    }

    @Test
    void should_return_locationY_add_one_space_when_execute_command_given_direction_S_and_command_M() {
        //given
        MarsRover marsRover = new MarsRover(new Pair<>(0, 0), Direction.SOUTH);
        char command = MOVE;

        //when
        marsRover.executeCommand(command);
        String result = marsRover.getStatus();

        //return
        assertEquals("0 -1 S", result);

    }

    @Test
    void should_return_locationX_add_one_space_when_execute_command_given_direction_E_and_command_M() {
        //given
        MarsRover marsRover = new MarsRover(new Pair<>(0, 0), Direction.EAST);
        char command = MOVE;

        //when
        marsRover.executeCommand(command);
        String result = marsRover.getStatus();

        //return
        assertEquals("1 0 E", result);

    }

    @Test
    void should_return_locationX_add_one_space_when_execute_command_given_direction_W_and_command_M() {
        //given
        MarsRover marsRover = new MarsRover(new Pair<>(0, 0), Direction.WEST);
        char command = MOVE;

        //when
        marsRover.executeCommand(command);
        String result = marsRover.getStatus();

        //return
        assertEquals("-1 0 W", result);

    }

    @Test
    void should_return_W_add_one_space_when_execute_command_given_direction_N_and_command_L() {
        //given
        MarsRover marsRover = new MarsRover(new Pair<>(0, 0), Direction.NORTH);
        char command = LEFT;

        //when
        marsRover.executeCommand(command);
        String result = marsRover.getStatus();

        //return
        assertEquals("0 0 W", result);

    }

    @Test
    void should_return_E_add_one_space_when_execute_command_given_direction_S_and_command_L() {
        //given
        MarsRover marsRover = new MarsRover(new Pair<>(0, 0), Direction.SOUTH);
        char command = LEFT;

        //when
        marsRover.executeCommand(command);
        String result = marsRover.getStatus();

        //return
        assertEquals("0 0 E", result);

    }

    @Test
    void should_return_N_add_one_space_when_execute_command_given_direction_E_and_command_L() {
        //given
        MarsRover marsRover = new MarsRover(new Pair<>(0, 0), Direction.EAST);
        char command = LEFT;

        //when
        marsRover.executeCommand(command);
        String result = marsRover.getStatus();

        //return
        assertEquals("0 0 N", result);

    }

    @Test
    void should_return_S_add_one_space_when_execute_command_given_direction_W_and_command_L() {
        //given
        MarsRover marsRover = new MarsRover(new Pair<>(0, 0), Direction.WEST);
        char command = LEFT;

        //when
        marsRover.executeCommand(command);
        String result = marsRover.getStatus();

        //return
        assertEquals("0 0 S", result);

    }

    @Test
    void should_return_E_add_one_space_when_execute_command_given_direction_N_and_command_R() {
        //given
        MarsRover marsRover = new MarsRover(new Pair<>(0, 0), Direction.NORTH);
        char command = RIGHT;

        //when
        marsRover.executeCommand(command);
        String result = marsRover.getStatus();

        //return
        assertEquals("0 0 E", result);

    }

    @Test
    void should_return_W_add_one_space_when_execute_command_given_direction_S_and_command_R() {
        //given
        MarsRover marsRover = new MarsRover(new Pair<>(0, 0), Direction.SOUTH);
        char command = RIGHT;

        //when
        marsRover.executeCommand(command);
        String result = marsRover.getStatus();

        //return
        assertEquals("0 0 W", result);

    }

    @Test
    void should_return_S_add_one_space_when_execute_command_given_direction_E_and_command_R() {
        //given
        MarsRover marsRover = new MarsRover(new Pair<>(0, 0), Direction.EAST);
        char command = RIGHT;

        //when
        marsRover.executeCommand(command);
        String result = marsRover.getStatus();

        //return
        assertEquals("0 0 S", result);

    }

    @Test
    void should_return_N_add_one_space_when_execute_command_given_direction_W_and_command_R() {
        //given
        MarsRover marsRover = new MarsRover(new Pair<>(0, 0), Direction.WEST);
        char command = RIGHT;

        //when
        marsRover.executeCommand(command);
        String result = marsRover.getStatus();

        //return
        assertEquals("0 0 N", result);

    }

    @Test
    void should_return_negative11N_add_one_space_when_execute_command_given_direction_N_and_commands() {
        //given
        MarsRover marsRover = new MarsRover(new Pair<>(0, 0), Direction.NORTH);
        String command = "MLMR";

        //when
        marsRover.executeCommands(command);
        String result = marsRover.getStatus();

        //return
        assertEquals("-1 1 N", result);

    }

}