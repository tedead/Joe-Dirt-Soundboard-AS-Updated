package org.nibbler.zoe.joedirt;
import org.nibbler.zoe.joedirt.R;
import com.google.ads.*;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.TableRow;

@SuppressLint("DefaultLocale")
public class MainActivity extends Activity implements OnClickListener, OnLongClickListener {
	
	private AdView adView;

	private MediaPlayer mp;

    @Override
    public void onCreate(Bundle savedInstanceState) {
    	
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.main);
        
        // Create the adView
        adView = new AdView(this, AdSize.BANNER, "a15094636fc8408");

        TableRow layout = (TableRow)findViewById(R.id.mainLayout);

        // Add the adView to it
        layout.addView(adView);

        // Initiate a generic request to load it with an ad
        adView.loadAd(new AdRequest());

        //SET ONCLICKLISTENER
        
        findViewById(R.id.button_a1976).setOnClickListener(this);
        
        findViewById(R.id.button_a1976).setOnLongClickListener(this);
        
        findViewById(R.id.button_autotrader).setOnClickListener(this);
        
        findViewById(R.id.button_autotrader).setOnLongClickListener(this);
        
        findViewById(R.id.button_circustent).setOnClickListener(this);
        
        findViewById(R.id.button_circustent).setOnLongClickListener(this);
        
        findViewById(R.id.button_crap).setOnClickListener(this);
        
        findViewById(R.id.button_crap).setOnLongClickListener(this);
        
        findViewById(R.id.button_crapper).setOnClickListener(this);
        
        findViewById(R.id.button_crapper).setOnLongClickListener(this);
        
        findViewById(R.id.button_cries).setOnClickListener(this);
        
        findViewById(R.id.button_cries).setOnLongClickListener(this);
        
        findViewById(R.id.button_daddy).setOnClickListener(this);
        
        findViewById(R.id.button_daddy).setOnLongClickListener(this);
        
        findViewById(R.id.button_defleppard).setOnClickListener(this);
        
        findViewById(R.id.button_defleppard).setOnLongClickListener(this);
        
        findViewById(R.id.button_dog).setOnClickListener(this);
        
        findViewById(R.id.button_dog).setOnLongClickListener(this);
        
        findViewById(R.id.button_falldown).setOnClickListener(this);
        
        findViewById(R.id.button_falldown).setOnLongClickListener(this);
        
        findViewById(R.id.button_fireworks).setOnClickListener(this);
        
        findViewById(R.id.button_fireworks).setOnLongClickListener(this);
        
        findViewById(R.id.button_isitdone).setOnClickListener(this);
        
        findViewById(R.id.button_isitdone).setOnLongClickListener(this);
        
        findViewById(R.id.button_kickingwing).setOnClickListener(this);
        
        findViewById(R.id.button_kickingwing).setOnLongClickListener(this);
        
        findViewById(R.id.button_lotion).setOnClickListener(this);
        
        findViewById(R.id.button_lotion).setOnLongClickListener(this);
        
        findViewById(R.id.button_lotionskin).setOnClickListener(this);
        
        findViewById(R.id.button_lotionskin).setOnLongClickListener(this);
        
        findViewById(R.id.button_meteor).setOnClickListener(this);
        
        findViewById(R.id.button_meteor).setOnLongClickListener(this);
        
        findViewById(R.id.button_mic).setOnClickListener(this);
        
        findViewById(R.id.button_mic).setOnLongClickListener(this);
        
        findViewById(R.id.button_neck).setOnClickListener(this);
        
        findViewById(R.id.button_neck).setOnLongClickListener(this);
        
        findViewById(R.id.button_poo).setOnClickListener(this);
        
        findViewById(R.id.button_poo).setOnLongClickListener(this);
        
        findViewById(R.id.button_rocker).setOnClickListener(this);
        
        findViewById(R.id.button_rocker).setOnLongClickListener(this);
        
        findViewById(R.id.button_rusty).setOnClickListener(this);
        
        findViewById(R.id.button_rusty).setOnLongClickListener(this);
        
        findViewById(R.id.button_sermon).setOnClickListener(this);
        
        findViewById(R.id.button_sermon).setOnLongClickListener(this);
        
        findViewById(R.id.button_spinning).setOnClickListener(this);
        
        findViewById(R.id.button_spinning).setOnLongClickListener(this);
        
        findViewById(R.id.button_takeajoe).setOnClickListener(this);
        
        findViewById(R.id.button_takeajoe).setOnLongClickListener(this);
        
        findViewById(R.id.button_tenfour).setOnClickListener(this);
        
        findViewById(R.id.button_tenfour).setOnLongClickListener(this);
        
        findViewById(R.id.button_unicef).setOnClickListener(this);
        
        findViewById(R.id.button_unicef).setOnLongClickListener(this);
        
        findViewById(R.id.button_usuck).setOnClickListener(this);
        
        findViewById(R.id.button_usuck).setOnLongClickListener(this);
        
        findViewById(R.id.button_what).setOnClickListener(this);
        
        findViewById(R.id.button_what).setOnLongClickListener(this);
        
        findViewById(R.id.button_joedirthole).setOnClickListener(this);
        
        findViewById(R.id.button_joedirthole).setOnLongClickListener(this);
        
        //Version 1.9
        
        findViewById(R.id.button_solderingiron).setOnClickListener(this);
        
        findViewById(R.id.button_solderingiron).setOnLongClickListener(this);
        
        findViewById(R.id.button_posi).setOnClickListener(this);
        
        findViewById(R.id.button_posi).setOnLongClickListener(this);
        
        findViewById(R.id.button_hemi).setOnClickListener(this);
        
        findViewById(R.id.button_hemi).setOnLongClickListener(this);
        
        findViewById(R.id.button_woodchipper).setOnClickListener(this);
        
        findViewById(R.id.button_woodchipper).setOnLongClickListener(this);
        
        findViewById(R.id.button_leif).setOnClickListener(this);
        
        findViewById(R.id.button_leif).setOnLongClickListener(this);
        
        findViewById(R.id.button_town).setOnClickListener(this);
        
        findViewById(R.id.button_town).setOnLongClickListener(this);
        
        findViewById(R.id.button_boeing).setOnClickListener(this);
        
        findViewById(R.id.button_boeing).setOnLongClickListener(this);
        
        //Version 2.0
        
        findViewById(R.id.button_outofdate).setOnClickListener(this);
        
        findViewById(R.id.button_outofdate).setOnLongClickListener(this);
        
        findViewById(R.id.button_homosnaked).setOnClickListener(this);
        
        findViewById(R.id.button_homosnaked).setOnLongClickListener(this);
        
        findViewById(R.id.button_buffout).setOnClickListener(this);
        
        findViewById(R.id.button_buffout).setOnLongClickListener(this);
        
        findViewById(R.id.button_cliff).setOnClickListener(this);
        
        findViewById(R.id.button_cliff).setOnLongClickListener(this);
        
        findViewById(R.id.button_charlene).setOnClickListener(this);
        
        findViewById(R.id.button_charlene).setOnLongClickListener(this);
        
        findViewById(R.id.button_largeandincharge).setOnClickListener(this);
        
        findViewById(R.id.button_largeandincharge).setOnLongClickListener(this);
        
        findViewById(R.id.button_head).setOnClickListener(this);
        
        findViewById(R.id.button_head).setOnLongClickListener(this);
        
        findViewById(R.id.button_backtowork).setOnClickListener(this);
        
        findViewById(R.id.button_backtowork).setOnLongClickListener(this);
        
        //Version 2.1
        
        findViewById(R.id.button_notcool).setOnClickListener(this);
        
        findViewById(R.id.button_notcool).setOnLongClickListener(this);
        
        findViewById(R.id.button_bumperpool).setOnClickListener(this);
        
        findViewById(R.id.button_bumperpool).setOnLongClickListener(this);
        
        //All versions:
        
        findViewById(R.id.button_exit).setOnClickListener(this);
        
        findViewById(R.id.button_exit).setOnLongClickListener(this);

    }
    
public void onClick(View v) {
    	
    	int resId = 0;
    	
    	switch(v.getId()) {
    	
    	case R.id.button_a1976:
    		
        	if (mp != null) {
        		
        		mp.release();
        		
        	}
    		
    		resId = R.raw.a1976;
    	
    		break;
    		
    	case R.id.button_autotrader:
    		
        	if (mp != null) {
        		
        		mp.release();
        		
        	}
    		
    		resId = R.raw.autotrader;
    		
    		break;
    		
    	case R.id.button_circustent:
    		
        	if (mp != null) {
        		
        		mp.release();
        		
        	}
    		
    		resId = R.raw.circustent;
    		
    		break;
    		
    	case R.id.button_crap:
    		
        	if (mp != null) {
        		
        		mp.release();
        		
        	}
    		
    		resId = R.raw.crap;
    		
    		break;
    		
    	case R.id.button_crapper:
    		
        	if (mp != null) {
        		
        		mp.release();
        		
        	}
    		
    		resId = R.raw.crapper;
    		
    		break;
    		
    	case R.id.button_cries:
    		
        	if (mp != null) {
        		
        		mp.release();
        		
        	}
    		
    		resId = R.raw.cries;
    		
    		break;
    		
    	case R.id.button_daddy:
    		
        	if (mp != null) {
        		
        		mp.release();
        		
        	}
    		
    		resId = R.raw.daddy;
    		
    		break;
    		
    	case R.id.button_defleppard:
    		
        	if (mp != null) {
        		
        		mp.release();
        		
        	}
    		
    		resId = R.raw.defleppard;
    		
    		break;
    		
    	case R.id.button_dog:
    		
        	if (mp != null) {
        		
        		mp.release();
        		
        	}
    		
    		resId = R.raw.dog;
    		
    		break;
    		
    	case R.id.button_falldown:
    		
        	if (mp != null) {
        		
        		mp.release();
        		
        	}
    		
    		resId = R.raw.falldown;
    		
    		break;
    		
    	case R.id.button_fireworks:
    		
        	if (mp != null) {
        		
        		mp.release();
        		
        	}
    		
    		resId = R.raw.fireworks;
    		
    		break;
    		
    	case R.id.button_isitdone:
    		
        	if (mp != null) {
        		
        		mp.release();
        		
        	}
    		
    		resId = R.raw.isitdone;
    		
    		break;
    		
    	case R.id.button_kickingwing:
    		
        	if (mp != null) {
        		
        		mp.release();
        		
        	}
    		
    		resId = R.raw.kickingwing;
    		
    		break;
    		
    	case R.id.button_lotion:
    		
        	if (mp != null) {
        		
        		mp.release();
        		
        	}
    		
    		resId = R.raw.lotion;
    		
    		break;
    		
    	case R.id.button_lotionskin:
    		
        	if (mp != null) {
        		
        		mp.release();
        		
        	}
    		
    		resId = R.raw.lotionskin;
    		
    		break;
    		
    	case R.id.button_meteor:
    		
        	if (mp != null) {
        		
        		mp.release();
        		
        	}
    		
    		resId = R.raw.meteor;
    		
    		break;
    		
    	case R.id.button_mic:
    		
        	if (mp != null) {
        		
        		mp.release();
        		
        	}
    		
    		resId = R.raw.mic;
    		
    		break;
    		
    	case R.id.button_neck:
    		
        	if (mp != null) {
        		
        		mp.release();
        		
        	}
    		
    		resId = R.raw.neck;
    		
    		break;
    		
    	case R.id.button_poo:
    		
        	if (mp != null) {
        		
        		mp.release();
        		
        	}
    		
    		resId = R.raw.poo;
    		
    		break;
    		
    	case R.id.button_rocker:
    		
        	if (mp != null) {
        		
        		mp.release();
        		
        	}
    		
    		resId = R.raw.rocker;
    		
    		break;
    		
    	case R.id.button_rusty:
    		
        	if (mp != null) {
        		
        		mp.release();
        		
        	}
    		
    		resId = R.raw.rusty;
    		
    		break;
    		
    	case R.id.button_sermon:
    		
        	if (mp != null) {
        		
        		mp.release();
        		
        	}
    		
    		resId = R.raw.sermon;
    		
    		break;
    		
    	case R.id.button_spinning:
    		
        	if (mp != null) {
        		
        		mp.release();
        		
        	}
    		
    		resId = R.raw.spinning;
    		
    		break;
    		
    	case R.id.button_takeajoe:
    		
        	if (mp != null) {
        		
        		mp.release();
        		
        	}
    		
    		resId = R.raw.takeajoe;
    		
    		break;
    		
    	case R.id.button_tenfour:
    		
        	if (mp != null) {
        		
        		mp.release();
        		
        	}
    		
    		resId = R.raw.tenfour;
    		
    		break;
    		
    	case R.id.button_unicef:
    		
        	if (mp != null) {
        		
        		mp.release();
        		
        	}
    		
    		resId = R.raw.unicef;
    		
    		break;
    		
    	case R.id.button_usuck:
    		
        	if (mp != null) {
        		
        		mp.release();
        		
        	}
    		
    		resId = R.raw.usuck;
    		
    		break;
    		
    	case R.id.button_what:
    		
        	if (mp != null) {
        		
        		mp.release();
        		
        	}
    		
    		resId = R.raw.what;
    		
    		break;
    		
    	case R.id.button_joedirthole:
    		
        	if (mp != null) {
        		
        		mp.release();
        		
        	}
    		
    		resId = R.raw.joedirthole;
    		
    		break;
    		
    	//VERSION 1.9 ADDED MP3 SOUNDS -- BEGIN
    		
    	case R.id.button_solderingiron:
    		
        	if (mp != null) {
        		
        		mp.release();
        		
        	}
    		
    		resId = R.raw.solderingiron;
    		
    		break;
    		
    	case R.id.button_posi:
    		
        	if (mp != null) {
        		
        		mp.release();
        		
        	}
    		
    		resId = R.raw.posi;
    		
    		break;
    		
    	case R.id.button_hemi:
    		
        	if (mp != null) {
        		
        		mp.release();
        		
        	}
    		
    		resId = R.raw.hemi;
    		
    		break;
    		
    	case R.id.button_woodchipper:
    		
        	if (mp != null) {
        		
        		mp.release();
        		
        	}
    		
    		resId = R.raw.woodchipper;
    		
    		break;
    		
    	case R.id.button_leif:
    		
        	if (mp != null) {
        		
        		mp.release();
        		
        	}
    		
    		resId = R.raw.leif;
    		
    		break;
    		
    	case R.id.button_town:
    		
        	if (mp != null) {
        		
        		mp.release();
        		
        	}
    		
    		resId = R.raw.town;
    		
    		break;
    		
    	case R.id.button_boeing:
    		
        	if (mp != null) {
        		
        		mp.release();
        		
        	}
    		
    		resId = R.raw.boeing;
    		
    		break;
    		
    	//VERSION 1.9 ADDED MP3 SOUNDS -- END
    		
    	//VERSION 2.0 ADDED MP3 SOUNDS -- BEGIN
    		
    	case R.id.button_outofdate:
    		
        	if (mp != null) {
        		
        		mp.release();
        		
        	}
    		
    		resId = R.raw.outofdate;
    		
    		break;
    	
    	case R.id.button_homosnaked:
    		
        	if (mp != null) {
        		
        		mp.release();
        		
        	}
    		
    		resId = R.raw.homosnaked;
    		
    		break;
    		
    	case R.id.button_buffout:
    		
        	if (mp != null) {
        		
        		mp.release();
        		
        	}
    		
    		resId = R.raw.buffout;
    		
    		break;
    		
    	case R.id.button_cliff:
    		
        	if (mp != null) {
        		
        		mp.release();
        		
        	}
    		
    		resId = R.raw.cliff;
    		
    		break;
    		
    	case R.id.button_charlene:
    		
        	if (mp != null) {
        		
        		mp.release();
        		
        	}
    		
    		resId = R.raw.charlene;
    		
    		break;
    		
    	case R.id.button_largeandincharge:
    		
        	if (mp != null) {
        		
        		mp.release();
        		
        	}
    		
    		resId = R.raw.largeandincharge;
    		
    		break;
    		
    	case R.id.button_head:
    		
        	if (mp != null) {
        		
        		mp.release();
        		
        	}
    		
    		resId = R.raw.head;
    		
    		break;
    		
    	case R.id.button_backtowork:
    		
        	if (mp != null) {
        		
        		mp.release();
        		
        	}
    		
    		resId = R.raw.backtowork;
    		
    		break;
    		
    	//VERSION 2.0 ADDED MP3 SOUND -- END
    		
    	//VERSION 2.1 ADDED MP3 SOUNDS -- BEGIN
    		
    	case R.id.button_notcool:
    		
        	if (mp != null) {
        		
        		mp.release();
        		
        	}
    		
    		resId = R.raw.notcool;
    		
    		break;
    		
    	case R.id.button_bumperpool:
    		
        	if (mp != null) {
        		
        		mp.release();
        		
        	}
    		
    		resId = R.raw.bumperpool;
    		
    		break;
    		
    	//VERSION 2.1 ADDED MP3 SOUNDS -- END
    		
    	case R.id.button_exit:
    		
        	if (mp != null) {
        		
        		mp.release();
        		
        	}
    		
			finish();

			return;
    		
    	}
    	
    	
    	if (mp != null) {
    		
    		mp.release();
    		
    	}
    	
    	mp = MediaPlayer.create(this, resId);
    	
    	mp.start();
    	
    }

	@Override
	public boolean onLongClick(View v) {

		Intent popup = new Intent(this, SaveFile.class);
		
		popup.putExtra("id", v.getId());
		
		startActivity(popup);
		
        return true;
	    
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
    		
    	} else if (fileName.toLowerCase().equals("notcool.mp3")) {
    		
    		artist = "Not cool";
    		
    	} else if (fileName.toLowerCase().equals("bumperpool.mp3")) {
    		
    		artist = "Bumperpool";
    		
    	} else {
    		
    		artist = "Unknown";
    		
    	}
    	
		return artist;
		

    }
  
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    	
        //getMenuInflater().inflate(R.menu.main, menu);
        
        return true;
        
    }
    
    @Override
    public void onDestroy() {
    	
      if (mp != null) {
    	  
        mp.release();
        
      }
      
      if (adView != null) {
    	  
          adView.destroy();
          
      }

      super.onDestroy();
      
    }
    
}
