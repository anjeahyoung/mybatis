package com.my.hr.presentation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;
import com.my.hr.domain.Worker;
import com.my.hr.service.LengthException;
import com.my.hr.service.Menu;
import com.my.hr.service.WorkerService;

public class WorkerIo {
	private WorkerService workerService;
	Scanner sc = new Scanner(System.in);

	public WorkerIo(WorkerService workerService) {
		this.workerService = workerService;
	}

	public void play() {
		String menu = "";
		int choice = 0;

		do {
			try {	
				choice = Console.inNum("0.종료 1.목록 2.추가 3.수정 4.삭제");
				menu = switch(Menu.valueOf(choice)){
				case EXIT -> "종료";
				case LIST -> "목록";
				case ADD -> "추가";
				case FIX -> "수정";
				case DEL -> "삭제";
				default -> "다시 입력하세요";
				}; 
				System.out.println(menu + " 선택하셨습니다.");
			}catch(InputMismatchException e) {
				System.out.println("0~4 사이 숫자를 입력하세요");
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("0~4 사이 숫자를 입력하세요");
			}
		} while(!(0 <= choice && choice < 5));
	}

	public void LIST() {
		workerService.getWorker();
	}
	public void ADD() throws ParseException {
		String workerName = "";
		String workerJoinDate = "";
		SimpleDateFormat dtFormat = new SimpleDateFormat("yyyy-mm-dd");
		SimpleDateFormat newDtFormat = new SimpleDateFormat("yyyy-mm-dd");
		try {
			workerName = Console.inStr("이름을 입력하세요.");
			workerJoinDate = Console.inStr("입사일을 입력하세요.");
			
			Date formatDate = dtFormat.parse(workerJoinDate);
			workerJoinDate = newDtFormat.format(formatDate);
			
			if(workerName.length() > 6)
				throw new LengthException("5글자 이하로 다시 입력하세요.");
		} catch(LengthException e) {}
		workerService.addWorker(new Worker(workerName, workerJoinDate));
	}
	
	public void fixName(int workerId, String workerName) {
		workerId = Console.inNum("수정할 노동자의 아이디를 입력하세요.");
		workerName = Console.inStr("노동자명을 입력하세요.");
		workerService.fixWorkerName(workerId, workerName);
	}
	
	public void fixDate(int workerId, String workerJoinDate) {
		workerId = Console.inNum("수정할 노동자의 아이디를 입력하세요.");
		workerJoinDate = Console.inStr("입사일을 입력하세요.");
		workerService.fixWorkerJoinDate(workerId, workerJoinDate);
	}
	
	public void DEL(int workerId) {
		workerId = Console.inNum("삭제할 노동자의 아이드를 입력하세요.");
		workerService.delWorker(workerId);
	}
}