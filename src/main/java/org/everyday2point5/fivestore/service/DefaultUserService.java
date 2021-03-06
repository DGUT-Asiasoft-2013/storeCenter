package org.everyday2point5.fivestore.service;


import org.everyday2point5.fivestore.entity.User;
import org.everyday2point5.fivestore.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Component
@Service
@Transactional
public class DefaultUserService implements IUserService {

	@Autowired
	IUserRepository userRepo;
	
	@Override
	public User create(String account, String passwordHash) {
		User user = new User();
		user.setAccount(account);
		user.setPassword(passwordHash);
		return userRepo.save(user);
	}

	@Override
	public void login(String account, String passwordHash) {
		
	}

	

	@Override
	public User changePassword(String newPasswordHash) {
		User user = new User();
		user.setPassword(newPasswordHash);
		return userRepo.save(user);
	}

	@Override
	public void logout() {
		
	}

	@Override
	public User findByAccount(String account) {
		
		return userRepo.findByAccount(account);
	}

	@Override
	public User findById(Integer uid) {
		return userRepo.findById(uid);
	}

	@Override
	public User findByEmail(String email) {
		return userRepo.findByEmail(email);
	}




	@Override
	public User save(User user) {
		return userRepo.save(user);
	}




}
