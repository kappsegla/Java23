package org.example.exercises.week2;

public class TextBook {
    private String[] pages = new String[10];
    private int pageCount = 0;

    public TextBook() {
    }

    public TextBook(int num) {
        if (num <= 0)
            throw new IllegalArgumentException("Felmeddelande");
        pages = new String[num];
    }

    public int addPage(String text) {
        if (pageCount == pages.length) {
            throw new IllegalStateException("Boken har slut på sidor");
        }
        pages[pageCount] = text;
        pageCount++;
        return pageCount - 1;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String getPage(int page) {
        //Check bounds here
        if( page < 0 || page >= pageCount)
            return "";
        return pages[page];
    }

    public static void main(String[] args) {
        TextBook book = new TextBook(3);
        System.out.println("Page count on new book should be 0 : " + book.getPageCount());
        book.addPage("First Page");
        book.addPage("Second Page");
        book.addPage("Third Page");
        System.out.println("Page count should be 3 : " + book.getPageCount());
        System.out.println("Page one : " + book.getPage(0));
        System.out.println("Page two : " + book.getPage(1));
        System.out.println("Page three : " + book.getPage(2));
        System.out.println("Page -1 : " + book.getPage(-1));
        System.out.println("Page four : " + book.getPage(3));
        //Should not work, should give exception
        book.addPage("Fourth book");

    }

}
