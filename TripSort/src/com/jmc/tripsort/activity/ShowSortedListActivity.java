package com.jmc.tripsort.activity;

import java.util.ArrayList;
import java.util.Arrays;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.jmc.tripsort.R;
import com.jmc.tripsort.adapter.TripAdapter;
import com.jmc.tripsort.bean.BoardingCard;

public class ShowSortedListActivity  extends Activity{

	private ListView listView;
	private ArrayList<BoardingCard> sortedList;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.show_sorted_list);
		
		listView = (ListView)findViewById(R.id.sortedListView);
		
		sortedList =( ArrayList<BoardingCard>) getIntent().getSerializableExtra("sortedList");
		
		TripAdapter adapter = new TripAdapter(ShowSortedListActivity.this,sortedList);
		listView.setAdapter(adapter);
		
	}
}
