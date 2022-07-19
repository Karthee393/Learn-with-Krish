package prototype;

public class demo {

	public static void main(String[] args)throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		BookShop bs=new BookShop();
		bs.setShopName("Karthee");
		bs.LoadData();

		
		BookShop bs1=bs.clone();
		bs.getBooks().remove(2);
		bs1.setShopName("Dinesh");
		System.out.println(bs);
		System.out.println(bs1);
	}

}
