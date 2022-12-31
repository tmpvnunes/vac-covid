package com.codegate01.vaccovid.repository;

import com.codegate01.vaccovid.entities.World;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorldRepository extends JpaRepository <World, Long> {
}
