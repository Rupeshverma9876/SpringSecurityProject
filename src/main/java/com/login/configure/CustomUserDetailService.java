
  package com.login.configure;
  
  import org.springframework.beans.factory.annotation.Autowired; import
  org.springframework.security.core.userdetails.UserDetails; import
  org.springframework.security.core.userdetails.UserDetailsService; import
  org.springframework.security.core.userdetails.UsernameNotFoundException;
  import org.springframework.stereotype.Component;
  
  import com.login.entity.User; import com.login.repository.repository;
  
  @Component 
  public class CustomUserDetailService implements UserDetailsService
  {
  
  
 @Autowired private repository repo;
  
  @Override public UserDetails loadUserByUsername(String email) throws
  UsernameNotFoundException { // TODO Auto-generated method stub 
	  User u=
  repo.findByEmail(email);
  
  if(u==null) { throw new UsernameNotFoundException("user name not found");
  }else { 
	  return new CustomUser(u); 
	  }
  }
  
  }
 