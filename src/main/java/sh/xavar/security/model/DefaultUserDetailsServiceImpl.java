package sh.xavar.security.model;


import java.util.Collections;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import sh.xavar.security.service.CustomUserDetailsService;

@Service
public class DefaultUserDetailsServiceImpl implements CustomUserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Dummy user (must be replaced in actual project)
        return new UserDetailsImpl(username, "password123", Collections.emptyList());
    }
}
