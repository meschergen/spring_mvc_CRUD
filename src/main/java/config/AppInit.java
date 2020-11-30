package config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * 29.11.2020
 *
 * @author MescheRGen
 */

public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() { return null; }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{
                AppConfig.class
        };
    }

    @Override
    protected String[] getServletMappings() { return new String[]{"/"}; }
}
