package com.example.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {

private static final String TAG = "LifeCycle";

@Override
public void onCreate(Bundle savedInstanceState){
	super.onCreate(savedInstanceState);
	Log.v(TAG,"onCreate is called.");
	setContentView(R.layout.activity_main);
}
@Override
protected void onStart(){
	//TODO 自動作成されたメソッド・スタブ
	super.onStart();
	Log.v(TAG,"onStart is called.");
}
@Override
protected void onRestart(){
	//TODO自動作成されたメソッド・スタブ
	super.onRestart();
	Log.v(TAG,"onRestart is called.");
}
@Override
protected void onResume(){
	//TODO自動作成されたメソッド・スタブ
	super.onRestart();
	Log.v(TAG,"onResume is called.");
}
@Override
protected void onPause(){
	//TODO自動作成されたメソッド・スタブ
	super.onRestart();
	Log.v(TAG,"onPause is called.");
}
@Override
protected void onStop(){
	//TODO自動作成されたメソッド・スタブ
	super.onRestart();
	Log.v(TAG,"onStop is called.");
}
@Override
protected void onDestroy(){
	//TODO自動作成されたメソッド・スタブ
	super.onRestart();
	Log.v(TAG,"onDestroy is called.");
}
	
}
