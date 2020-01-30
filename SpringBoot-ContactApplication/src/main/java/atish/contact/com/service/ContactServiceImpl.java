package atish.contact.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import atish.contact.com.entity.ContactEntity;
import atish.contact.com.repository.ContactRepository;

/**
 * This is a ContactServiceImpl Class Which is Use to perform the Business Operation on the DB
 * @author ATISH
 *
 */
@Service
public class ContactServiceImpl implements ContactService{
	
	@Autowired
	private ContactRepository conatctRepo;

	@Override
	public String saveContactDetails(ContactEntity entity) {
		ContactEntity contactEntity = conatctRepo.save(entity);
		//return contactEntity!=null;
		
		if(contactEntity!=null)
			return "Contact Details Added SuccessFully";
		else
			return "Contact Details Not Added";
	}

}
