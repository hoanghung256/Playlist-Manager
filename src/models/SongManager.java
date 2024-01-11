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
    Node<Song> currentSong;

    public SongManager() {
        fileManager = new FileManager();
        songs = fileManager.readSongsFromFile();
    }

    public void displayAllSong() {
        MyLinkedList<Song> songs = fileManager.readSongsFromFile();

        songs.showList();
    }

    public void play() {
        currentSong = songs.getFirst();
        System.out.println("Playing " + currentSong.getValue().getSongName() + "...");
    }

    public void addNewSong(String name) {
        songs.addLast(new Song(songs.size() + 1, name));
    }

    public void removeSong(String name) {
        songs.remove(name);
    }

    public void skipToNext() {
        try {
            currentSong = songs.getNextSong(currentSong);
            Song song = currentSong.getValue();
            System.out.println("Playing " + song.getSongName() + "...");
        } catch (NullPointerException e) {
            System.out.println("No song available!");
        }
    }

    public void skipToPrevious() {
        try {
            currentSong = songs.getPreviousSong(currentSong);
            Song song = currentSong.getValue();
            System.out.println("Playing " + song.getSongName() + "...");
        } catch (NullPointerException e) {
            System.out.println("No song available!");
        }
    }

    public Song get(int x) {
        for (Node<Song> traverseNode = songs.getFirst(); traverseNode != null; traverseNode = traverseNode.next) {
            if (traverseNode.getValue().getId() == x) {
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

    public void shuffle() {
        Song[] songArr = toArray(songs);
        Random rnd = new Random();
        int randInt = 0;
        // shuffle in array
        for (int i = 0; i < songArr.length; i++) {
            randInt = i + rnd.nextInt(songArr.length - i);
            swap(songArr, i, randInt);
        }
        MyLinkedList<Song> shuffledList = new MyLinkedList<>();
        for (int i = 0; i < songArr.length; i++) {
            songArr[i].setId(i + 1);
            shuffledList.addLast(songArr[i]);
        }
        songs = shuffledList;
    }

    public Song[] toArray(MyLinkedList<Song> list) {
        Song[] array = new Song[list.size()];
        Node traverse = list.getFirst();
        for (int i = 0; i < list.size(); i++) {
            array[i] = (Song) traverse.getValue();
            traverse = traverse.next;
        }
        return array;
    }
}
