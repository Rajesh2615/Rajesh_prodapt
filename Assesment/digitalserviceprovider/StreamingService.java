package digitalserviceprovider;

public class StreamingService implements DigitalService {

	@Override
	public void login(String username, String password) {
		System.out.println("Logging in Streaming Service as: " + username);
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
