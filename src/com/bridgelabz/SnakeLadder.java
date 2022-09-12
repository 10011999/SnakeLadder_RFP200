package com.bridgelabz;

public class SnakeLadder {
    public static void main(String[] args) {
        int playerPosition = 0;
        do {
        int playerPlay = (int) Math.floor(Math.random() *10) % 2;
        final int snake = 1;
        final int noplay = 2;
        final int ladder = 3;
        int options = (int) Math.floor(Math.random() * 10) % 6 + 1;
        switch (options) {
            case ladder:
                playerPosition += playerPlay;
                System.out.println("the player got Ladder:" + playerPosition);
                break;
            case noplay:
                System.out.println("the player remains in same position:" + playerPosition);
                break;
            case snake:
                playerPosition -= playerPlay;
                System.out.println("the snake bit the player:" + playerPosition);
                break;
        }
        System.out.println("Player position is :" + playerPosition);
        if (playerPosition<0)
        {
            playerPosition = 0;
        }
    }while (playerPosition < 100);
    }
}

