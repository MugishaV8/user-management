package com.user.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.entity.UserInfo;

public interface UserInfoRepository extends JpaRepository<UserInfo, Integer>{

	 Optional<UserInfo> findByEmail(String username);
}
