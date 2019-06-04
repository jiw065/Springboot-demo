package com.example.demo.repository;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Repository;

import com.example.demo.model.User;

/**
 * {@link User} {@link Repository}
 * @author Amber
 * similar to DAO
 */

@Repository
public class UserRepository {
	
	/**
	 * save as Map
	 */
	private final ConcurrentMap<Integer,User> repository = new ConcurrentHashMap<>();
	private final static AtomicInteger idGenerator = new AtomicInteger();
	
	
	public boolean save(User u) {
		Integer id = idGenerator.incrementAndGet();
		u.setId(id);
		return repository.put(id, u) == null;
	}
}
