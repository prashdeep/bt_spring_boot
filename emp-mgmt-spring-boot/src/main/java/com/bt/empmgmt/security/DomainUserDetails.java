package com.bt.empmgmt.security;

import com.bt.empmgmt.model.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DomainUserDetails implements UserDetails {


    private final String username;
    private final String password;
    private final List<GrantedAuthority> authorities;

    public DomainUserDetails(User user) {
        this.username = user.getUserName();
        this.password = user.getPassword();
        this.authorities = user.getRoles()
                               .stream()
                               .map(role -> new SimpleGrantedAuthority("ROLE_" + role.getRole()))
                               .collect(Collectors.toList());

    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.authorities;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}