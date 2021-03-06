package com.capgemini.service;

import java.util.List;

import com.capgemini.domain.AgencyEntity;
import com.capgemini.domain.CarEntity;
import com.capgemini.domain.WorkerEntity;

public interface AgencyService {

	AgencyEntity save(AgencyEntity agencyEntity);
	
	AgencyEntity update(AgencyEntity agencyEntity);
	
	void delete(AgencyEntity agencyEntity);
	
	void addWorkerToAgency(Long agencyId, WorkerEntity worker);

	void deleteWorkerFromAgency(Long agencyId, WorkerEntity worker);

	List<WorkerEntity> findAllWorkers(Long agencyId);

	List<WorkerEntity> findWorkers(Long agencyId, Long carId); 
	
	public List<AgencyEntity> findAll();
	
	public AgencyEntity findOne(Long id);
	
}
