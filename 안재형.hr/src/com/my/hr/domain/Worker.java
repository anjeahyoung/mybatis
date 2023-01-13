package com.my.hr.domain;

import java.time.LocalDate;

public class Worker {
	private static int cnt;
	private int workerId;
	private String workerName;
	private String workerJoinDate;
	
	public Worker(String workerName, String workerJoinDate) {
		this.workerId = ++cnt;
		this.workerName = workerName;
		this.workerJoinDate = workerJoinDate;
	}

	public int getWorkerId() {
		return workerId;
	}

	public String getWorkerName() {
		return workerName;
	}

	public String getWorkerJoinDate() {
		return workerJoinDate;
	}

	public void setWorkerName(String workerName) {
		this.workerName = workerName;
	}

	public void setWorkerJoinDate(String workerJoinDate) {
		this.workerJoinDate = workerJoinDate;
	}
	
	@Override
	public String toString() {
		return workerId + " " + workerName + " " + workerJoinDate;
	}
}
