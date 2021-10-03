/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solid.book;

import java.util.List;

/**
 *
 * @author Astr
 */
public class ScreenPrint extends Book{
    
    public ScreenPrint(String title, List<String> pages) {
        super(title, pages);
    }
    
    public void printToScreen() {
        Book book = this;
        do {
            System.out.println(book.getCurrentPage());
        } while (book.turnToNextPage());
    }
}
