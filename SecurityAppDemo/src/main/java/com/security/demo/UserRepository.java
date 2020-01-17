/**
 * 
 */
package com.security.demo;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author adms.java1
 *
 */
public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String userName);

}
