class Book {
    String title;
    boolean issued;

    Book() {
        this("Unknown");
    }

    Book(String title) {
        this.title = title;
    }

    void issue() {
        issued = true;
    }
}

class Library {
    Book book;

    Library(Book book) {
        this.book = book;
    }

    void display() {
        System.out.println(book.title + " " + (book.issued ? "Issued" : "Available"));
    }
}

class Q13 {
    public static void main(String[] args) {
        Book b = new Book("Java Programming");
        Library l = new Library(b);

        l.display();
        b.issue();
        l.display();
    }
}