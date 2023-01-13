package com.my.hr.service;

import java.time.LocalDate;
import java.util.List;

import com.my.hr.dao.WorkerDao;
import com.my.hr.domain.Worker;

public class WorkerServiceImpl implements WorkerService{
	private WorkerDao workerDao;
	
	
	public WorkerServiceImpl(WorkerDao workerDao) {
		this.workerDao = workerDao;
	}
	
	@Override
	public List<Worker> getWorker() {
		return workerDao.selectWorker();
	}
	
	@Override
	public void addWorker(Worker worker) {
		workerDao.insertWorker(worker);
	}
	
	@Override
	public void fixWorkerName(int workerId, String workerName) {
		workerDao.updateWorkerName(workerId, workerName);
	}
	
	@Override
	public void fixWorkerJoinDate(int workerId, String workerJoinDate) {
		workerDao.updateWorkerJoinDate(workerId, workerJoinDate);
	}
	
	@Override
	public void delWorker(int workerId) {
		workerDao.deleteWorker(workerId);
	}
}
