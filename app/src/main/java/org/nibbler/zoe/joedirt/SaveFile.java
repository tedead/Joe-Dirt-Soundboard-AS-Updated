package org.nibbler.zoe.joedirt;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import android.content.SharedPreferences;

@SuppressWarnings("serial")
public class SaveFile extends Activity implements OnClickListener, Serializable {
	
	int resId, id;
	
	@SuppressWarnings("unused")
	private SharedPreferences myPrefs;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
			
		setTitle("Save As...");
			
		setContentView(R.layout.savefile);
		
		findViewById(R.id.btn_ringtone).setOnClickListener(this);
		
		findViewById(R.id.btn_notification).setOnClickListener(this);
		
		findViewById(R.id.btn_alarm).setOnClickListener(this);
		
		findViewById(R.id.btn_cancel).setOnClickListener(this);
		
		//Get the passed information from the previous Activity
		
		Bundle extras = getIntent().getExtras();
		
		id = extras.getInt("id");
	
	
		//Get resId
		
		resId = getResId(id);
			
	}
	
	@Override
	public void onClick(View v) {

		switch(v.getId()) {
    	
    	case R.id.btn_ringtone:
			
			setRingtone(resId);
    	
    		break;
    		
    	case R.id.btn_notification:
    		
    		setNotification(resId);
    	
    		break;
    		
    	case R.id.btn_alarm:
    		
    		setAlarm(resId);
    	
    		break;
    		
    	case R.id.btn_cancel:
			
			finish();
    	
    		break;
    		
    	}
    	
	}
	
	private int getResId(int id) {
		
		switch (id) {
		
		case R.id.button_a1976:
    		
    		resId = R.raw.a1976;
    	
    		break;
    		
    	case R.id.button_autotrader:

    		resId = R.raw.autotrader;
    		
    		break;
    		
    	case R.id.button_circustent:

    		resId = R.raw.circustent;
    		
    		break;
    		
    	case R.id.button_crap:

    		resId = R.raw.crap;
    		
    		break;
    		
    	case R.id.button_crapper:

    		resId = R.raw.crapper;
    		
    		break;
    		
    	case R.id.button_cries:

    		resId = R.raw.cries;
    		
    		break;
    		
    	case R.id.button_daddy:

    		resId = R.raw.daddy;
    		
    		break;
    		
    	case R.id.button_defleppard:

    		resId = R.raw.defleppard;
    		
    		break;
    		
    	case R.id.button_dog:

    		resId = R.raw.dog;
    		
    		break;
    		
    	case R.id.button_falldown:

    		resId = R.raw.falldown;
    		
    		break;
    		
    	case R.id.button_fireworks:

    		resId = R.raw.fireworks;
    		
    		break;
    		
    	case R.id.button_isitdone:

    		resId = R.raw.isitdone;
    		
    		break;
    		
    	case R.id.button_kickingwing:

    		resId = R.raw.kickingwing;
    		
    		break;
    		
    	case R.id.button_lotion:

    		resId = R.raw.lotion;
    		
    		break;
    		
    	case R.id.button_lotionskin:

    		resId = R.raw.lotionskin;
    		
    		break;
    		
    	case R.id.button_meteor:

    		resId = R.raw.meteor;
    		
    		break;
    		
    	case R.id.button_mic:

    		resId = R.raw.mic;
    		
    		break;
    		
    	case R.id.button_neck:

    		resId = R.raw.neck;
    		
    		break;
    		
    	case R.id.button_poo:

    		resId = R.raw.poo;
    		
    		break;
    		
    	case R.id.button_rocker:

    		resId = R.raw.rocker;
    		
    		break;
    		
    	case R.id.button_rusty:

    		resId = R.raw.rusty;
    		
    		break;
    		
    	case R.id.button_sermon:

    		resId = R.raw.sermon;
    		
    		break;
    		
    	case R.id.button_spinning:

    		resId = R.raw.spinning;
    		
    		break;
    		
    	case R.id.button_takeajoe:

    		resId = R.raw.takeajoe;
    		
    		break;
    		
    	case R.id.button_tenfour:

    		resId = R.raw.tenfour;
    		
    		break;
    		
    	case R.id.button_unicef:

    		resId = R.raw.unicef;
    		
    		break;
    		
    	case R.id.button_usuck:

    		resId = R.raw.usuck;
    		
    		break;
    		
    	case R.id.button_what:

    		resId = R.raw.what;
    		
    		break;
    		
    	case R.id.button_joedirthole:

    		resId = R.raw.joedirthole;
    		
    		break;
    		
    	case R.id.button_solderingiron:
    		
    		resId = R.raw.solderingiron;
    		
    		break;
    		
    	case R.id.button_posi:
    		
    		resId = R.raw.posi;
    		
    		break;
    		
    	case R.id.button_hemi:

    		resId = R.raw.hemi;
    		
    		break;
    		
    	case R.id.button_woodchipper:

    		resId = R.raw.woodchipper;
    		
    		break;
    		
    	case R.id.button_leif:

    		resId = R.raw.leif;
    		
    		break;
    		
    	case R.id.button_town:

    		resId = R.raw.town;
    		
    		break;
    		
    	case R.id.button_boeing:

    		resId = R.raw.boeing;
    		
    		break;
    		
    	//Version 1.7 update 2-3-2013 (Super Bowl Sunday - Ravens: 21 49'ers: 6)
    		
    	case R.id.button_outofdate:

    		resId = R.raw.boeing;
    		
    		break;
    		
    	case R.id.button_homosnaked:

    		resId = R.raw.homosnaked;
    		
    		break;
    		
    	case R.id.button_buffout:

    		resId = R.raw.buffout;
    		
    		break;
    		
    	case R.id.button_cliff:

    		resId = R.raw.cliff;
    		
    		break;
    		
    	case R.id.button_charlene:

    		resId = R.raw.charlene;
    		
    		break;
    		
    	case R.id.button_largeandincharge:

    		resId = R.raw.largeandincharge;
    		
    		break;
    		
    	case R.id.button_head:

    		resId = R.raw.head;
    		
    		break;
    		
    	case R.id.button_backtowork:

    		resId = R.raw.backtowork;
    		
    		break;
    		
    	//Version 2.1
    		
    	case R.id.button_notcool:

    		resId = R.raw.notcool;
    		
    		break;
    		
    	case R.id.button_bumperpool:

    		resId = R.raw.bumperpool;
    		
    		break;
		
		}
		
		return resId;
		
		
	}
	
	private void setRingtone(int resId) {
		
		Context context = getApplicationContext();

		CharSequence failed = "Copy failed!";
		
		int duration = Toast.LENGTH_SHORT;
		
		try {
			
			/*
			 * fileCopy(file identifier, mode)
			 * 
			 * MODES:
			 * 
			 * 1 = Save as ringtone
			 * 2 = Save as notification
			 * 3 = Save as alarm
			 */
		
			fileCopy(resId, 1);
			
		} catch (IOException e) {
			
			Toast toast = Toast.makeText(context, failed, duration);
			
			toast.show();

		}
	    
	}

    public void fileCopy(int resId, int mode) throws IOException {
    	
    	//Make sure the mode is reset
    	int copyMode = 0;
    	
    	copyMode = mode;
    	
    	//MODE: RINGTONE
    	if (copyMode == 1) {
    	
	    	InputStream ins = getResources().openRawResource(resId);
	    	
	    	ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
	    	
	    	int size = 0;
	    	
	    	// Read the entire resource into a local byte buffer.
	    	
	    	byte[] buffer = new byte[1024];
	
	    	while((size = ins.read(buffer,0,1024)) >= 0){
	    		
	    	  outputStream.write(buffer, 0, size);
	    	  
	    	}
	    	
	    	ins.close();
	    	
	    	buffer = outputStream.toByteArray();
	
	        File dir = new File(Environment.getExternalStorageDirectory() + "/Music/Ringtones");
			
			//Source
			String soundFile = getString(resId);
			
			String fileName = soundFile.substring(8,soundFile.length());
	        
			//Destination
	        String strDestinationFile = dir.toString() + "/" + fileName;
	        
	        long fileSize = dir.length();
	        
	        if(!dir.exists() && !dir.isDirectory()) {
	        	
	        	dir.mkdirs();
	        	
	        }
	
	        try {
	        	
	        	Context context = getApplicationContext();
	    		
	    		int duration = Toast.LENGTH_LONG;
	    		
				FileOutputStream fos = new FileOutputStream(strDestinationFile);
	
				fos.write(buffer);
	    	
				fos.close();
				
				//SET RINGTONE
				String artist = getTitle(fileName);
				
				File currentFile = new File(Environment.getExternalStorageDirectory() + "/Music/Ringtones/" + fileName);
				
				ContentValues values = new ContentValues();
				
				values.put(MediaStore.MediaColumns.DATA, Environment.getExternalStorageDirectory() + "/Music/Ringtones/" + fileName);
				
				values.put(MediaStore.MediaColumns.TITLE, artist);
				
				values.put(MediaStore.MediaColumns.SIZE, fileSize);
				
				values.put(MediaStore.MediaColumns.MIME_TYPE, "audio/mpeg");
	
				values.put(MediaStore.Audio.Media.ARTIST, artist);
	
				values.put(MediaStore.Audio.Media.IS_RINGTONE, true);
	
				Uri uri = MediaStore.Audio.Media.getContentUriForPath(Environment.getExternalStorageDirectory() + "/Music/Ringtones/");
				
				getContentResolver().delete(uri, MediaStore.MediaColumns.DATA + "=\"" + currentFile.getAbsolutePath() + "\"", null);
				
				Uri newUri = getContentResolver().insert(uri, values);
	
				RingtoneManager.setActualDefaultRingtoneUri(this.getBaseContext(), RingtoneManager.TYPE_RINGTONE, newUri);
				
				new SingleMediaScanner(this, currentFile);
				
				CharSequence success = artist + " set as ringtone.";
				
				Toast toast = Toast.makeText(context, success, duration);
				
				toast.show();
	
	        } catch (Exception e) {
	        	
	    		Context context = getApplicationContext();
	    		
	    		CharSequence ok = e.getMessage();
	    		
	    		int duration = Toast.LENGTH_SHORT;
	    		
				Toast toast = Toast.makeText(context, ok, duration);
				
				toast.show();	
	        	
	        }
        
	    //MODE: NOTIFICATION
    	} else if (copyMode == 2) {
    	
	    	InputStream ins = getResources().openRawResource(resId);
	    	
	    	ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
	    	
	    	int size = 0;
	    	
	    	// Read the entire resource into a local byte buffer.
	    	
	    	byte[] buffer = new byte[1024];
	
	    	while((size = ins.read(buffer,0,1024)) >= 0){
	    		
	    	  outputStream.write(buffer, 0, size);
	    	  
	    	}
	    	
	    	ins.close();
	    	
	    	buffer = outputStream.toByteArray();
	
	        File dir = new File(Environment.getExternalStorageDirectory() + "/Music/Notifications");
			
			//Source
			String soundFile = getString(resId);
			
			String fileName = soundFile.substring(8,soundFile.length());
	        
			//Destination
	        String strDestinationFile = dir.toString() + "/" + fileName;
	        
	        long fileSize = dir.length();
	        
	        if(!dir.exists() && !dir.isDirectory()) {
	        	
	        	dir.mkdirs();
	        	
	        }
	
	        try {
	        	
	        	Context context = getApplicationContext();
	    		
	    		int duration = Toast.LENGTH_LONG;
	    		
				FileOutputStream fos = new FileOutputStream(strDestinationFile);
	
				fos.write(buffer);
	    	
				fos.close();
				
				//SET NOTIFICATION
				String artist = getTitle(fileName);
				
				File currentFile = new File(Environment.getExternalStorageDirectory() + "/Music/Notifications/" + fileName);
				
				ContentValues values = new ContentValues();
				
				values.put(MediaStore.MediaColumns.DATA, Environment.getExternalStorageDirectory() + "/Music/Notifications/" + fileName);
				
				values.put(MediaStore.MediaColumns.TITLE, artist);
				
				values.put(MediaStore.MediaColumns.SIZE, fileSize);
				
				values.put(MediaStore.MediaColumns.MIME_TYPE, "audio/mpeg");
	
				values.put(MediaStore.Audio.Media.ARTIST, artist);
	
				values.put(MediaStore.Audio.Media.IS_NOTIFICATION, true);
	
				Uri uri = MediaStore.Audio.Media.getContentUriForPath(Environment.getExternalStorageDirectory() + "/Music/Notifications/");
				
				getContentResolver().delete(uri, MediaStore.MediaColumns.DATA + "=\"" + currentFile.getAbsolutePath() + "\"", null);
				
				Uri newUri = getContentResolver().insert(uri, values);
	
				RingtoneManager.setActualDefaultRingtoneUri(this.getBaseContext(), RingtoneManager.TYPE_NOTIFICATION, newUri);
				
				new SingleMediaScanner(this, currentFile);
				
				CharSequence success = artist + " set as notification.";
				
				Toast toast = Toast.makeText(context, success, duration);
				
				toast.show();
	
	        } catch (Exception e) {
	        	
	    		Context context = getApplicationContext();
	    		
	    		CharSequence ok = e.getMessage();
	    		
	    		int duration = Toast.LENGTH_SHORT;
	    		
				Toast toast = Toast.makeText(context, ok, duration);
				
				toast.show();	
	        	
	        }
        
	    //SET ALARM
    	} else if (copyMode == 3) {
    	
	    	InputStream ins = getResources().openRawResource(resId);
	    	
	    	ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
	    	
	    	int size = 0;
	    	
	    	// Read the entire resource into a local byte buffer.
	    	
	    	byte[] buffer = new byte[1024];
	
	    	while((size = ins.read(buffer,0,1024)) >= 0){
	    		
	    	  outputStream.write(buffer, 0, size);
	    	  
	    	}
	    	
	    	ins.close();
	    	
	    	buffer = outputStream.toByteArray();
	
	        File dir = new File(Environment.getExternalStorageDirectory() + "/Music/Alarms");
			
			//Source
			String soundFile = getString(resId);
			
			String fileName = soundFile.substring(8,soundFile.length());
	        
			//Destination
	        String strDestinationFile = dir.toString() + "/" + fileName;
	        
	        long fileSize = dir.length();
	        
	        if(!dir.exists() && !dir.isDirectory()) {
	        	
	        	dir.mkdirs();
	        	
	        }
	
	        try {
	        	
	        	Context context = getApplicationContext();
	    		
	    		int duration = Toast.LENGTH_LONG;
	    		
				FileOutputStream fos = new FileOutputStream(strDestinationFile);
	
				fos.write(buffer);
	    	
				fos.close();
				
				//SET ALARM
				String artist = getTitle(fileName);
				
				File currentFile = new File(Environment.getExternalStorageDirectory() + "/Music/Alarms/" + fileName);
				
				ContentValues values = new ContentValues();
				
				values.put(MediaStore.MediaColumns.DATA, Environment.getExternalStorageDirectory() + "/Music/Alarms/" + fileName);
				
				values.put(MediaStore.MediaColumns.TITLE, artist);
				
				values.put(MediaStore.MediaColumns.SIZE, fileSize);
				
				values.put(MediaStore.MediaColumns.MIME_TYPE, "audio/mpeg");
	
				values.put(MediaStore.Audio.Media.ARTIST, artist);
	
				values.put(MediaStore.Audio.Media.IS_ALARM, true);
	
				Uri uri = MediaStore.Audio.Media.getContentUriForPath(Environment.getExternalStorageDirectory() + "/Music/Alarms/");
				
				getContentResolver().delete(uri, MediaStore.MediaColumns.DATA + "=\"" + currentFile.getAbsolutePath() + "\"", null);
				
				Uri newUri = getContentResolver().insert(uri, values);
	
				RingtoneManager.setActualDefaultRingtoneUri(this.getBaseContext(), RingtoneManager.TYPE_ALARM, newUri);
				
				new SingleMediaScanner(this, currentFile);
				
				CharSequence success = artist + " saved to alarms.";
				
				Toast toast = Toast.makeText(context, success, duration);
				
				toast.show();
	
	        } catch (Exception e) {
	        	
	    		Context context = getApplicationContext();
	    		
	    		CharSequence ok = e.getMessage();
	    		
	    		int duration = Toast.LENGTH_SHORT;
	    		
				Toast toast = Toast.makeText(context, ok, duration);
				
				toast.show();	
	        	
	        }
        
    	}
    	
    }
	
	private void setNotification(int resId) {
		
		Context context = getApplicationContext();

		CharSequence failed = "Copy failed!";
		
		int duration = Toast.LENGTH_SHORT;
		
		try {
			
			/*
			 * fileCopy(file identifier, mode)
			 * 
			 * MODES:
			 * 
			 * 1 = Save as ringtone
			 * 2 = Save as notification
			 * 3 = Save as alarm
			 */
		
			fileCopy(resId, 2);
			
		} catch (IOException e) {
			
			Toast toast = Toast.makeText(context, failed, duration);
			
			toast.show();

		}
		
	}
	
	private void setAlarm(int resId) {
		
		Context context = getApplicationContext();

		CharSequence failed = "Copy failed!";
		
		int duration = Toast.LENGTH_SHORT;
		
		try {
			
			/*
			 * fileCopy(file identifier, mode)
			 * 
			 * MODES:
			 * 
			 * 1 = Save as ringtone
			 * 2 = Save as notification
			 * 3 = Save as alarm
			 */
		
			fileCopy(resId, 3);
			
		} catch (IOException e) {
			
			Toast toast = Toast.makeText(context, failed, duration);
			
			toast.show();

		}
		
	}
	
    @SuppressLint("SuspiciousIndentation")
	public String getTitle(String fileName) {
    	
    	String artist = "";
    	
    	if (fileName.toLowerCase().equals("a1976.mp3")) {
    		
    		artist = "1979";
    		
    	} else if (fileName.toLowerCase().equals("autotrader.mp3")) {
    		
    		artist = "Auto Trader";
    		
    	} else if (fileName.toLowerCase().equals("circustent.mp3")) {
    		
    		artist = "Circus tent";
    		
    	} else if (fileName.toLowerCase().equals("crap.mp3")) {
    		
    		artist = "Crap";
    		
    	} else if (fileName.toLowerCase().equals("crapper.mp3")) {
    		
    		artist = "Crapper";
    		
    	} else if (fileName.toLowerCase().equals("cries.mp3")) {
    		
    		artist = "Cries";
    		
    	} else if (fileName.toLowerCase().equals("daddy.mp3")) {
    		
    		artist = "Daddy";
    		
    	} else if (fileName.toLowerCase().equals("defleppard.mp3")) {
    		
    		artist = "Def Leppard";
    		
    	} else if (fileName.toLowerCase().equals("dog.mp3")) {
    		
    		artist = "dog";
    		
    	} else if (fileName.toLowerCase().equals("falldown.mp3")) {
    		
    		artist = "Fall down";
    		
    	} else if (fileName.toLowerCase().equals("fireworks.mp3")) {
    		
    		artist = "Fireworks";
    		
    	} else if (fileName.toLowerCase().equals("isitdone.mp3")) {
    		
    		artist = "Is it done?";
    		
    	} else if (fileName.toLowerCase().equals("joedirthole.mp3")) {
    		
    		artist = "Joe Dirt hole";
    		
    	} else if (fileName.toLowerCase().equals("kickingwing.mp3")) {
    		
    		artist = "Kicking Wing";
    		
    	} else if (fileName.toLowerCase().equals("lotion.mp3")) {
    		
    		artist = "Lotion";
    		
    	} else if (fileName.toLowerCase().equals("lotionskin.mp3")) {
    		
    		artist = "Lotion skin";
    		
    	} else if (fileName.toLowerCase().equals("meteor.mp3")) {
    		
    		artist = "Meteor";
    		
    	} else if (fileName.toLowerCase().equals("mic.mp3")) {
    		
    		artist = "Mic";
    		
    	} else if (fileName.toLowerCase().equals("neck.mp3")) {
    		
    		artist = "Neck";
    		
    	} else if (fileName.toLowerCase().equals("poo.mp3")) {
    		
    		artist = "Poo";
    		
    	} else if (fileName.toLowerCase().equals("rocker.mp3")) {
    		
    		artist = "Rocker";
    		
    	} else if (fileName.toLowerCase().equals("rusty.mp3")) {
    		
    		artist = "Rusty";
    		
    	} else if (fileName.toLowerCase().equals("sermon.mp3")) {
    		
    		artist = "Sermon";
    		
    	} else if (fileName.toLowerCase().equals("spinning.mp3")) {
    		
    		artist = "Spinning";
    		
    	} else if (fileName.toLowerCase().equals("takeajoe.mp3")) {
    		
    		artist = "Take a Joe";
    		
    	} else if (fileName.toLowerCase().equals("tenfour.mp3")) {
    		
    		artist = "10-4";
    		
    	} else if (fileName.toLowerCase().equals("unicef.mp3")) {
    		
    		artist = "UNICEF";
    		
    	} else if (fileName.toLowerCase().equals("usuck.mp3")) {
    		
    		artist = "You suck!";
    		
    	} else if (fileName.toLowerCase().equals("what.mp3")) {
    		
    		artist = "What?!?!";
    		
    	//NEW
    		
    	} else if (fileName.toLowerCase().equals("boeing.mp3")) {
    		
    		artist = "Boeing";
    		
    	} else if (fileName.toLowerCase().equals("hemi.mp3")) {
    		
    		artist = "Hemi";
    		
    	} else if (fileName.toLowerCase().equals("leif.mp3")) {
    		
    		artist = "Leif";
    		
    	} else if (fileName.toLowerCase().equals("posi.mp3")) {
    		
    		artist = "Posi";
    		
    	} else if (fileName.toLowerCase().equals("solderingiron.mp3")) {
    		
    		artist = "Soldering iron";
    		
    	} else if (fileName.toLowerCase().equals("town.mp3")) {
    		
    		artist = "Town";
    		
    	} else if (fileName.toLowerCase().equals("woodchipper.mp3")) {
    		
    		artist = "Woodchipper";
    		
    	//Version 1.7 update 2-3-2013 (Super Bowl Sunday - Ravens: 21 49'ers: 6)
    		
    	} else if (fileName.toLowerCase().equals("outofdate.mp3")) {
    		
    		artist = "Out of date";
    		
    	} else if (fileName.toLowerCase().equals("homosnaked.mp3")) {
    		
    		artist = "Homo's naked";
    		
    	} else if (fileName.toLowerCase().equals("buffout.mp3")) {
    		
    		artist = "Buff out";
    		
    	} else if (fileName.toLowerCase().equals("cliff.mp3")) {
    		
    		artist = "Cliff";
    		
    	} else if (fileName.toLowerCase().equals("charlene.mp3")) {
    		
    		artist = "Charlene";
    		
    	} else if (fileName.toLowerCase().equals("largeandincharge.mp3")) {
    		
    		artist = "Large and in charge";
    		
    	} else if (fileName.toLowerCase().equals("head.mp3")) {
    		
    		artist = "Head";
    		
    	} else if (fileName.toLowerCase().equals("backtowork.mp3")) {
    		
    		artist = "Back to work";
    		
    	//Version 2.1 - Added two new sounds
    		
    	} else if (fileName.toLowerCase().equals("notcool.mp3")) {
    		
    		artist = "Not cool";
    		
    	} else if (fileName.toLowerCase().equals("bumperpool.mp3")) {
    		
    		artist = "Bumper pool";
    		
    	} else {
    		
    		artist = "Unknown";
    		
    	}
    	
		return artist;

    }

}
	
