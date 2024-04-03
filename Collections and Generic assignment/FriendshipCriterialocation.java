package assignment;

public class FriendshipCriterialocation<T extends Comparable<T>, S extends Comparable<T>> {
    private T name;
    private S locality;
 
    public FriendshipCriterialocation(T name, S locality) {
        this.name = name;
        this.locality = locality;
    }
 
	public T getName() {
		return name;
	}
 
	public void setName(T name) {
		this.name = name;
	}
 
	public S getAttribute() {
		return locality;
	}
 
	public void setAttribute(S attribute) {
		this.locality = attribute;
	}
}
 class FriendShipCriteriaAge<T extends Comparable<T>, S extends Comparable<S>> {
	    private T name;
	    private S age;
	 
	    public FriendShipCriteriaAge(T name, S currentage) {
	        this.name = name;
	        this.age = currentage;
	    }
	 
		public T getName() {
			return name;
		}
	 
		public void setName(T name) {
			this.name = name;
		}
	 
		public S getAge() {
			return age;
		}
	 
		public void setAge(S currentage) {
			this.age = currentage;
		}
}
