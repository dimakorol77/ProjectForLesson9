package LESSON9;

public class Book {

        public static void main(String[] args) {
            Title title = new Title();
            Author author = new Author();
            Content content = new Content();

            author.setAuthor("Михаэль Лайтман");
            title.setTitle("Зоар");
            content.setContent("Философия и Мистика");

            author.show();
            title.show();
            content.show();


        }
    }

