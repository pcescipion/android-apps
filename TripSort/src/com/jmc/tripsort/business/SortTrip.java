package com.jmc.tripsort.business;
import java.util.HashMap;
import java.util.Map;

import com.jmc.tripsort.bean.BoardingCard;

public class SortTrip extends AbstractSort<BoardingCard> {

	private Map<String, String> map;

	public SortTrip(BoardingCard[] values) {
		super(values);
		super.helper = new BoardingCard[number];
		fillMap(values);
	}

	public void sort() {
		super.Sort();
	}

	private void fillMap(BoardingCard[] values) {

		this.setMap(new HashMap<String, String>());

		for (int i = 0; i < values.length; i++) {
			this.getMap().put(values[i].getFrom(), values[i].getTo());
		}
	}

	protected void merge(int low, int middle, int high) {

		// Copy both parts into the helper array
		for (int i = low; i <= high; i++) {
			helper[i] = toSort[i];
		}

		int i = low;
		int j = middle + 1;
		int k = low;
		// Copy the smallest trip from either the left or the right side back
		// to the original array

		while (i <= middle && j <= high) {
			if (isPath(helper[i].getFrom(), helper[j].getTo())) {
				toSort[k] = helper[i];
				i++;
			} else {
				toSort[k] = helper[j];
				j++;
			}
			k++;
		}
		// Copy the rest of the left side of the array into the target array
		while (i <= middle) {
			toSort[k] = helper[i];
			k++;
			i++;
		}
	}

	private boolean isPath(String from, String to) {

		if (this.getMap().get(from) == null) {
			return false;
		} else if (this.getMap().get(from).equalsIgnoreCase(to)) {
			return true;
		} else {
			return isPath(this.getMap().get(from), to);
		}
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}
}
