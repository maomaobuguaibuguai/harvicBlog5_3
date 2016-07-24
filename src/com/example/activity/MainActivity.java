package com.example.activity;

import com.example.fragment.ContactFragment;
import com.example.fragment.DiscoverFragment;
import com.example.fragment.MeFragment;
import com.example.fragment.WeixinFragment;
//import com.example.fragment.MeFragment;
//import com.example.fragment.WeixinFragment;
import com.example.harvicblog5_3.R;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class MainActivity extends Activity
{
    private DiscoverFragment discoverFragment;
    private ContactFragment contactFragment;
    private MeFragment meFragment;
    private WeixinFragment weixinFragment;
    private RadioGroup radioGroup;
    

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        radioGroup =(RadioGroup) findViewById(R.id.group);
        radioGroup.setOnCheckedChangeListener(listenerRadioGroup);
     // 设置默认的Fragment  
        setDefaultFragment(); 

    }
    private void setDefaultFragment()  
    {  
        FragmentManager fm = getFragmentManager();  
        FragmentTransaction transaction = fm.beginTransaction();  
        discoverFragment = new DiscoverFragment();  
        transaction.add(R.id.id_content, discoverFragment);  
        transaction.commit();  
    } 
    /*private void switchFragment(Fragment fragment) {
        if (fragment != mTempFragment) {
            if (!fragment.isAdded()) {
                getFragmentManager().beginTransaction().hide(mTempFragment)
                        .add(R.id.fragment1, fragment).commit();
            } else {
                getFragmentManager().beginTransaction().hide(mTempFragment)
                        .show(fragment).commit();
            }
            mTempFragment = fragment;
        }
    }*/
    private OnCheckedChangeListener listenerRadioGroup = new OnCheckedChangeListener(){

        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId)
        {
            FragmentManager fm = getFragmentManager();  
            // 开启Fragment事务  
            FragmentTransaction transaction = fm.beginTransaction();  
            // TODO Auto-generated method stub
            switch(checkedId){
                case R.id.button_discover:
                    if (discoverFragment == null)  
                    {  
                        discoverFragment = new DiscoverFragment();  
                    }  
                    // 使用当前Fragment的布局替代id_content的控件  
                    transaction.replace(R.id.id_content, discoverFragment);  
                    break;
                case R.id.button_contact:
                    if (contactFragment == null)  
                    {  
                        contactFragment = new ContactFragment();  
                    }  
                    transaction.replace(R.id.id_content, contactFragment);    
                    break;
                case R.id.button_me:
                    if (meFragment == null)  
                    {  
                        meFragment = new MeFragment();  
                    } 
                    transaction.replace(R.id.id_content, meFragment);
                    break;
                case R.id.button_weixin:
                    if (weixinFragment == null)  
                    {  
                        weixinFragment = new WeixinFragment();  
                    } 
                    transaction.replace(R.id.id_content, weixinFragment);
                    break;
                    
            }
            transaction.commit();
        }
        
    };
    /*
     * private OnClickListener buttonlistener1 = new OnClickListener(){
     * 
     * @Override public void onClick(View v) { FragmentManager fm =
     * getFragmentManager(); // 开启Fragment事务 FragmentTransaction transaction =
     * fm.beginTransaction(); if (fragment1 == null) { fragment1 = new
     * Fragment1(); transaction.add(R.id.fragment1, fragment1); }else{ //
     * 使用当前Fragment的布局替代id_content的控件 transaction.show(fragment1); } // 事务提交
     * transaction.commit(); }};
     */

    /*
     * @Override public void onTitleSelect(String title) { FragmentManager
     * manager = getFragmentManager(); Fragment2 fragment2 =
     * (Fragment2)manager.findFragmentById(R.id.fragment2);
     * fragment2.setText(title); }
     */
}
