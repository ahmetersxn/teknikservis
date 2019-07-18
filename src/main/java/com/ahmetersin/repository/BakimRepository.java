package com.ahmetersin.repository;

import com.ahmetersin.model.Bakim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BakimRepository extends JpaRepository<Bakim, Long> {
}
