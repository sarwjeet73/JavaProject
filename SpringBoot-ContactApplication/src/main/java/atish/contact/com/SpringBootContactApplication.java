package atish.contact.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import atish.contact.com.entity.ContactEntity;
import atish.contact.com.service.ContactService;

@SpringBootApplication
public class SpringBootContactApplication {

	public static void main(String[] args) {
		
		ContactService service=null;
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringBootContactApplication.class, args);
		//ContactService contactService = ctx.getBean(ContactService.class);
		service=ctx.getBean(ContactService.class);
		ContactEntity savedEntity=new ContactEntity();
		savedEntity.setContactId(1001);
		savedEntity.setContactName("Atish Kumar");
		savedEntity.setContactNum(910036010);
		savedEntity.setContactArea("Hyderabad");
		
	//	boolean saveContactDetails = service.saveContactDetails(savedEntity);
		String saveContactDetails = service.saveContactDetails(savedEntity);
		System.out.println("Contact Record Added:::::"+saveContactDetails);
	}

}
