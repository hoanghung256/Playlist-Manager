/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;

import data_structure.MyLinkedList;
import models.Song;

/**
 *
 * @author hoang
 */
public class FileManager {
    private static final String path = new File("src").getAbsolutePath();
    private static final String songsPath = "\\database\\songs.txt";

    public MyLinkedList<Song> readSongsFromFile() {
        String line;

        MyLinkedList<Song> songs = new MyLinkedList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path + songsPath))) { // Try with resource
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                songs.addLast(new Song(Integer.parseInt(values[0]), values[1]));
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
        return songs;
    }

    // public void writeSongsIntoFile(MyLinkedList<Song> songs) {
    // try (PrintWriter pr = new PrintWriter(path + songsPath);) {
    // for (Song song : songs) {
    // pr.println(song.toFileString());
    // }
    // pr.close();
    // } catch (IOException ex) {
    // System.out.println(ex.getMessage());
    // }
    // }
}
