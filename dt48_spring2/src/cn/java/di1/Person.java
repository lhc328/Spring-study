package cn.java.di1;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Person {
	private List list;
	private Panda pet;
	private Set set;
	private Map map;
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private Properties props;
	@Override
	public String toString() {
		return "Person [list=" + list + ", pet=" + pet + ", set=" + set + ", map=" + map + ", props=" + props + "]";
	}
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	public Panda getPet() {
		return pet;
	}
	public void setPet(Panda pet) {
		this.pet = pet;
	}
	public Set getSet() {
		return set;
	}
	public void setSet(Set set) {
		this.set = set;
	}
	public Map getMap() {
		return map;
	}
	public void setMap(Map map) {
		this.map = map;
	}
	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
}
