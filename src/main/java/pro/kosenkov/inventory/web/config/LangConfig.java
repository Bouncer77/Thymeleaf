package pro.kosenkov.inventory.web.config;

import org.hibernate.validator.spi.messageinterpolation.LocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import java.util.Locale;

@Configuration
public class LangConfig {

    @Bean
    public SessionLocaleResolver localeResolver() {
        SessionLocaleResolver slr = new SessionLocaleResolver();
        slr.setDefaultLocale(Locale.GERMANY); // de_DE
        // slr.setDefaultLocale(Locale.GERMAN); // de
        return slr;
    }
}
