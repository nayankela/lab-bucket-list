package service;

import java.util.HashSet;
import java.util.TreeSet;

import model.TouristPlace;

public class SetOperations {
	static HashSet<TouristPlace> touSet = new HashSet<>();

	public HashSet<TouristPlace> add(TouristPlace places) {
		touSet.add(places);
		return touSet;

	}

	public HashSet<TouristPlace> remove(TouristPlace places) {
		int index = touSet.size() - 1;
		touSet.remove(index);
		return touSet;
	}

	public Object sortByDestination(HashSet<TouristPlace> places) {
		TreeSet<TouristPlace> places2 = new TreeSet<TouristPlace>(places);
		for (TouristPlace tp : places2) {
			System.out.println(tp.getName() + " " + tp.getDestination() + " " + tp.getRank());
		}
		return places2;

	}

	public Object sortByRank(HashSet<TouristPlace> places) {
		TreeSet<TouristPlace> places2 = new TreeSet<TouristPlace>(places);
		for (TouristPlace tp : places2) {
			System.out.println(tp.getName() + " " + tp.getDestination() + " " + tp.getRank());
		}
		return places2;

	}

	public Object reset(HashSet<TouristPlace> places) {
		touSet.clear();
		return touSet;

	}

}
