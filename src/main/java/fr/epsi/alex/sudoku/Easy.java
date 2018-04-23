package fr.epsi.alex.sudoku;

import android.app.ListActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class Easy extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ListLvl listLvl;

        ArrayList<ListLvl> listLvls = new ArrayList<ListLvl>();

        for (int i = 0; i < 50; i++) {
            listLvl = new ListLvl();
            listLvl.setName("Niveau Facile " + (i + 1));
            listLvl.setDescription("Description " + (i + 1);
            listLvls.add(listLvl);
        }

        setListAdapter(new ListAdapter(this, listLvls));
    }
}
