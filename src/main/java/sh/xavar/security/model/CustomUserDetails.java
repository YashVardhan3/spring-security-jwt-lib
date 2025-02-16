package sh.xavar.security.model;

import org.springframework.security.core.userdetails.UserDetails;

public interface CustomUserDetails extends UserDetails {
    String getName();
    Long getId();
    String getEmail();
}
