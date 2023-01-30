package ex03;

import java.util.List;
import java.util.Map;

public class Customer {
	
	//list or map의 의존성 주입
	private List<String> lists;
	private List<Person> Persons;
	private Map<String, Object> maps; 
	
	//getter, setter
	public List<String> getLists() {
		return lists;
	}

	public void setLists(List<String> lists) {
		this.lists = lists;
	}

	public List<Person> getPersons() {
		return Persons;
	}

	public void setPersons(List<Person> persons) {
		Persons = persons;
	}

	public Map<String, Object> getMaps() {
		return maps;
	}

	public void setMaps(Map<String, Object> maps) {
		this.maps = maps;
	}
	
	
	
	
}
