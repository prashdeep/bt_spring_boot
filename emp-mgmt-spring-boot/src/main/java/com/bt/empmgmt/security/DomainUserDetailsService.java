package com.bt.empmgmt.security;

import com.bt.empmgmt.model.User;
import com.bt.empmgmt.repository.UserRepository;
import org.h2.engine.Domain;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service("domainUserDetailsService")
public class DomainUserDetailsService implements UserDetailsService {

    private UserRepository userRepository;

    public DomainUserDetailsService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = this.userRepository.findByUserName(username).orElseThrow(()-> new UsernameNotFoundException("User is not present"));

        return new DomainUserDetails(user);
    }
}