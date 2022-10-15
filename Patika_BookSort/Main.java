package Patika_BookSort;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> book=new TreeSet<>();

        Book n1=new Book("Zamanın Farkında",200,"Sule Gürbüz",2006);
        Book n2=new Book("Iletişim Donanımları",158,"Doğan Cüceloğlu",2011);
        Book n3=new Book("Atatürk Etkisi",321,"Sinan Meydan",2016);
        Book n4=new Book("Ted Gibi Konuş",285,"Carmine Gallo",2009);
        Book n5=new Book("Atatürk",405,"Ilber Ortaylı",2018);

        book.add(n1);
        book.add(n2);
        book.add(n3);
        book.add(n4);
        book.add(n5);

        for(Book i:book){
            System.out.println("Sort By Name:");
            System.out.println("Book Name: "+i.getBookName()+
                    "\nNumber of page:"+i.getPageNumber()+
                    "\nAuthor Name: "+i.getAuthorname()+
                    "\nPublish Date: "+i.getPublishDate()+
                    "\n----------------------");
        }

        TreeSet<Book> bookPageNumber=new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageNumber()-o2.getPageNumber();
            }
        });
        bookPageNumber.add(n1);
        bookPageNumber.add(n2);
        bookPageNumber.add(n3);
        bookPageNumber.add(n4);
        bookPageNumber.add(n5);
        for(Book i:bookPageNumber){
            System.out.println("Book Name: "+i.getBookName()+
                    "\nNumber of page:"+i.getPageNumber()+
                    "\nAuthor Name: "+i.getAuthorname()+
                    "\nPublish Date: "+i.getPublishDate()+
                    "\n----------------------");
        }



    }
}
