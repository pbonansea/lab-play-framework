package controllers;

import models.Company;
import play.data.Form;
import play.db.jpa.Transactional;
// import org.springframework.transaction.annotation.Transactional;
import play.modules.spring.Spring;
import play.mvc.Controller;
import play.mvc.Result;
import services.CompanyService;

/**
 * Class controller.
 * @author paolobonansea
 *
 */
// @org.springframework.stereotype.Controller
public class CompanyController extends Controller {

//	@Autowired
//	private static HelloService helloService;

	private static CompanyService companyService;
	
	static Form<Company> companyForm = Form.form(Company.class);

	@Transactional(readOnly = true)
	public static Result index() {

//		if (helloService != null) {
//			System.out.println(helloService.hello());			
//		}

		return redirect(routes.CompanyController.companies());
		
	}

	@Transactional(readOnly = true)
	public static Result companies() {

		return ok(views.html.company.render(getCompanyServiceInstance().all(), companyForm));

	}

	@Transactional
	public static Result newCompany() {

		Form<Company> filledForm = companyForm.bindFromRequest();
		if (filledForm.hasErrors()) {
			return badRequest(views.html.company.render(getCompanyServiceInstance().all(),
					companyForm));
		} else {
//			filledForm.get().create();
			getCompanyServiceInstance().create(filledForm.get());
			flash("success", "Computer " + filledForm.get().name
					+ " has been created");
			return redirect(routes.CompanyController.companies());

		}

	}

	@Transactional
	public static Result deleteCompany(int id) {

//		Company.delete(Integer.valueOf(id).longValue());
		getCompanyServiceInstance().delete(Integer.valueOf(id).longValue());
		return redirect(routes.CompanyController.companies());
		
	}

	private static CompanyService getCompanyServiceInstance() {
		
		if (companyService == null) {
			companyService = Spring.getBeanOfType(CompanyService.class);
		}
		
		return companyService;
		
	}
	
}
