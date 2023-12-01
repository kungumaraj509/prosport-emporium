package com.mshop.restapi.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.mshop.restapi.Repository.PaymentRepository;
import com.mshop.restapi.Repository.ProductRepository;
import com.mshop.restapi.Repository.UserRepository;
import com.mshop.restapi.model.Payment;
import com.mshop.restapi.model.Product;
import com.mshop.restapi.model.User;
import com.mshop.restapi.service.UserService;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserServiceimpl implements UserService {
    @Autowired  
	private UserRepository userRepository;
    
    @Autowired
    private ProductRepository pr;
    @Autowired
    private PaymentRepository pm;
	@Override
	public boolean adduser(User user) {
		// TODO Auto-generated method stub
		boolean userExists = userRepository.existsByEmail(user.getEmail());
		if(!userExists)
		{
			userRepository.save(user);
			return true;
		}else {
			
			return false;
		}
	}
	@Override
	public List<User> getUser() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}
	@Override
	public boolean updateuser(Long id,User user) {
		// TODO Auto-generated method stub
		userRepository.saveAndFlush(user);
		Optional<User>existingUserOptional =userRepository.findById(id);
		if(existingUserOptional.isPresent()) {
		User userExists=existingUserOptional.get();
		userExists.setName(user.getName());
		userExists.setEmail(user.getEmail());
		userExists.setGender(user.getGender());
		userExists.setMedicine(user.getMedicine());
		userExists.setPrice(user.getPrice());
		userExists.setPhonenumber(user.getPhonenumber());
		userRepository.save(userExists);
		return true;
	}else {
		return false;
	}
	}
		@Override
		public boolean deleteUser(Long id) {
			Optional<User>existingUserOptional=userRepository.findById(id);
			if(existingUserOptional.isPresent()) {
				userRepository.deleteById(id);
				return true;
			}
			else {
				return false;
			}
		}
		@Override
		public Page<User> getAllUser(PageRequest pageRequest) {
			return userRepository.findAll(pageRequest);
		}
		@Override
		public List<String> getFullName() {
			// TODO Auto-generated method stub
			return null;
		}
	
		@Override
		public int updateUserQuery(String name, Long id) {
			// TODO Auto-generated method stub
			return userRepository.updateUser(name, id);
		}
		
		@Override
		public List<User> findAllUser() {
			// TODO Auto-generated method stub
			return userRepository.findAllQuery();
		}
//		@Override
//		public User getEmail(String email) {
//			// TODO Auto-generated method stub
//			return userRepository.findByEmail(email);
//		}
		
		
		@Override
		public int deleteUserQuery(Long id) {
			// TODO Auto-generated method stub
			return userRepository.deleteUser(id);
		}
		@Override
		public List<User> findAllQuery() {
			// TODO Auto-generated method stub
			return userRepository.findAllQuery();
		}
		
		@Override
		public boolean addUser(User user) {
			Optional<User> isExists = userRepository.findByEmail(user.getEmail());
			if (isExists.isPresent()) {
				return false;
			} else {
				userRepository.save(user);
				return true;
			}
		}
		@Override
		public User getEmail(String email) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public boolean getuser(User user) {
			Optional<User> isExists =userRepository.existsByUsername(user.getUsername());
			if (isExists.isPresent()) {
				return true;
			} else {
	             return false;
			}
		}
		
		public Product postproduct(Product data) {
			return pr.save(data);
		}
		public Payment postpayment(Payment data) {
			return pm.save(data);
		}
		
		
	}