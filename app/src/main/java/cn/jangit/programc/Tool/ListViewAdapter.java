package cn.jangit.programc.Tool;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import cn.jangit.programc.Activity.Component.PersonalInf;

/**
 * Created by jangitlau on 2017/5/21.
 */

public class ListViewAdapter extends BaseAdapter {
    //set an arraylist in order to make function addPersonalInf
    private ArrayList<PersonalInf> aListItems=new ArrayList<PersonalInf>();
    private PersonalInf[] listItems;
    public void addPersonalInf(PersonalInf inf){
        aListItems.add(inf);
    }
    public void commit(){
        int size=aListItems.size();
        listItems=new PersonalInf[size];
        for(int i=0;i<size;i++){
            listItems[i]=aListItems.get(i);
        }
        aListItems.clear();
    }

    public ListViewAdapter(){
        super();
    }

    public int getCount() {
        return listItems.length;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = listItems[position];
        if(convertView==null){
            convertView.setTag(listItems[position]);
        }
        return convertView;
    }

    public long getItemId(int arg0) {
        // TODO Auto-generated method stub
        return 0;
    }

    public Object getItem(int position) {
        // TODO Auto-generated method stub
        if(position>=listItems.length){
            return listItems[position];
        }else {
            return null;
        }
    }
}
