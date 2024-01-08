/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.HashMap;
import java.util.Scanner;
import java.util.function.Predicate;
import view.Menu;

/**
 *
 * @author hoang
 */
public class PlaylistManager extends Menu<String> {
    private static SongManager songManeger = new SongManager();
    private static final String menuTitle = "PLAYLIST MENU";
    private static final String[] menuOptions = {"Create Fruit", "View order", "Shopping", "Display all fruits", "Exit"};

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
                skipToPreviousSong();
                break;    
            case 7:
                exit();
                break;
        }
    }
    
    private static void displayAllSong() {
        
    }
    
    private static void addNewSong() {
        
    }
    
    private static void removeSong() {
        
    }
    
    private static void shufflePlaylist() {
        
    }
    
    private static void skipToNextSong() {
        
    }
    
    private static void skipToPreviousSong() {
        
    }
    
    
    private static void exit() {
//        songManeger.writeFruitsIntoFile();
        System.out.println("Goodbye");
        System.exit(0);
    }
}
