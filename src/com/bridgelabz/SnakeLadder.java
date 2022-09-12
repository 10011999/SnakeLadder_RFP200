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
            if (playerPosition == 94){
                playerPosition += 6;
                System.out.println("position is :" + playerPosition);
            }if (playerPosition == 95){
                playerPosition += 5;
                System.out.println("position is :" + playerPosition);
            }if (playerPosition == 96) {
                playerPosition +=  4;
                System.out.println("position is :" + playerPosition);
            }if (playerPosition == 97) {
                playerPosition +=  3;
                System.out.println("position is :" + playerPosition);
            }if (playerPosition==98) {
                playerPosition += 2;
                System.out.println("position is :" + playerPosition);
            }if (playerPosition==99){
                playerPosition += 1;
                System.out.println("position is :" + playerPosition);
            }
    }while (playerPosition < 100);
    }
}

