package com.keyin.passenger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="passenger", collectionResourceRel = "passenger")
public interface RestPassenger extends JpaRepository<Passenger, Long> {
}
