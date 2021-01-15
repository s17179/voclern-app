package pl.voclern.auth.security;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import pl.voclern.auth.adapter.secondary.HibernateUserEntityRepository;
import pl.voclern.auth.port.secondary.exception.UserNotFoundException;
import pl.voclern.auth.port.secondary.UserRepository;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
class UserDetailsServiceImpl implements UserDetailsService {

    private final HibernateUserEntityRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        try {
            var user = userRepository.findByToken(s).orElseThrow(UserNotFoundException::new);

            List<GrantedAuthority> roles = new ArrayList<>();
            roles.add(new SimpleGrantedAuthority("ROLE_USER"));

            return new User(user.getEmail(), user.getPassword(), roles);
        } catch (UserNotFoundException e) {
            throw new UsernameNotFoundException(e.getMessage());
        }
    }
}
