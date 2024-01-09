/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author hoang
 */
public class Song {
    private int Id;
    private String songName;

    public Song(int Id, String songName) {
        this.Id = Id;
        this.songName = songName;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String toFileString() {
        return Id + "," + songName;
    }

    @Override
    public String toString() {
        return "Song: {ID: " + Id + ", Name: " + songName + "}";
    }
}
