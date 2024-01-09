/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import database.FileManager;

/**
 *
 * @author hoang
 */
public class SongManager {
    LinkedList<Song> songs;
    FileManager fileManager;

    public SongManager() {
        songs = new LinkedList<>();
        fileManager = new FileManager();
    }
    
    public void displayAllSong() {
        LinkedList<Song> songs = fileManager.readSongsFromFile();
        
//        print here
    }
}
