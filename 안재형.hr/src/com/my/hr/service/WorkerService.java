package com.my.hr.service;

import java.time.LocalDate;
import java.util.List;

import com.my.hr.domain.Worker;

public interface WorkerService {
	public List<Worker> getWorker();
	public void addWorker(Worker worker);
	public void fixWorkerName(int workerId, String workerName);
	public void fixWorkerJoinDate(int workerId ,String workerJoinDate);
	public void delWorker(int workerId);
}
