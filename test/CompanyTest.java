import static org.fest.assertions.Assertions.assertThat;
import static play.test.Helpers.contentType;
import static play.test.Helpers.fakeApplication;
import static play.test.Helpers.running;
import models.Company;

import org.junit.Test;

import play.db.jpa.JPA;
import play.modules.spring.Spring;
import services.CompanyService;

/**
 * Class test company.
 * 
 * @author paolobonansea
 * 
 */
public class CompanyTest {

	@Test
	public void createNew() {
		running(fakeApplication(), new Runnable() {
			public void run() {
				JPA.withTransaction(new play.libs.F.Callback0() {
					@SuppressWarnings("unused")
					public void invoke() {
						String companyName = "company from test unit";
						CompanyService companyService = Spring.getBeanOfType(CompanyService.class);
						Company company = new Company();
						company.setName(companyName);
						companyService.create(company);
						assertThat(company.name).isEqualTo(companyName);
					}
				});
			}
		});
	}

	@Test
	public void findById() {
		running(fakeApplication(), new Runnable() {
			public void run() {
				JPA.withTransaction(new play.libs.F.Callback0() {
					@SuppressWarnings("unused")
					public void invoke() {
						CompanyService companyService = Spring.getBeanOfType(CompanyService.class);
						Company company = companyService.findById(17L);
						assertThat(company.id).isEqualTo(17L);
					}
				});
			}
		});
	}
	
}
