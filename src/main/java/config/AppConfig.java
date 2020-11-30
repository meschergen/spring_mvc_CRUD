package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 29.11.2020
 *
 * @author MescheRGen
 */

@Configuration
@EnableTransactionManagement
@EnableWebMvc
@PropertySource("classpath:db.properties")
@ComponentScan(value = "java")
public class AppConfig implements WebMvcConfigurer {

}
