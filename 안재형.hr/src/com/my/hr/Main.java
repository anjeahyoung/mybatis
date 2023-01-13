package com.my.hr;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import com.my.hr.dao.WorkerDao;
import com.my.hr.dao.WorkerDaoImpl;
import com.my.hr.domain.Worker;
import com.my.hr.presentation.Console;
import com.my.hr.presentation.WorkerIo;
import com.my.hr.service.WorkerService;
import com.my.hr.service.WorkerServiceImpl;

public class Main {
	public static void main(String[] args) throws ParseException {
		List<Worker> workers = new ArrayList<>();
		WorkerDao workerDao = new WorkerDaoImpl(workers);
		WorkerService workerService = new WorkerServiceImpl(workerDao);
		WorkerIo workerIo = new WorkerIo(workerService);
		
		workerIo.ADD();
		Console.info("끝");
	}
}