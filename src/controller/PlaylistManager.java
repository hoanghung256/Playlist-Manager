/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Scanner;
import models.SongManager;
import view.Menu;

/**
 *
 * @author hoang
 */
public class PlaylistManager extends Menu<String> {
    private static SongManager songManager = new SongManager();
    private static final String menuTitle = "PLAYLIST MENU";
    private static final String[] menuOptions = { "Display all song", "Play", "Skip to next song",
            "Skip to previous song", "Shuffle playlist", "Add new song into playlist", "Remove song from playlist",
            "Exit" };

    public PlaylistManager() {
        super(menuTitle, menuOptions);
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                songManager.displayAllSong();
                break;
            case 2:
                songManager.play();
                break;
            case 3:
                songManager.skipToNext();
                break;
            case 4:
                songManager.skipToPrevious();
                break;
            case 5:
                songManager.shuffle();
                break;
            case 6:
                addNewSong();
                break;
            case 7:
                removeSong();
                break;
            case 8:
                exit();
                break;
        }
    }

    private static void addNewSong() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter song name: ");
        String name = sc.nextLine();
        songManager.addNewSong(name);
    }

    private static void removeSong() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter song name: ");
        String name = sc.nextLine();
        songManager.removeSong(name);
    }

    private static void exit() {
        // songManeger.writeFruitsIntoFile();
        System.out.println("Goodbye");
        System.exit(0);
    }
}
