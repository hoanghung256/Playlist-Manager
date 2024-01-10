/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import data_structure.MyLinkedList;
import data_structure.Node;
import database.FileManager;
import java.util.Collections;
import java.util.Random;

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

    public Song get(int x){
        for (Node<Song> traverseNode = songs.getFirst(); traverseNode != null; traverseNode = traverseNode.next) {
            if(traverseNode.getValue().getId() == x){
                return traverseNode.getValue();
            }
        }
        return null;
    }

    private static void swap(Song[] arr, int i, int j) {
        Song tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public void shuffle(MyLinkedList<Song> songs){
        Song[] songArr = toArray(songs);
        Random rnd = new Random();
        for(int i = 0; i < songArr.length; i++){
            int randInt = i + rnd.nextInt(songs.size() + 1 - i);
            swap(songArr, i, randInt);
        }
    }
    public Song[] toArray(MyLinkedList<Song> list){
        Song[] array = new Song[list.size()];
        Node traverse = list.getFirst();
        for(int i = 0; i < list.size(); i++){
            array[i] = (Song)traverse.getValue();
            traverse = traverse.next;
        }
        return array;
    }
}
