package Collection_In_Spring;

import java.util.*;

public class Store {
	private List<String> list;
	private Set<String> set;
	private Map<String, Integer> map;
	private StoreType storeType;

	public Store() {
		super();
	}

	@Override
	public String toString() {
		return "Store [list=" + list + ", set=" + set + ", map=" + map + ", storeType=" + storeType + "]";
	}

	public Store(List<String> list, Set<String> set, Map<String, Integer> map, StoreType storeType) {
		super();
		this.list = list;
		this.set = set;
		this.map = map;
		this.storeType = storeType;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Set<String> getSet() {
		return set;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}

	public Map<String, Integer> getMap() {
		return map;
	}

	public void setMap(Map<String, Integer> map) {
		this.map = map;
	}

	public StoreType getStoreType() {
		return storeType;
	}

	public void setStoreType(StoreType storeType) {
		this.storeType = storeType;
	}

}
