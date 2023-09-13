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
	public List<Recruit> findByPositionAndType(String position, String type);
	
	// 4번
	public List<Recruit> findByTypeOrSalaryGreaterThanEqual(String type, int salary);	
	
	// 5번	
	public List<Recruit> findTop3ByTypeOrderBySalaryDesc(String type);
	
	// 6번
//	public List<Recruit> findByRegionANDsalaryBetween(String region, int salaryStart, int salaryEnd);
	
	// 7번
	@Query(value="SELECT * FROM `recruit` "
			+ "WHERE `deadline` > :deadline "
			+ "AND `salary` >= :salary "
			+ "AND `type` = :type "
			+ "ORDER BY `salary` DESC ", nativeQuery=true)
	public List<Recruit> findByNativeQuery(@Param("deadline")String deadline
											, @Param("salary")int salary
											, @Param("type")String type);
	
	
}
