
package com.coboltforge.slidemenuexample;

import com.coboltforge.slidemenu.SlideMenu;
import com.coboltforge.slidemenu.SlideMenuInterface.OnSlideMenuItemClickListener;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements OnSlideMenuItemClickListener {

	private SlideMenu slidemenu;

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_main);
		
		// add slide menu
		slidemenu = new SlideMenu(this, R.menu.slide, this, 333);
		slidemenu.setHeaderImage(R.drawable.ic_launcher);
		
		// connect the fallback button in case there is no ActionBar
		Button b = (Button) findViewById(R.id.buttonMenu);
		b.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				slidemenu.show();
			}
		});
		
	}


	@Override
	public void onSlideMenuItemClick(int itemId) {

		switch(itemId) {
		case R.id.item_one:
			Toast.makeText(this, "Item one selected", Toast.LENGTH_SHORT).show();
			break;
		case R.id.item_two:
			Toast.makeText(this, "Item two selected", Toast.LENGTH_SHORT).show();
			break;
		case R.id.item_three:
			Toast.makeText(this, "Item three selected", Toast.LENGTH_SHORT).show();
			break;
		case R.id.item_four:
			Toast.makeText(this, "Item four selected", Toast.LENGTH_SHORT).show();
			break;
		}
		
	}
	
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch(item.getItemId()) {
		case android.R.id.home: // this is the app icon of the actionbar
			slidemenu.show();
			break;
		}
		return super.onOptionsItemSelected(item);
	}
	
	
}