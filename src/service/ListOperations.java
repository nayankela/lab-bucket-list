package service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import model.TouristPlace;

public class ListOperations {
	static List<TouristPlace> list = new ArrayList<TouristPlace>();

	public List<TouristPlace> add(TouristPlace places) {
		list.add(places);
		return list;
	}

	public List<TouristPlace> remove(TouristPlace places) {

		int index = list.size() - 1;
		list.remove(index);
		return list;

	}

	public Object sortByDestination(List<TouristPlace> places) {
		Collections.sort(list, Comparator.comparing(TouristPlace::getDestination));

		System.out.println(list);
		return list;

	}

	public Object sortByRank(List<TouristPlace> places) {
		Collections.sort(list, Comparator.comparing(TouristPlace::getRank));
		System.out.println(places);

		return list;

	}

	public Object reset(List<TouristPlace> places) {
		list.clear();
		return list;

	}

}