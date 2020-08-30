package service;

import java.util.HashMap;
import java.util.Map;

import model.TouristPlace;

public class MapOperations {
	static Map<String, TouristPlace> map = new HashMap<String, TouristPlace>();

	public Map<String, TouristPlace> add(TouristPlace places) {
		map.put(places.getDestination(), places);
		System.out.println(map);
		return map;

	}

	public Map<String, TouristPlace> sortRandomly(TouristPlace places) {
		return null;

	}

	public Map<String, TouristPlace> sortInEntryOrder(HashMap<String, TouristPlace> places) {
		return places;

	}

	public Map<String, TouristPlace> sortAlphabetically(HashMap<String, TouristPlace> places) {
		return places;

	}

	public Object reset(HashMap<String, TouristPlace> places) {
		places.clear();
		return places;

	}

	public HashMap<String, TouristPlace> remove(TouristPlace places) {

		return null;

	}

}
