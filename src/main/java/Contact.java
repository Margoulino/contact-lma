
public class Contact {
	
	private String nomContact;
	
	public Contact(String nomContact) {
		this.nomContact = nomContact;
	}
	
	public Contact() {
		this.nomContact = null;
	}
	
	public String getNomContact() {
		return nomContact;
	}

	public void setNomContact(String nomContact) {
		this.nomContact = nomContact;
	}
}
