import org.easymock.EasyMock;
import org.easymock.EasyMockRule;
import org.easymock.EasyMockSupport;
import org.easymock.Mock;
import org.easymock.TestSubject;
import org.junit.Rule;
import org.junit.Test;

public class ContactServiceMockTest extends EasyMockSupport{
	
	@Rule
	public EasyMockRule rule = new EasyMockRule(this);
	
	@TestSubject
	private ContactService service = new ContactService();
	
	@Mock
	private IContactDao contactDao;
	
	@Test(expected = ContactExistingException.class)
	public void testAddContact() throws ContactExistingException {
		//1 - Enregistrement des comportements de mocks
		Contact contact = new Contact();
		EasyMock.expect(contactDao.findByName("Valeur")).andReturn(contact);
		
		//2 - Fin d'enregistrement
		replayAll();
		//3 - Test
		service.add("Valeur");
	}
	
	@Test(expected = ContactNotExistingException.class)
	public void testDeleteContactNotExistEasyMockSample() throws ContactNotExistingException{
		//1 - Enregistrement des comportements des mocks
		Contact contact = new Contact();
		contact.setNomContact("Machin");
		EasyMock.expect(contactDao.findByName("Machin")).andReturn(null);
		
		//2 - Fin d'enregistrement
		replayAll();
		
		//3 - Test
		service.delete("Machin");
	}
	
	@Test
	public void testDeleteContactExistEasyMockSample() throws ContactNotExistingException {
		//1 - Enregistrement des comportements des mocks
		Contact contact = new Contact();
		contact.setNomContact("Machin");
		EasyMock.expect(contactDao.findByName("Machin")).andReturn(contact);
		
		//2 - Fin d'enregistrement
		replayAll();
		
		//3 - Test
		service.delete("Machin");
	}
}