package com.jmc.tripsort.adapter;

import java.util.ArrayList;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.jmc.tripsort.R;
import com.jmc.tripsort.bean.AirBoardingCard;
import com.jmc.tripsort.bean.BoardingCard;
import com.jmc.tripsort.bean.TrainBoardingCard;

public class TripAdapter extends ArrayAdapter <BoardingCard> {
	
	Activity context;
	ArrayList<BoardingCard> boardingCardList;

	public TripAdapter(Activity context,ArrayList<BoardingCard> boardingCardList) {
		super(context,R.layout.item,boardingCardList);
		this.context = context;
		this.boardingCardList = boardingCardList;		
	}
	
	//ViewHolder pattern, is used to improve the performance of the list
	// the idea is to avoid making access to the layout resources without doing findViewById 	
	public static class ViewHolder{
		public TextView from;
		public TextView to;
		public TextView transport;
		public TextView number;
		public TextView seat;
		public TextView gate;
		public TextView remarks;
	}
	
    public View getView(int position, View convertView, ViewGroup parent) {
    	
    	ViewHolder holder;
    	
    	// the convertView is used to improve the performance while a list is being shown
    	View item = convertView;
    	
    	if(item == null) {
	        LayoutInflater inflater = context.getLayoutInflater();
	        item = inflater.inflate(R.layout.item, null);
	        holder = new ViewHolder();
	        holder.from = (TextView)item.findViewById(R.id.from);
	        holder.to = (TextView)item.findViewById(R.id.to);
	        holder.transport = (TextView)item.findViewById(R.id.transport);
	        holder.number = (TextView)item.findViewById(R.id.number);
	        holder.seat = (TextView)item.findViewById(R.id.seat);
	        holder.gate = (TextView)item.findViewById(R.id.gate);
	        holder.remarks = (TextView)item.findViewById(R.id.remarks);
	       
	        item.setTag(holder);
    	}else holder = (ViewHolder)item.getTag(); 
    	
    	final BoardingCard boardingcard = this.boardingCardList.get(position);
    	
    	if (boardingcard!=null){
    		 holder.from.setText(boardingcard.getFrom());
    		 holder.to.setText(boardingcard.getTo());
    		 holder.transport.setText(boardingcard.getType());
    		 holder.remarks.setText(boardingcard.getRemarks());
    		 
    		 if(boardingcard.getType().equalsIgnoreCase("Fly")){
    			holder.number.setText(((AirBoardingCard)boardingcard).getNumber());
        		holder.seat.setText(((AirBoardingCard)boardingcard).getSeat());
        		holder.gate.setText(((AirBoardingCard)boardingcard).getGate());
    		 }else if(boardingcard.getType().equalsIgnoreCase("TRAIN")){
    			 holder.number.setText(((TrainBoardingCard)boardingcard).getNumber());
         		holder.seat.setText(((TrainBoardingCard)boardingcard).getSeat());         		
    		 } 		
    	}
 
        return(item);
    }

}
