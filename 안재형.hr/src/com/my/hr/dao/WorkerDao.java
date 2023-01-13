package com.my.hr.dao;

import java.time.LocalDate;
import java.util.List;

import com.my.hr.domain.Worker;

public interface WorkerDao {
	public List<Worker> selectWorker();
	public void insertWorker(Worker worker);
	public void updateWorkerName(int workerId, String workerName);
	public void updateWorkerJoinDate(int workerId, String workerJoinDate);
	public void deleteWorker(int workerId);
}
