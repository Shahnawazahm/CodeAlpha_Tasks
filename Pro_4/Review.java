package Pro_4;

class Review {

    private String username;
    private String hotelName;
    private int rating;
    private String comments;

    public Review(String username, String hotel, int rating, String comments) {
        this.username = username;
        this.hotelName = hotel;
        this.rating = rating;
        this.comments = comments;
    }

    public String getUsername() {
        return username;
    }

    public String getHotelName() {
        return hotelName;
    }

    public int getRating() {
        return rating;
    }

    public String getComments() {
        return comments;
    }

}
