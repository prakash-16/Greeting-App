package com.bridgelabz.helloworld.controller;

import org.springframework.data.repository.CrudRepository;

import com.bridgelabz.helloworld.model.GreetingAppDetails;

public interface AppRepo extends CrudRepository<GreetingAppDetails, Integer>{

}
