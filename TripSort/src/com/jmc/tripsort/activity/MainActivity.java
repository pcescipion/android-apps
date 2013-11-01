package com.jmc.tripsort.activity;

import java.util.ArrayList;
import java.util.Arrays;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;

import com.jmc.tripsort.R;
import com.jmc.tripsort.adapter.TripAdapter;
import com.jmc.tripsort.bean.AirBoardingCard;
import com.jmc.tripsort.bean.BoardingCard;
import com.jmc.tripsort.bean.BusBoardingCard;
import com.jmc.tripsort.bean.TrainBoardingCard;
import com.jmc.tripsort.business.AbstractSort;
import com.jmc.tripsort.business.SortTrip;

public class MainActivity extends Activity {
	
	private ArrayList<BoardingCard> boardingCardList;	
	private ListView listView;
	private Button buttonSort;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		listView = (ListView)findViewById(R.id.unSortedListView);
		boardingCardList = new ArrayList<BoardingCard>();	
		
		//initialization of the list
		initBoardingCardList(boardingCardList);
		TripAdapter adapter = new TripAdapter(MainActivity.this, boardingCardList);
		listView.setAdapter(adapter);
		
		buttonSort = (Button)findViewById(R.id.buttonSort);
		buttonSort.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				BoardingCard[] sortedList = boardingCardList.toArray(new BoardingCard[boardingCardList.size()]);
				AbstractSort<BoardingCard> sortTrip = new SortTrip(sortedList);
				sortTrip.Sort();	
				
				Intent intent = new Intent(MainActivity.this, ShowSortedListActivity.class);
				intent.putExtra("sortedList", new ArrayList<BoardingCard>(Arrays.asList(sortedList)));
				startActivity(intent);				
			}
		});
	}
	
	
	/**
	 * Method that creates an inicial boarding card list unsorted
	 */
	public void initBoardingCardList(ArrayList<BoardingCard> boardingCardList){
		BoardingCard card;		
		
		card = new AirBoardingCard("Gerona Airporth", "London","45B","SK455","3A");
		card.setRemarks("Baggage drop at ticket counter 344");
		boardingCardList.add(card);
		
		card = new BusBoardingCard("Barcelona", "Gerona Airporth");
		card.setRemarks("No seat assignment");
		boardingCardList.add(card);		
		
		card = new AirBoardingCard("London", "New York JFK","22","SK22","7B");
		card.setRemarks("Baggage will we automatically transferred from your last leg");
		
		boardingCardList.add(card);
		
		card = new TrainBoardingCard("Madrid", "Barcelona","78A","45B");
		boardingCardList.add(card);
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
