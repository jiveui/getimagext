package com.ipsilondev.getimagext;

import java.util.Random;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import org.haxe.lime.HaxeObject;
import android.content.Intent;
import android.util.Log;
import android.content.pm.PackageManager.NameNotFoundException;

import com.ipsilondev.getimagext.IntentManagerZ;

public class MainApp  {
	public static HaxeObject callback;
	public static int typeActivity;

	public static String getAppDir(){
		FManager fm = new FManager(org.haxe.lime.GameActivity.getInstance().getContext());
		return fm.getDir();
	}
	
	public static void filesIntent(HaxeObject cb, int tp){
		callback = cb;
		typeActivity = tp;
		org.haxe.lime.GameActivity.getInstance().startActivityForResult(new Intent(org.haxe.lime.GameActivity.getInstance().getContext(), IntentManagerZ.class).setFlags(Intent.FLAG_ACTIVITY_NEW_TASK), 1);
	}
	
	
	
	
	
	

}
