
public class FactoryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OpreatingSystemFactory op=new OpreatingSystemFactory();
		OS obj=op.getInstance("Open");
		obj.spec();

	}

}
