package com.example.adapter;

import java.util.List;

import com.example.harvicblog5_3.R;
import com.example.tools.Data_with_desc;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Adapter extends BaseAdapter
{
    List<Data_with_desc> list;
    Context context;

    public Adapter(List<Data_with_desc> list, Context context)
    {
        // TODO Auto-generated constructor stub
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount()
    {
        // TODO Auto-generated method stub
        return list.size();
    }

    @Override
    public Object getItem(int position)
    {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public long getItemId(int position)
    {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        // TODO Auto-generated method stub
        Data_with_desc tempData = list.get(position);
        ViewHolder_WITH_DESC viewHolder_WITH_DESC = null;
        if (convertView == null)
        {
            convertView = View.inflate(context, R.layout.discover_header_item, null);
            viewHolder_WITH_DESC = new ViewHolder_WITH_DESC();
            viewHolder_WITH_DESC.tv_name = (TextView) convertView.findViewById(R.id.discover_describe_with_desc);
            viewHolder_WITH_DESC.iv_head = (ImageView) convertView.findViewById(R.id.discover_header_with_desc);
            viewHolder_WITH_DESC.tv_desc = (TextView) convertView.findViewById(R.id.discover_name_with_desc);
            convertView.setTag(viewHolder_WITH_DESC);
        } else
        {
            viewHolder_WITH_DESC = (ViewHolder_WITH_DESC) convertView.getTag();
        }

        viewHolder_WITH_DESC.tv_name.setText(tempData.getNames());
        viewHolder_WITH_DESC.iv_head.setImageResource(tempData.getIds());
        viewHolder_WITH_DESC.tv_desc.setText(tempData.getDesc());
        
        return convertView;
    }

    class ViewHolder_WITH_DESC
    {
        TextView tv_name;
        TextView tv_desc;
        ImageView iv_head;
    }

}
