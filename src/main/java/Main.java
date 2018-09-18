
public class Main {

	public static void main(String[] args) {
		Contact c0 = new Contact("Bob0");
		Contact c1 = new Contact("Bob1");
		Contact c2 = new Contact("Bob2");
		Contact c3 = new Contact("Bob3");
		
		IContactDao dao = new ContactDao();
		dao.add(c0);
		dao.add(c1);
		dao.add(c2);
		dao.add(c3);
		
		ContactService cs = new ContactService(dao);
		
		
		System.out.println(dao.findByName("Bob1").getNomContact());
		System.out.println(dao.readAll());
	}

}