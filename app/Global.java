import java.io.File;
import java.lang.reflect.Method;

import org.springframework.context.ApplicationContext;

import play.Application;
import play.Configuration;
import play.GlobalSettings;
import play.Logger;
import play.api.mvc.EssentialFilter;
import play.api.mvc.Handler;
import play.libs.F.Promise;
import play.mvc.Action;
import play.mvc.Http.Request;
import play.mvc.Http.RequestHeader;
import play.mvc.SimpleResult;

/**
 * Class global setting.
 * @author paolobonansea
 *
 */
public class Global extends GlobalSettings {

	/*
	 * (non-Javadoc)
	 * 
	 * @see play.GlobalSettings#beforeStart(play.Application)
	 */
	@Override
	public void beforeStart(Application arg0) {
		super.beforeStart(arg0);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see play.GlobalSettings#filters()
	 */
	@Override
	public <T extends EssentialFilter> Class<T>[] filters() {
		return super.filters();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see play.GlobalSettings#onBadRequest(play.mvc.Http.RequestHeader,
	 * java.lang.String)
	 */
	@Override
	public Promise<SimpleResult> onBadRequest(RequestHeader arg0, String arg1) {
		return super.onBadRequest(arg0, arg1);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see play.GlobalSettings#onError(play.mvc.Http.RequestHeader,
	 * java.lang.Throwable)
	 */
	@Override
	public Promise<SimpleResult> onError(RequestHeader arg0, Throwable arg1) {
		return super.onError(arg0, arg1);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see play.GlobalSettings#onHandlerNotFound(play.mvc.Http.RequestHeader)
	 */
	@Override
	public Promise<SimpleResult> onHandlerNotFound(RequestHeader arg0) {
		return super.onHandlerNotFound(arg0);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see play.GlobalSettings#onLoadConfig(play.Configuration, java.io.File,
	 * java.lang.ClassLoader)
	 */
	@Override
	public Configuration onLoadConfig(Configuration arg0, File arg1,
			ClassLoader arg2) {
		return super.onLoadConfig(arg0, arg1, arg2);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see play.GlobalSettings#onRequest(play.mvc.Http.Request,
	 * java.lang.reflect.Method)
	 */
	@Override
	public Action onRequest(Request arg0, Method arg1) {
		return super.onRequest(arg0, arg1);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see play.GlobalSettings#onRouteRequest(play.mvc.Http.RequestHeader)
	 */
	@Override
	public Handler onRouteRequest(RequestHeader arg0) {
		return super.onRouteRequest(arg0);
	}

//	private ApplicationContext ctx;

	@Override
	public void onStart(Application app) {
		Logger.info("Application has started");
//		ctx = new ClassPathXmlApplicationContext("context.xml");
	}

	@Override
	public void onStop(Application app) {
		Logger.info("Application shutdown...");
	}

//	@Override
//	public <A> A getControllerInstance(Class<A> clazz) {
//		return ctx.getBean(clazz);
//	}

}
