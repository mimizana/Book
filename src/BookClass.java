public class BookClass {
    private String title;
    private String author;
    private String description;
    private double price;
    private boolean isInStock;

    public BookClass() {

    }
        public void setTitle(String title){
            this.title = title;
        }

        public String getTitle () {
            return this.title;

        }
        public void setAuthor (String author){
            this.author = author;
        }
        public String getAuthor(){
            return this.author;
        }
    public void setDescription (String description){
        this.description = description;
    }
    public String getDescription() {
        return this.description;
    }
        public void setPrice (double price) {
            this.price = price;
    }
        public double getPrice(){
            return this.price;
    }

        public void setisInstock ( boolean isInstock){
            this.isInStock = isInstock;
        }
        public boolean getisInStock () {
            return this.isInStock;
        }




}




