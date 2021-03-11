package com.mypack.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

//    @Autowired
//    private ApplicationContext applicationContext;
//
//    @Override
//    public void addFormatters(FormatterRegistry registry) {
//        registry.addConverter(new DurationConverter());
//        registry.addFormatterForFieldType(LocalDate.class, new Formatter<LocalDate>() {
//            @Override
//            public String print(LocalDate object, Locale locale) {
//                return object.toString();
//            }
//
//            @Override
//            public LocalDate parse(String text, Locale locale) throws ParseException {
//                return LocalDate.parse(text);
//            }
//        });
//    }
//
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/static/**")
//            .addResourceLocations("classpath:/static/")
//            .setCachePeriod(31556926);
//    }
//
//    @Bean
//    public SpringResourceTemplateResolver templateResolver() {
//
//        SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
//
//        templateResolver.setApplicationContext(applicationContext);
//        templateResolver.setPrefix("classpath:/templates/");
//        templateResolver.setSuffix(".html");
//        templateResolver.setCacheable(false);
//
//        return templateResolver;
//    }
//
//    @Bean
//    public ISpringTemplateEngine templateEngine() {
//
//        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
//        templateEngine.setTemplateResolver(templateResolver());
//        templateEngine.setEnableSpringELCompiler(true);
//        templateEngine.addDialect(new Java8TimeDialect());
//        return templateEngine;
//    }
//
//    @Bean
//    public ViewResolver viewResolver() {
//
//        ThymeleafViewResolver resolver = new ThymeleafViewResolver();
//        ViewResolverRegistry registry = new ViewResolverRegistry(null, applicationContext);
//
//        resolver.setTemplateEngine(templateEngine());
//        registry.viewResolver(resolver);
//
//        return resolver;
//    }
}