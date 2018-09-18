import java.util.ArrayList;

public interface IContactDao {

    /* (non-Javadoc)
     * @see IContactDao#add(Contact)
     */
    void add(Contact contact);

    ArrayList<Contact> getContacts();

    /* (non-Javadoc)
     * @see IContactDao#findByName(java.lang.String)
     */
    Contact findByName(String nom);

    /* (non-Javadoc)
     * @see IContactDao#readAll()
     */
    ArrayList<Contact> readAll();

}