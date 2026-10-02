package com.vit.result.repository;

import com.vit.result.model.ResultRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultRepository extends JpaRepository<ResultRecord, Long> {
}
