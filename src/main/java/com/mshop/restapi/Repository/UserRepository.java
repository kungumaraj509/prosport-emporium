package com.mshop.restapi.Repository;

import java.util.List;
import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.mshop.restapi.model.User;

import jakarta.transaction.Transactional;




public interface UserRepository extends JpaRepository<User,Integer>{

	
	boolean existsByEmail(String email);
	Optional<User>findById(Long id);
	Optional<User>deleteById(Long id);
	Optional<User>findByEmail(String email);
	Optional<User> existsByUsername(String username);
	
	@Query("select u from User u")
	List<User> findAllQuery();
	
//	@Query("select u from User u where u.email=:email")
//	User findByEmail(@Param("email") String email);
	
	@Query("select u from User u where u.email=?1")
	 User findByEmailPlace(String email);
	
//	@Modifying
//	@Transactional
//	@Query("update User u set u.firstName=:fName where u.id=:id")
//	 updateUser(@Param ("fName") String name,@Param("id") long id);
	
	//for table name method
	@Query(value="select * from user u",nativeQuery=true)
	List<User> findAllQuery1();
	
	@Modifying
	@Transactional
	@Query(value="delete User u where u.id=?1")
	int deleteUser(Long id);
	
	//update table name
	
	@Modifying
	@Transactional
	@Query("update User u set u.name=:names where u.id=:id")
	int updateUser(@Param ("names") String name,@Param("id") long id);
	
	
	//@Query(value = "select * from user join _order on _order.id=user.order_id where _order.id=?1",nativeQuery=true)
	

}
	

