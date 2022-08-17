package com.fraud.repository;

import com.fraud.model.entity.FraudCheckHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FraudCheckHistoryRepository
        extends JpaRepository<FraudCheckHistory, Long> {
}
