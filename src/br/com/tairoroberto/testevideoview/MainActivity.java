package br.com.tairoroberto.testevideoview;

import java.io.File;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//Caminho do sdcard root
	/*	File sdcard = android.os.Environment.getExternalStorageDirectory();
		
		//caminho do video
		File file = new File(sdcard,"Movies/Red Hot Chili Peppers-Scar Tissue.mp4");
		File file2 = new File(sdcard,"Movies/Red Hot Chili Peppers-Dani California.3gp");*/
		
		//Declara o VideoView
		VideoView videoView = (VideoView)findViewById(R.id.videoView1);
				
		//Pega o caminho absoluto do video do sdcard
	//	String src = file.getAbsolutePath();
		
		//add o caminho do video ao videoView do sdcard
	//	videoView.setVideoPath(src);
		
		
		//pega um video da internet
	//	Uri src = Uri.parse("http://www.tairoroberto.kinghost.net/packages/teste_webservice/Red_Hot_Chili_Peppers-Dani_California.3gp");
		
		//pegar um video de dentro do projeto
		Uri src = Uri.parse("android.resource://br.com.tairoroberto.testevideoview/raw/dani_california");
		videoView.setVideoURI(src);
		//add os controles do video
		
		videoView.start();
		videoView.setMediaController(new MediaController(this));
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
