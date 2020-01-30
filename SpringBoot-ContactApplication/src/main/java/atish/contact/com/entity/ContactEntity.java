package atish.contact.com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * This is a Entity Class
 * @author ATISH
 *
 */
@Data
@Entity
@Table(name = "CONTACT_DETAILS")
public class ContactEntity {
	
	@Id
	@Column(name = "CONTACT_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer contactId;
	@Column(name = "CONTACT_NAME")
	private String contactName;
	@Column(name = "COLUMN_NUMBER")
	private long contactNum;
	@Column(name = "CONTACT_AREA")
	private String contactArea;

}

















