package com.java.srikant.controller;
import org.springframework.data.jpa.repository.JpaRepository;

import com.java.srikant.beansCsrf.CSRF;

public interface UserCsrf extends JpaRepository<CSRF, Integer> {

}
