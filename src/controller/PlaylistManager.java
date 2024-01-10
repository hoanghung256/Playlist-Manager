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
    private static final String[] menuOptions = { "Display all song", "Add new song into playlist",
            "Remove song from playlist", "Shuffle playlist", "Skip song", "Exit" };

    public PlaylistManager() {
        super(menuTitle, menuOptions);
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                displayAllSong();
                break;
            case 2:
                addNewSong();
                break;
            case 3:
                removeSong();
                break;
            case 4:
                shufflePlaylist();
                break;
            case 5:
                skipToNextSong();
                break;
            case 6:
                exit();
                break;
            // case 7:
            // break;
        }
    }

    private static void displayAllSong() {
        songManager.displayAllSong();
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

    private static void shufflePlaylist() {
        songManager.shuffle();
    }

    private static void skipToNextSong() {

    }

    private static void exit() {
        // songManeger.writeFruitsIntoFile();
        System.out.println("Goodbye");
        System.exit(0);
    }
}
