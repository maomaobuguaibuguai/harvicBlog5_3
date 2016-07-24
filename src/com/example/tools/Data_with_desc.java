package com.example.tools;

import android.nfc.Tag;

public class Data_with_desc {
	String names;
	int ids;
	String desc;
	int isDesc ;
	int isvisiable ;
	
	
    public Data_with_desc(String names,int ids,String desc,int isDesc ,int isvisiable){
		this.names=names;
		this.ids=ids;
		this.desc=desc;
		this.isDesc = isDesc;
		this.isvisiable=isvisiable;
	}
	public String getNames() {
		return names;
	}
	public void setNames(String names) {
		this.names = names;
	}
	public int getIds() {
		return ids;
	}
	public void setIds(int ids) {
		this.ids = ids;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
    public int getIsDesc()
    {
        return isDesc;
    }
    public void setIsDesc(int isDesc)
    {
        this.isDesc = isDesc;
    }
    public int getIsvisiable()
    {
        return isvisiable;
    }
    public void setIsvisiable(int isvisiable)
    {
        this.isvisiable = isvisiable;
    }
	
}
