/**
 * 
 */
package services.impl;

import java.util.List;

import models.Company;
import play.db.jpa.JPA;
import services.CompanyService;

/**
 * @author paolobonansea
 *
 */
public class CompanyServiceImpl implements CompanyService {

	@Override
	public List<Company> all() {

		List<Company> companies = JPA.em()
				.createQuery("from Company order by name").getResultList();

		return companies;

	
	}

	@Override
	public void create(Company company) {
	
		JPA.em().persist(company);

	}

	@Override
	public void delete(Long id) {
		
		Company company = this.findById(id);

		if (company != null) {
			JPA.em().remove(company);			
		}

	}

	@Override
	public Company findById(Long id) {

		return JPA.em().find(Company.class, id);
	
	}

}
