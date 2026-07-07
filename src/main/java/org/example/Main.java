package org.example;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(6, 5);

        System.out.println("Point: " + point.distance());

        Player player = new Player("Göksel", 100, Weapon.SWORD);

        System.out.println("Player: " + player.healthRemaining());
    }
}