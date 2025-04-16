package com.prowing.springcore.lifecyclebean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Project {
	private String duration;
	private String projectName;

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	@PostConstruct
	public void initializeBean() {
		System.out.println("init mathod:=====>project");
	}

	@PreDestroy
	public void cleanUp() {
		System.out.println("destroy method:====>project");
	}

	@Override
	public String toString() {
		return "Project [duration=" + duration + ", projectName=" + projectName + "]";
	}

}
