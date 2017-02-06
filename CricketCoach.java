package com.xiaolinsong.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;

	// create a no-arg contructor
	public void CircketCoach(){
		System.out.println("CircketCoach: inside no-arg contructor");
	}
	// add new fields for emailAddress and team
	private String emailAddress;
	private String team;
	
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: inside setter method - setFortuneService");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	
	// our setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}


	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
