import java.util.ArrayList;

public class ContactDao implements IContactDao {

	private ArrayList<Contact> contacts;
	
	public ContactDao(){
		this.contacts = new ArrayList<Contact>();
	}
	
	/* (non-Javadoc)
	 * @see IContactDao#add(Contact)
	 */
	@Override
	public void add(Contact contact){
		this.contacts.add(contact);
		System.out.println("Contact ajouté au dao");
	}
	
	/* (non-Javadoc)
	 * @see IContactDao#getContacts()
	 */
	@Override
	public ArrayList<Contact> getContacts(){
		return this.contacts;
	}
	
	/* (non-Javadoc)
	 * @see IContactDao#findByName(java.lang.String)
	 */
	@Override
	public Contact findByName(String nom){
		Contact contactNom = null;
		for(int i=0; i < this.contacts.size(); i++){
			if(this.contacts.get(i).getNomContact().equals(nom)){
				contactNom = contacts.get(i);
				return contactNom;
			}
		}
		return null;
	}
	
	/* (non-Javadoc)
	 * @see IContactDao#readAll()
	 */
	@Override
	public ArrayList<Contact> readAll(){
		return this.contacts;
	}
	
	
}
