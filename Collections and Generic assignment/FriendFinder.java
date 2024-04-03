package assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendFinder {
	public static void main(String[] args) {
        List<FriendshipCriterialocation<String, String>> friends = new ArrayList<>();
        friends.add(new FriendshipCriterialocation<>("Ashwin", "Tuticorin"));
        friends.add(new FriendshipCriterialocation<>("Harish", "Banglore"));
        friends.add(new FriendshipCriterialocation<>("Anand", "Rajapalayam"));
 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your location: ");
		String targetLocation = sc.next();
		
		
        for (FriendshipCriterialocation<String, String> friend : friends) {
            if (friend.getAttribute().equalsIgnoreCase(targetLocation)) {
                System.out.println(friend.getName() + " is the nearby friend.");
            }
        }
        System.out.println("******************************************");
        List<FriendShipCriteriaAge<String, Integer>> friendslist1 = new ArrayList<>();
		friendslist1.add(new FriendShipCriteriaAge<>("Harish", 21));
		friendslist1.add(new FriendShipCriteriaAge<>("Ashwin", 22));
		friendslist1.add(new FriendShipCriteriaAge<>("Anand", 23));
 
		 Scanner sc1 = new Scanner(System.in);
	     System.out.println("Enter your Age: ");
		 int targetAge = sc1.nextInt();
			

		for (FriendShipCriteriaAge<String, Integer> friend : friendslist1) {
			if (friend.getAge()==targetAge) {
				System.out.println(friend.getName() + " is a same age friend.");
			}
		}
		sc1.close();
		sc.close();
    }
}