package com.collect.standalone;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Person {
	private List<String> friends;
	private Set<String> locations;
	private Map<String, Integer> courses;
	private Properties cred;

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public Set<String> getLocations() {
		return locations;
	}

	public void setLocations(Set<String> locations) {
		this.locations = locations;
	}

	public Map<String, Integer> getCourses() {
		return courses;
	}

	public void setCourses(Map<String, Integer> courses) {
		this.courses = courses;
	}

	public Properties getCred() {
		return cred;
	}

	public void setCred(Properties cred) {
		this.cred = cred;
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + ", locations=" + locations + ", courses=" + courses + ", cred=" + cred
				+ "]";
	}

}
