package com.cbfacademy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

@DisplayName(value = "Basic Test Suite")
public class AppTest {

    @Test
    @DisplayName("creates the app")
    public void createsAnApp() {
        final App app = new App();

        assertThat(app, is(notNullValue()));
    }

    @Test
    @DisplayName("Ensures multiples of 3 return Fizz")
    public void returnsFizz() {


        assertEquals("Fizz",FizzBuzz.get(9));
    }

    @Test
    @DisplayName("Ensures multiples of 5 return Buzz")
    public void returnsBuzz() {

        assertEquals("Buzz",FizzBuzz.get(5));
    }

    @Test
    @DisplayName("Ensures that multiples of 15 return FizzBuzz")
    public void returnsFizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzz.get(15));
    }
    @Test
    @DisplayName("Ensures ints are returned if they are n")
}