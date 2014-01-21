package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import play.data.validation.Constraints.Required;

/**
 * Class Company entity.
 * 
 * @author paolobonansea
 * 
 */
@Entity
public class Company {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long id;

	@Required
	public String name;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

//	public static List<Company> all() {
//
//		List<Company> companies = JPA.em()
//				.createQuery("from Company order by name").getResultList();
//
//		return companies;
//
//	}
//
//	public void create() {
//		JPA.em().persist(this);
//	}
//
//	public static void delete(Long id) {
//
//		Company company = Company.findById(id);
//
//		if (company != null) {
//			JPA.em().remove(company);			
//		}
//
//	}
//
//	/**
//	 * Find a company by id.
//	 */
//	public static Company findById(Long id) {
//		return JPA.em().find(Company.class, id);
//	}
}
