/**
 * 
 */
package com.security.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;


/**
 * @author adms.java1
 *
 */
@Configuration
@EnableWebSecurity
public class AppSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private UserDetailsService userDetailsService;

	/*@Bean
	@Override
	protected UserDetailsService userDetailsService() {

		List<UserDetails> users = new ArrayList<>();
		users.add(User.withDefaultPasswordEncoder().username("Sagar")
				.password("123456").roles("Admin").build());
		return new InMemoryUserDetailsManager(users);
	}
*/
	/*@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/h2-console/**").hasRole("ADMIN")// allow
																				// h2
																				// console
																				// access
																				// to
																				// admins
																				// only
				.anyRequest().authenticated()// all other urls can be access by
												// any authenticated role
				.and().formLogin()// enable form login instead of basic login
				.and().csrf().ignoringAntMatchers("/h2-console/**")// don't
																	// apply
																	// CSRF
																	// protection
																	// to
																	// /h2-console
				.and().headers().frameOptions().sameOrigin();// allow use of
																// frame to same
																// origin urls
	}*/
	/*
	 * @Override protected void configure(HttpSecurity http) throws Exception {
	 * http.authorizeRequests().antMatchers("/h2-console/**").hasRole("ADMIN")//
	 * allow // h2 // console // access // to // admins // only
	 * .anyRequest().authenticated()// all other urls can be access by // any
	 * authenticated role .and().formLogin()// enable form login instead of
	 * basic login .and().csrf().ignoringAntMatchers("/h2-console/**")// don't
	 * // apply // CSRF // protection // to // /h2-console
	 * .and().headers().frameOptions().sameOrigin();// allow use of // frame to
	 * same // origin urls }
	 */

	
	  @Bean 
	  public AuthenticationProvider authProvider() {
	  DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
	  provider.setUserDetailsService(userDetailsService);
	  provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance()); 
	  return provider;
	  
	  }
	 

}
