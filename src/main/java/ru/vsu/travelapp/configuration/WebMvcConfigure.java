package ru.vsu.travelapp.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@Configuration
@ComponentScan({"ru.vsu"})
public class WebMvcConfigure implements WebMvcConfigurer {

    public WebMvcConfigure() {
        super();
    }

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/");
    }

    @Override
    public void addCorsMappings(CorsRegistry corsRegistry) {
        corsRegistry.addMapping("/**")
                .allowedOrigins("*",
                        "c@http://192.168.1.40:8100",
                        "c@http://localhost:8100",
                        "c@http://192.168.1.33:8100",
                        "capacitor://app:8100",
                        "capacitor://localhost:8100",
                        "capacitor://192.168.1.33:8100",
                        "ionic://localhost:8100",
                        "ionic://192.168.1.33:8100",
                        "ionic://192.168.1.40:8100",
                        "http://192.168.1.33:8100",
                        "http://localhost:8100",
                        "http://localhost:4200",
                        "http://localhost:8080")
                .allowedMethods("POST", "GET",  "PUT", "OPTIONS", "DELETE")
                .allowedHeaders("X-Auth-Token", "Content-Type")
                .exposedHeaders("custom-header1", "custom-header2")
                .allowCredentials(false)
                .maxAge(4800);
    }


    /*

    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();

        resolver.setViewClass(JstlView.class);
        resolver.setPrefix("/WEB-INF/");
        resolver.setSuffix(".jsp");

        return resolver;
    }

    public void addResourceHandlers(final ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }*/
}
