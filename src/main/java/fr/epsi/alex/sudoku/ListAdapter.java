package fr.epsi.alex.sudoku;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.TwoLineListItem;

import java.util.ArrayList;

class ListAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<ListLvl> listLvls;

    public ListAdapter(Context context, ArrayList<ListLvl> listLvls) {
        this.context = context;
        this.listLvls = listLvls;
    }

    @Override
    public int getCount() {
        return listLvls.size();
    }

    @Override
    public Object getItem(int position) {
        return listLvls.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        TwoLineListItem twoLineListItem;

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            twoLineListItem = (TwoLineListItem) inflater.inflate(
                    android.R.layout.simple_list_item_2, null);
        } else {
            twoLineListItem = (TwoLineListItem) convertView;
        }

        TextView text1 = twoLineListItem.getText1();
        TextView text2 = twoLineListItem.getText2();

        text1.setText(listLvls.get(position).getName());
        text2.setText(listLvls.get(position).getDescription());

        return twoLineListItem;
    }
}