package com.example.originalaso_2014_002;

import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

public class MaintenanceActivity extends Activity implements
	View.OnClickListener, AdapterView.OnItemClickListener{


	@Override
	public void onClick(View v) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO 自動生成されたメソッド・スタブ
		super.onCreate(savedInstanceState);
		setContentView(R.layout.maintenance_activity);

	}

	SQLiteDatabase sdb = null;
	MySQLiteOpenHelper helper = null;

	int selectedId = -1;

	int lastPosition = -1;

	@Override
	protected void onResume(){
		super.onResume();

		Button btnDelete = (Button)findViewById(R.id.btnDELETE);
		Button btnMainte_Back = (Button)findViewById(R.id.btnMAINTE_BACK);
		ListView lstHitokoto =(ListView)findViewById(R.id.LvHITOKOTO);

		btnDelete.setOnClickListener(this);
		btnMainte_Back.setOnItemClickListener(this);

		lstHitokoto.setOnItemClickListener(this);
		this.setDBValuetoList(lstHitokoto);


	}




}
