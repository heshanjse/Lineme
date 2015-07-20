package extrogene.gamedev.linegame.view.multiplayer;

import java.util.ArrayList;
import java.util.List;


import com.example.line.R;
import extrogene.gamedev.linegame.model.player;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class adapter extends ArrayAdapter<player>{
	Context mycontex;
	ArrayList<player> mylistplayer=new ArrayList<player>();

	public adapter(Context context, int resource, List<player> objects) {
		super(context, resource, objects);
		this.mycontex=context;
		this.mylistplayer=new ArrayList<player>(objects);
		
	}
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View rowvew=convertView;
		VewHolder ViewHolder;
		if(rowvew==null){
			LayoutInflater inflate=(LayoutInflater)mycontex.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			
			rowvew=inflate.inflate(R.layout.itempalyer, null);
			ViewHolder =new VewHolder();
			ViewHolder.TextView=(TextView) rowvew.findViewById(R.id.textname);
			ViewHolder.TextBirthday=(TextView) rowvew.findViewById(R.id.texbirthday);
			ViewHolder.ImgAva=(ImageView) rowvew.findViewById(R.id.imgava);
			ViewHolder.Imgflag=(ImageView) rowvew.findViewById(R.id.imgflag);
			rowvew.setTag(ViewHolder);
	
		}
		else{
			ViewHolder =(VewHolder) convertView.getTag();
		
		}
		player player=mylistplayer.get(position);
		ViewHolder.TextView.setText(player.getName());
		ViewHolder.TextBirthday.setText(player.getbirthday());
		ViewHolder.ImgAva.setImageResource(player.getavtar());
		ViewHolder.Imgflag.setImageResource(player.getflag());
		return rowvew;
	}
	static class VewHolder{
		
		TextView TextView ;
		TextView TextBirthday ;
		ImageView ImgAva;
		ImageView Imgflag;
		
		
		
		
	}
	
	
	
	

}
