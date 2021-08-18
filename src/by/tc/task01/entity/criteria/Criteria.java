package by.tc.task01.entity.criteria;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Criteria {
	

	private String groupSearchName;
	private Map<String, Object> criteria = new HashMap<String, Object>();

	public Criteria() {
	}
	
	public Criteria(String groupSearchName) {
		this.groupSearchName = groupSearchName;
	}
	
	public String getGroupSearchName() {
		return groupSearchName;
	}

	public void add(String searchCriteria, String value) {
		criteria.put(searchCriteria, value);
	}
	
	public Map<String, Object> getMap(){
		return criteria;
	}
	
	public void read() {
		Set<Map.Entry<String, Object>> set = criteria.entrySet();
		for (Map.Entry<String, Object> me :set) {
		    System.out.print(me.getKey() + ": ");
		    System.out.println(me.getValue());
		}
	}

	public Object getType() {
		return criteria.get("TYPE");
	}

	public Object getKeyCriteria(String string) {
		return criteria.get(string);
	}
	
}
