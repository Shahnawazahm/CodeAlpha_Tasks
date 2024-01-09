package Pro_4;

import java.util.Scanner;

public class HotelReviewSystem {

    private static HotelReviews manager = new HotelReviews();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
    
        while(true) {
            showMenu();
            int choice = input.nextInt();
            
            if(choice == 1) { 
                leaveReview();
            }
            else if(choice == 2) {
                showReviews();
            }
            else if(choice == 3) {
                manager.sortByRating();    
            }
            else if(choice == 4) {
                filterReviews();
            }
            else { 
                break;
            }
        }
    }

    private static void showMenu() {
        System.out.println("1. Leave Review");
        System.out.println("2. Show Reviews for Hotel");
        System.out.println("3. Sort Reviews");
        System.out.println("4. Filter Reviews");
        System.out.println("5. Exit");
        System.out.print("Enter choice: "); 
    }

    private static void leaveReview() {
        input.nextLine();  
        System.out.print("Enter name: ");
        String name = input.nextLine();
        
        System.out.print("Enter hotel: ");
        String hotel = input.nextLine();
        
        System.out.print("Enter rating: ");
        int rating;
        do {
            System.out.print("Enter rating (1-5): ");
            rating = input.nextInt();
        } while(rating < 1 || rating > 5);
        
        input.nextLine();
        System.out.print("Enter comments: ");
        String comments = input.nextLine();
        
        
        Review review = new Review(name, hotel, rating, comments);
        manager.addReview(review); 
    }
    
    private static void showReviews() {
        input.nextLine();
        System.out.print("For hotel: ");
        String hotel = input.nextLine();
        manager.showReviews(hotel);
    }

    private static void filterReviews() {
        System.out.print("Minimum rating: ");
        int rating = input.nextInt();
        manager.filterByRating(rating);  
    }   
}
