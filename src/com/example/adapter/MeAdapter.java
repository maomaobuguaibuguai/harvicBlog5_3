package com.example.adapter;

import java.util.List;

import com.example.harvicblog5_3.R;
import com.example.tools.Const;
import com.example.tools.Data_with_desc;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MeAdapter extends BaseAdapter
{
    List<Data_with_desc> list;
    Context context;
    Data_with_desc MyData_with_desc ;
    Const myConst;

    public MeAdapter(List<Data_with_desc> list, Context context)
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
        if(tempData.getIsDesc()==myConst.WITH_DESC){
            if (convertView == null)
            {
                convertView = View.inflate(context, R.layout.with_descrip_item, null);
                viewHolder_WITH_DESC = new ViewHolder_WITH_DESC();
                viewHolder_WITH_DESC.tv_name = (TextView) convertView.findViewById(R.id.with_descrip_name);
                viewHolder_WITH_DESC.iv_head = (ImageView) convertView.findViewById(R.id.with_descrip_header);
                viewHolder_WITH_DESC.tv_desc = (TextView) convertView.findViewById(R.id.with_descrip_message);
                convertView.setTag(viewHolder_WITH_DESC);
            } else
            {
                viewHolder_WITH_DESC = (ViewHolder_WITH_DESC) convertView.getTag();
            }
    
            viewHolder_WITH_DESC.tv_name.setText(tempData.getNames());
            viewHolder_WITH_DESC.iv_head.setImageResource(tempData.getIds());
            viewHolder_WITH_DESC.tv_desc.setText(tempData.getDesc());
        }else if(tempData.getIsDesc()==myConst.WITH_DESC){
            if (convertView == null)
            {
                convertView = View.inflate(context, R.layout.without_descrip_item, null);
                viewHolder_WITH_DESC = new ViewHolder_WITH_DESC();
                viewHolder_WITH_DESC.tv_name = (TextView) convertView.findViewById(R.id.without_descrip_name);
                viewHolder_WITH_DESC.iv_head = (ImageView) convertView.findViewById(R.id.without_descrip_header);
                convertView.setTag(viewHolder_WITH_DESC);
            } else
            {
                viewHolder_WITH_DESC = (ViewHolder_WITH_DESC) convertView.getTag();
            }
    
            viewHolder_WITH_DESC.tv_name.setText(tempData.getNames());
            viewHolder_WITH_DESC.iv_head.setImageResource(tempData.getIds());
        }
        
        return convertView;
    }

    class ViewHolder_WITH_DESC
    {
        TextView tv_name;
        TextView tv_desc;
        ImageView iv_head;
    }

}
