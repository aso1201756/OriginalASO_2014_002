package com.example.originalaso_2014_002;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HitokotoActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hitokoto_activity);
	}

	@Override
	protected void onResume(){
		super.onResume();

		Intent intent = this.getIntent();

		String strHitokoto = intent.getStringExtra("hitokoto");

		TextView txvHITOKOTO = (TextView)findViewById(R.id.txvHITOKOTO);
		txvHITOKOTO.setText(strHitokoto);
	}
}