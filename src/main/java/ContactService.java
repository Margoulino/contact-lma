
public class ContactService {

	IContactDao dao = null;
	
	public ContactService(){
		this.dao = new ContactDao();
	}
	
	public ContactService(IContactDao dao){
		this.dao = dao;
	}
	
	public IContactDao getDao(){
		return this.dao;
	}
	
	public void add(String contactName) throws ContactExistingException{
		if(contactName.length() >= 3 && contactName.length() <= 40 && contactName != null){
			if(dao.findByName(contactName) == null){
				Contact contact = new Contact(contactName);
				this.dao.add(contact);
				System.out.println("Contact ajouté au dao via le service");
			} else {
				throw new ContactExistingException("Le contact existe déjà sous ce nom");
			}

		} else {
			System.out.println("Le nom n'est pas valide, il doit être compris entre 3 et 40 caractères");
		}
	}
	
	
	public void delete(String name) throws ContactNotExistingException{
		if(name == null){
			throw new IllegalArgumentException("Name can't be null");
		}
		Contact contact = dao.findByName(name);
		if(contact == null){
			throw new ContactNotExistingException("Le contact n'existe pas");
		} else {
			this.getDao().getContacts().remove(contact);
		}
	}
}
