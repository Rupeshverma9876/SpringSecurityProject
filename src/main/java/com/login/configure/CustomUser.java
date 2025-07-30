
  package com.login.configure;
  
  import java.util.Arrays; import java.util.Collection;
  
  import org.springframework.security.core.GrantedAuthority; import
  org.springframework.security.core.authority.SimpleGrantedAuthority; import
  org.springframework.security.core.userdetails.UserDetails;
  
  import com.login.entity.User;
  
  public class CustomUser implements UserDetails{
  
  private User u;
  
  
  
  
  public CustomUser(User u) {
	  super(); this.u = u; 
	  }
  
  @Override public Collection<? extends GrantedAuthority> getAuthorities() {
  SimpleGrantedAuthority authority = new SimpleGrantedAuthority(u.getRole());
  
  return Arrays.asList(authority); 
  
  }
  
  @Override public String getPassword() { // TODO Auto-generated method stub
  
  return u.getPassword(); 
  }
  
  @Override public String getUsername() { // TODO Auto-generated method stub
  return u.getEmail(); 
  }
  
  @Override public boolean isAccountNonExpired() { return true; }
 
  @Override public boolean isAccountNonLocked() { return true; }
  
  @Override public boolean isCredentialsNonExpired() { return true; }
  
  @Override public boolean isEnabled() { return true; }
  
  }
 