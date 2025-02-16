package sh.xavar.security.model;


import java.util.Collections;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import sh.xavar.security.service.CustomUserDetailsService;

@Service
@ConditionalOnMissingBean(CustomUserDetailsService.class) // 👈 Only use this if no other bean exists
public class DefaultUserDetailsServiceImpl implements CustomUserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return new UserDetailsImpl(username, "password123", Collections.emptyList());
    }
}
