package ru.vsu.travelapp.configuration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.request.RequestContextListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class ApplicationInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {

        AnnotationConfigWebApplicationContext annotationConfigWebApplicationContext = new AnnotationConfigWebApplicationContext();

        annotationConfigWebApplicationContext.setServletContext(servletContext);
        annotationConfigWebApplicationContext.scan("ru.vsu.configuration");

        servletContext.addListener(new ContextLoaderListener(annotationConfigWebApplicationContext));
        servletContext.addListener(new RequestContextListener());

        annotationConfigWebApplicationContext.register(WebMvcConfigure.class);

        DispatcherServlet dispatcherServlet = new DispatcherServlet(annotationConfigWebApplicationContext);
        // throw NoHandlerFoundException to controller ExceptionHandler.class. Used for <error-page> analogue
        dispatcherServlet.setThrowExceptionIfNoHandlerFound(true);

        //register and map the dispatcher servlet
        //note Dispatcher servlet with constructor arguments
        ServletRegistration.Dynamic dispatcher = servletContext.addServlet("dispatcher", dispatcherServlet);
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/");

        FilterRegistration.Dynamic encodingFilter = servletContext.addFilter("encoding-filter", new CharacterEncodingFilter());
        encodingFilter.setInitParameter("encoding", "UTF-8");
        encodingFilter.setInitParameter("forceEncoding", "true");
        encodingFilter.addMappingForUrlPatterns(null, true, "/*");
    }
}
