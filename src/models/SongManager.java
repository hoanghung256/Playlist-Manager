/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import data_structure.Node;
import data_structure.MyLinkedList;
import database.FileManager;

/**
 *
 * @author hoang
 */
public class SongManager {
    MyLinkedList<Song> songs;
    FileManager fileManager;

    public SongManager() {
        songs = new MyLinkedList<>();
        fileManager = new FileManager();
    }

    public void displayAllSong() {
        MyLinkedList<Song> songs = fileManager.readSongsFromFile();
        songs.showList();
    }
}
