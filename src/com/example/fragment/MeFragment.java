package com.example.fragment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.adapter.MeAdapter;
import com.example.harvicblog5_3.R;
import com.example.tools.Const;
import com.example.tools.Data_with_desc;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

public class MeFragment extends Fragment
{  
    Const myConst = new Const();
    
    private ListView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.me_fragment, container, false);
    }

    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);

        listView = (ListView) getView().findViewById(R.id.me_fragment);// 获取自己视图里的控件引用,方法二

        List<Data_with_desc> listItems = new ArrayList<Data_with_desc>();
        listItems.add(new Data_with_desc("猫猫不乖", R.drawable.me_header, "微信号：JINGER", myConst.WITH_DESC, myConst.VISIABLE));
        MeAdapter meAdapter = new MeAdapter(listItems,getActivity());

        listView.setAdapter(meAdapter);
    }

    /*
     * @Override public void onActivityCreated(Bundle savedInstanceState) {
     * super.onActivityCreated(savedInstanceState); mTv = (TextView)
     * getView().findViewById(R.id.fragment2_tv); }
     * 
     * public void setText(String text) { mTv.setText(text); }
     */
}
