package com.example.onam.divyahimgiri;

import android.annotation.TargetApi;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewParent;
import android.widget.Toast;


public class MainActivity    extends FragmentActivity implements ActionBar.TabListener{
        ViewPager viewPager=null;

        ActionBar actionBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager=( ViewPager)findViewById(R.id.s1);
        actionBar=getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        ActionBar.Tab tab1=actionBar.newTab();

        tab1.setText("आवरण कथा");
        tab1.setTabListener(this);

        ActionBar.Tab tab2=actionBar.newTab();
        tab2.setText("दो टूक");
        tab2.setTabListener(this);

        ActionBar.Tab tab3=actionBar.newTab();
        tab3.setText("सामयिकी");
        tab3.setTabListener(this);
        ActionBar.Tab tab4=actionBar.newTab();
        tab4.setText("साक्षात्कार");
        tab4.setTabListener(this);
        ActionBar.Tab tab5=actionBar.newTab();
        tab5.setText("स्पेशल स्टोरी");
        tab5.setTabListener(this);
        ActionBar.Tab tab6=actionBar.newTab();
        tab6.setText("शख्सियत");
        tab6.setTabListener(this);
        ActionBar.Tab tab7=actionBar.newTab();
        tab7.setText("खास मुलाक़ात");
        tab7.setTabListener(this);
        ActionBar.Tab tab8=actionBar.newTab();
        tab8.setText("हमसे संपर्क करें");
        tab8.setTabListener(this);
        actionBar.addTab(tab1);
        actionBar.addTab(tab2);
        actionBar.addTab(tab3);
        actionBar.addTab(tab4);
        actionBar.addTab(tab5);
        actionBar.addTab(tab6);
        actionBar.addTab(tab7);
        actionBar.addTab(tab8);




        android.support.v4.app.FragmentManager fragmentManager=getSupportFragmentManager();

        viewPager.setAdapter(new myadapter(fragmentManager));
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
@Override
public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

@Override
public void onPageSelected(int position) {
        actionBar.setSelectedNavigationItem(position);


        }

@Override
public void onPageScrollStateChanged(int state) {

        }
        });


        }



@Override
public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
        // on tab selected
        // show respected fragment view
        viewPager.setCurrentItem(tab.getPosition());
        }
@Override
public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {

        }

@Override
public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

        }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // action with ID action_refresh was selected
            case R.id.action_settings1:
                Intent myIntent = new Intent(this, login.class);
                startActivity(myIntent);

                break;

            default:
                break;
        }

        return true;
    }
    }



class myadapter extends FragmentPagerAdapter
{
    public  myadapter(android.support.v4.app.FragmentManager s)
    {
        super(s);
    }

    @Override
    public android.support.v4.app.Fragment getItem(int i) {
        android.support.v4.app.Fragment fragment=null;
        if(i==0)
        {

            fragment=new fragment1() ;



        }
        else if(i==1)
        {
            fragment=new fragment2() ;


        }
        else
        if(i==2)

        {
            fragment=new fragment3() ;
         }
        else
        if(i==3)

        {
            fragment=new fragment4() ;
        }
        else
        if(i==4)

        {
            fragment=new fragment5() ;
        }
        else
        if(i==5)

        {
            fragment=new fragment6() ;
        }
        else
        if(i==6)

        {
            fragment=new fragment7() ;
        }
        else
        if(i==7)

        {
            fragment=new fragment8() ;
        }



        return fragment;
    }

    @Override
    public int getCount() {
        return 8;
    }



}