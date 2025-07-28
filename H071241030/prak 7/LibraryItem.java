abstract class LibraryItem {
    String title;
    int itemId;
    boolean isBorrowed;
   
    public LibraryItem(String title, int itemId, boolean isBorrowed) {
        this.title = title;
        this.itemId = itemId;
        this.isBorrowed = isBorrowed;
    }
    
    abstract String getDescription();
    abstract String borrowItem(int days);
    abstract double calculateFine(int daysLate);

    String returnItem() {
        this.isBorrowed = false;
        return title + " dikembalikan";
    }

      public boolean isBorrowed() {
        return isBorrowed;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {  
        this.title = title;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public void setBorrowed(boolean isBorrowed) {
        this.isBorrowed = isBorrowed;
    }


}