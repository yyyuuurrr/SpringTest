package com.yuuur.spring.test.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.yuuur.spring.test.jpa.domain.Recruit;

@Repository
public interface RecruitRepository extends JpaRepository<Recruit, Integer> {
	
	// 1번
	public List<Recruit> findById(int id);
	
	// 2번
	public List<Recruit> findByCompanyId(@Param("companyId")int id);
	
	// 3번
	public List<Recruit> findByPositionContainingAndTypeContaining(String position, String type);
	
	// 4번
	public List<Recruit> findByTypeOrSalaryGreaterThan(int salary);
	
	
//	@Query(value="SELECT * FROM `recruit` WHERE `type`:type AND `salary`<=:salary")
//	public List<Recruit> findByTypeOrSalaryQuery(@Param("type") String type
//												, @Param("salary")int salary);

}
