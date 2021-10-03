/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solid.book;
/**
 *
 * @author Astr
 */
import java.util.List;

public class BookPublisher {
    public static void main(String[] args) {
        FilePrint book = new FilePrint("Tyland", List.of("I", "moved", "here", "recently", "too"));
        book.printToFile();
    }
}
