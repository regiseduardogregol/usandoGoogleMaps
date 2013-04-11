package com.github.regiseduardogregol.usandogooglemaps;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

// Extends Activity
public class MapsActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.maps);
		
		//MapView map = (MapView) findViewById(R.id.map);
		
		//mapa = new MapView(this, "AIzaSyA_RZ2ZWJCHnNpzMgciqia6Is0v2zeaf8w");
		
		//setContentView(mapa);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.maps, menu);
		return true;
	}

	//@Override
	/*protected boolean isRouteDisplayed() {
		// TODO Auto-generated method stub
		return false;
	}*/

}
