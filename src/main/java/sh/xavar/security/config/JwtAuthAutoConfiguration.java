package sh.xavar.security.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import sh.xavar.security.model.DefaultUserDetailsServiceImpl;
import sh.xavar.security.service.CustomUserDetailsService;

@Configuration
@ConditionalOnMissingBean(CustomUserDetailsService.class)
public class JwtAuthAutoConfiguration {

    @Bean
    public CustomUserDetailsService defaultUserDetailsService() {
        return new DefaultUserDetailsServiceImpl();
    }
}
