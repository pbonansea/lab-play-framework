/**
 * 
 */
package services;

import java.util.List;

import models.Company;

/**
 * @author paolobonansea
 *
 */
public interface CompanyService {

	public List<Company> all();

	public void create(Company company);
	
	public void delete(Long id);

	public Company findById(Long id);
	
	
}
