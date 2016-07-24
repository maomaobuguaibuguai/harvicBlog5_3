package com.example.fragment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.harvicblog5_3.R;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

public class WeixinFragment extends Fragment
{
    private String[] names = new String[]{
            "张三","李四","王凯","阿福",
            "小矮个","安安","小白","小花",
            "小程","Andy","Cindy","天天",
            "小张","小袁","莉莉","Lily",
            "honey","darling","ancle","Lucy"
    };
    private int imageids[] = {
            R.drawable.item1, R.drawable.item2, R.drawable.item3, R.drawable.item4,
            R.drawable.item5, R.drawable.item6, R.drawable.item7, R.drawable.item8,
            R.drawable.item9, R.drawable.item10, R.drawable.item11, R.drawable.item12,
            R.drawable.item13, R.drawable.item14,R.drawable.item15, R.drawable.item16,
            R.drawable.item17, R.drawable.item18,R.drawable.item19, R.drawable.item20};
    private String[] desc = new String[]{
            "woshixiaozhangzhang","ali","wuli王凯","阿福haoren",
            "aiyo小矮个","安安nihao","小白baiyoubai","小花bueati",
            "小程aha","Andyhaore","Cindyande","天天ddd",
            "小张afe","小袁afe","莉莉dfa","Lilydfadf",
            "honeyadfadf","darlingadfaf","ancleadfaf","Lucyeqrerq"
    };

    private ListView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.weixin_fragment, container, false);
    }

    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);

        listView = (ListView) getView().findViewById(R.id.weixin_fragemt);// 获取自己视图里的控件引用,方法二

        List<Map<String, Object>> listItems = new ArrayList<Map<String, Object>>();
        for (int i = 0; i < names.length; i++)
        {
            Map<String, Object> listItem = new HashMap<String, Object>();
            listItem.put("header", imageids[i]);
            listItem.put("PersonNames", names[i]);
            listItem.put("descs", desc[i]);
            listItems.add(listItem);
        }
        SimpleAdapter simpleAdapter = new SimpleAdapter(getActivity(), listItems, R.layout.weixin_item, new String[]
        { "PersonNames", "header" ,"descs"}, new int[]
        { R.id.weixin_name, R.id.weixin_header ,R.id.weixin_describe});

        listView.setAdapter(simpleAdapter);
    }

    /*
     * @Override public void onActivityCreated(Bundle savedInstanceState) {
     * super.onActivityCreated(savedInstanceState); mTv = (TextView)
     * getView().findViewById(R.id.fragment2_tv); }
     * 
     * public void setText(String text) { mTv.setText(text); }
     */
}
