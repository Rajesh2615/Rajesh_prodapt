package digitalserviceprovider;

public class CloudStorageService implements DigitalService {

	@Override
	public void login(String username, String password) {
		System.out.println("Logging in with username: " + username);

	}

	@Override
	public void logout() {
		System.out.println("Loging out");

	}

	@Override
	public void accessContent(String content) {
		System.out.println("Accessing content: " + content);

	}

	@Override
	public void updateProfile(String updateinfo) {
		System.out.println("Updating profile: " + updateinfo);

	}

}
