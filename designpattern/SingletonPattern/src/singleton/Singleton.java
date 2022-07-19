package singleton;


public class Singleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    System.out.println("User 1 Accessing Cloud resource for first time");
	        SharedCloud sharedCloudUser1 = SharedCloud.getSharedCloudInstance();
	        System.out.println("Hascode For shared Cloud User 1 :-" + sharedCloudUser1.hashCode());


	        System.out.println("User 2 Accessing Cloud resource ");
	        SharedCloud sharedCloudUser2 = SharedCloud.getSharedCloudInstance();
	        System.out.println("Hascode For shared Cloud User 2 :-" + sharedCloudUser2.hashCode());

	        System.out.println("User 3 Accessing Cloud resource for");
	        SharedCloud sharedCloudUser3 = SharedCloud.getSharedCloudInstance();
	        System.out.println("Hascode For shared Cloud User 3 :-" + sharedCloudUser3.hashCode());

	}

}
