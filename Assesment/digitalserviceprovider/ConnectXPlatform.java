package digitalserviceprovider;

public class ConnectXPlatform {
public static void main(String[] args) {
		
		System.out.println("StreamingService\n");
		System.out.println();
		DigitalService streamingService = new StreamingService();
		streamingService.login("Rajesh", "GTR@2615");
        streamingService.accessContent("Hotstar");
        streamingService.updateProfile(" Profile Updated");
        streamingService.logout();	
        
        System.out.println();
        
        System.out.println("CloudStorageService\n");
		DigitalService cloudStorageService = new CloudStorageService();
		cloudStorageService.login("Ashwin","RR@310");
		cloudStorageService.accessContent("Apple cloud storage");
		cloudStorageService.updateProfile(" Profile Updated");
		cloudStorageService.logout();		
        
		System.out.println();
		
        System.out.println("SocialMediaService\n");
        DigitalService socialMediaService = new SocialMediaService();
        socialMediaService.login("Harish","Creta543");
        socialMediaService.accessContent("Facebook");
        socialMediaService.updateProfile(" Profile not Updated");
        socialMediaService.logout();	
	}
}