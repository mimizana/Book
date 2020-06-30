

public class BookApp {
    public static void main(String[] args) {

     BookClass book1 = new BookClass();

     book1.setTitle("Learning Java");
     book1.setAuthor("Nora");
     book1.setDescription("A Java book");
     book1.setPrice(9.99);
     book1.setisInstock(true);
        System.out.println("Book1:"+book1.getTitle());

        System.out.println("Book1 price:"+book1.getPrice());



    }
}
