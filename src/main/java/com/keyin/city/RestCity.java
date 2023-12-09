package com.keyin.city;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "city", path = "city")
public interface RestCity extends JpaRepository<City, Long> {
}
