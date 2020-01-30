package atish.contact.com.repository;

import org.springframework.data.repository.CrudRepository;

import atish.contact.com.entity.ContactEntity;

/**
 * This is Interface Class to perform the Operation on  the DB
 * @author ATISH
 *
 */
public interface ContactRepository extends CrudRepository<ContactEntity,Integer>{
	
	
}
