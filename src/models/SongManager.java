/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import data_structure.MyLinkedList;
import database.FileManager;
import data_structure.Node;

/**
 *
 * @author hoang
 */
public class SongManager {
    MyLinkedList<Song> songs;
    FileManager fileManager;

    public SongManager() {
        fileManager = new FileManager();
        songs = fileManager.readSongsFromFile();
    }

    public void displayAllSong() {
        songs.showList();
    }

    public void addNewSong(String name) {
        songs.addLast(new Song(songs.size() + 1, name));
    }

    public void removeSong(String name) {
//        songs.remove(name);
    }

    public Node<Song> get(int id){
        for(Node<Song> traverse = this.head; traverse != null; traverse = traverse.next){
            if (traverse.get)
        }
    }
}
