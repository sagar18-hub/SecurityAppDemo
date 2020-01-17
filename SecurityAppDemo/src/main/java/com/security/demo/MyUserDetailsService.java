/**
 * 
 */
package com.security.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * @author adms.java1
 *
 */
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository repo;

	@Override
	public UserDetails loadUserByUsername(String userName)
			throws UsernameNotFoundException {

		User user = repo.findByUsername(userName);
		if (user == null)
			throw new UsernameNotFoundException("User not found");
		return null;
	}

}
