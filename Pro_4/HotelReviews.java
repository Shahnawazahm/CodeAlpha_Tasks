package Pro_4;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class HotelReviews {

    private ArrayList<Review> reviews;

    public HotelReviews() {
        reviews = new ArrayList<>();
    }

    public void addReview(Review review) {
        reviews.add(review);
    }

    public void showReviews(String hotel) {
        System.out.println("Showing reviews for " + hotel);
        printReviews(hotel);
    }

    public void sortByRating() {
        Collections.sort(reviews, (r1, r2) -> r2.getRating() - r1.getRating());
        printReviews();      
    }
    
    public void filterByRating(int minRating) {
        ArrayList<Review> filtered = new ArrayList<>();
        for(Review r : reviews) {
            if(r.getRating() >= minRating) {
                filtered.add(r);
            }
        }
        printReviews(filtered);
    }

    private void printReviews(String hotel) {
        for(Review r : reviews) {
            if(r.getHotelName().equals(hotel)) {
                printReview(r);
            }
        } 
    }

    private void printReviews() {
        printReviews(this.reviews);
    }
    
    private void printReviews(List<Review> reviews) {
        for(Review r : reviews) { 
            printReview(r);
        }
        System.out.println(); 
    }
    
    private void printReview(Review review) {
        System.out.println(review.getUsername() + ": " + 
                           review.getRating() + ", " +
                           review.getComments());
    }
    
}