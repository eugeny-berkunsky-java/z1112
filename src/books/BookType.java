package books;

public interface BookType {
    BookType NEW = ()->3;
    BookType CHILD = ()->30;
    BookType REGULAR = ()->15;

    int daysForReturn();
}
