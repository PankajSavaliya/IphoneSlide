package socialinfotech.com.iphoneslide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.daimajia.swipe.SwipeLayout;

/**
 * Created by pankaj on 30/09/16.
 */

public class Adapter extends BaseAdapter {
    Context context;
    LayoutInflater inflter;

    public Adapter(Context applicationContext) {
        this.context = applicationContext;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return 20;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.item, null);//set layout for displaying items
        TextView icon = (TextView) view.findViewById(R.id.stock);//get id for image view
        LinearLayout delete = (LinearLayout) view.findViewById(R.id.bottom_l);
        icon.setText("Item Number" + i);
        final SwipeLayout swipeLayout = (SwipeLayout) view.findViewById(R.id.mainView);
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "DELETE", Toast.LENGTH_LONG).show();
                swipeLayout.close(true);
            }
        });
        return view;
    }
}
