package com.my.hr;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.my.hr.dao.WorkerDao;
import com.my.hr.dao.WorkerDaoImpl;
import com.my.hr.domain.Worker;

public class test {
	public static void main(String[] args) {
		List<Worker> workers = new ArrayList<>();
		WorkerDao workerDao = new WorkerDaoImpl(workers);
		
		
		for(Worker worker: workers) System.out.println(worker);
		
		workerDao.updateWorkerName(1,"kk");
		
		for(Worker worker: workers) System.out.println(worker);
		
		workerDao.deleteWorker(0);
		for(Worker worker: workers) System.out.println(worker);
	}
}
