package singleton;


public class SharedCloud {


    private SharedCloud() {
    }

    private static SharedCloud sharedCloud = null;

    public static SharedCloud getSharedCloudInstance() {

        if (sharedCloud == null) {

            return sharedCloud = new SharedCloud();
        }
        return sharedCloud;
    }
}
