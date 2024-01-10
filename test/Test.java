
import java.util.LinkedList;
import models.Song;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hoang
 */
public class Test {
    public static void main(String[] args) {
        LinkedList<Song> myList = new LinkedList<>();
        Song s =new Song(1, "Bai 1");
        Song ss = new Song(1, "Bai 1");
        myList.add(s);
        myList.add(new Song(2, "Bai 2"));
        myList.add(new Song(3, "Bai 3"));
        myList.add(new Song(4, "Bai 4"));
        myList.add(new Song(5, "Bai 5"));
        myList.remove(ss);
        
        System.out.println(myList.toString());
    }
}
