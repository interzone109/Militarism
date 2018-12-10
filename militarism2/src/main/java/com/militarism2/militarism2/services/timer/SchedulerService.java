package com.militarism2.militarism2.services.timer;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class SchedulerService {
	 	
		@Scheduled(initialDelayString = "${scheduler.chekMail.init}", fixedDelayString = "${scheduler.chekMail.fixed}")
		public void checkMail() {
			System.out.println("checkMail");
		}
		
		@Scheduled(initialDelayString = "${scheduler.chekGame.init}", fixedDelayString = "${scheduler.chekGame.fixed}")
		public void chekGame() {
			System.out.println("chekGame");
		}
		
		
}	
