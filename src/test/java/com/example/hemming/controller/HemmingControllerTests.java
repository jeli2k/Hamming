package com.example.hemming.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HemmingControllerTests {

    private HemmingController hemmingController = new HemmingController();


    @Test
    public void testCalculateHammingWeight() {
        // Arrange
        String number = "01234";
        int expectedWeight = 4;

        // Act
        int actualWeight = hemmingController.calculateHammingWeight(number);

        // Assert
        assertEquals(expectedWeight, actualWeight);
    }

    @Test
    public void testCalculateHammingWeight2() {
        // Arrange
        String number = "0005120";
        int expectedWeight = 3;

        // Act
        int actualWeight = hemmingController.calculateHammingWeight(number);

        // Assert
        assertEquals(expectedWeight, actualWeight);
    }

    @Test
    public void testGetLastMessage() {
        // Arrange
        String expectedLastMessage = "01234";

        // Act
        hemmingController.calculateHammingWeight(expectedLastMessage);
        String actualLastMessage = hemmingController.getMessage();

        // Assert
        assertEquals(expectedLastMessage, actualLastMessage);
    }
}
