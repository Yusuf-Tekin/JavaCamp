import java.util.Date;

public class Customer {

	
	private int id;
	private String firstName;
	private String lastName;
	private Date dateofBirth;
	private String nationatlyId;
	public Customer(int id, String firstName, String lastName, Date dateofBirth, String nationatlyId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateofBirth = dateofBirth;
		this.nationatlyId = nationatlyId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDateofBirth() {
		return dateofBirth;
	}
	public void setDateofBirth(Date dateofBirth) {
		this.dateofBirth = dateofBirth;
	}
	public String getNationatlyId() {
		return nationatlyId;
	}
	public void setNationatlyId(String nationatlyId) {
		this.nationatlyId = nationatlyId;
	}
	
	
	
	
}
