package com.my.hr.dao;

import java.time.LocalDate;
import java.util.List;

import com.my.hr.domain.Worker;
import com.my.hr.presentation.Console;

public class WorkerDaoImpl implements WorkerDao{
	private List<Worker> workers;
	private Worker laborer;
	
	public WorkerDaoImpl(List<Worker> workers) {
		this.workers = workers;
	}
	
	@Override
	public List<Worker> selectWorker() {
		return workers;
	}
	
	@Override
	public void insertWorker(Worker worker) {
		workers.add(worker);
	}
	
	@Override
	public void updateWorkerName(int workerId, String workerName) {
		workers.get(workerId).setWorkerName(workerName);
	}
	
	@Override
	public void updateWorkerJoinDate(int workerId, String workerJoinDate) {
		workers.get(workerId).setWorkerJoinDate(workerJoinDate);
	}
	
	@Override
	public void deleteWorker(int workerId) {
		workers.remove(workerId);
	}
}
