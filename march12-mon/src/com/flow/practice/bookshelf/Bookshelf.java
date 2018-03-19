package com.flow.practice.bookshelf;

import com.flow.practice.book.Book;
import com.flow.practice.book.Novel;
import com.flow.practice.book.Textbook;

import java.util.ArrayList;

public class Bookshelf {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("Regeny")) {

                String[] tempNovels = args[i+1].split(",");

                String[] title = tempNovels[0].split("_");
                String titleName = "";
                for (String tit: title){
                    titleName += tit + " ";
                }
                titleName = titleName.trim();

                String[] author = tempNovels[1].split("_");
                String authorName = "";
                for (String auth: author) {
                    authorName += auth + " ";
                }
                authorName = authorName.trim();

                String[] publisher = tempNovels[2].split("_");
                String publisherName = "";
                for (String pub: publisher) {
                    publisherName += pub + " ";
                }
                publisherName = publisherName.trim();

                int year = Integer.parseInt(tempNovels[3]);

                if (tempNovels.length == 5) {
                    String type = tempNovels[4];
                    Novel tempNovel = new Novel(titleName, authorName, publisherName, year, type);
                    putOnShelf(tempNovel);

                } else {
                    Novel tempNovel = new Novel(titleName, authorName, publisherName, year);
                    putOnShelf(tempNovel);
                }
                i++;
            }

            if (args[i].equals("Tankonyv")) {
                String[] tempTextbooks = args[i+1].split(",");

                String[] title = tempTextbooks[0].split("_");
                String titleName = "";
                for (String tit: title) {
                    titleName += tit + " ";
                }
                titleName = titleName.trim();

                String[] author = tempTextbooks[1].split("_");
                String authorName = "";
                for (String auth: author) {
                    authorName += auth + " ";
                }
                authorName = authorName.trim();

                String[] publisher = tempTextbooks[2].split("_");
                String publisherName = "";
                for (String pub: publisher) {
                    publisherName += pub + " ";
                }
                publisherName = publisherName.trim();

                int year = Integer.parseInt(tempTextbooks[3]);

                if (tempTextbooks.length == 5) {
                    String subject = tempTextbooks[4];
                    Textbook tempTB = new Textbook(titleName, authorName, publisherName, year, subject);
                    putOnShelf(tempTB);

                } else {
                    Textbook tempTB = new Textbook(titleName, authorName, publisherName, year);
                    putOnShelf(tempTB);
                }
                i++;
            }
        }
        for (Book aShelf : shelf) {
            System.out.println(aShelf);
        }
        System.out.println(Novel.getNovelCount());
    }

    static ArrayList<Book> shelf = new ArrayList<>();

    static void putOnShelf (Book book) {
        shelf.add(book);
    }
}
