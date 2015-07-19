package com.example.onam.divyahimgiri;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;



/**
 * Created by onam on 2/15/2015.
 */
public class fragment3 extends Fragment {
    Intent myIntent;
    ListView l2;
    String[] tit;


    int[] images={R.drawable.c1,R.drawable.c2,R.drawable.c3,R.drawable.c4,
            R.drawable.c5,R.drawable.c6,R.drawable.c7,R.drawable.c8};
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root1=inflater.inflate(R.layout.f1, container, false);
        l2=(ListView) root1.findViewById(R.id.listView);
        Resources rs=getResources();
        tit=rs.getStringArray(R.array.descc);

        myadapter3 adapter=new myadapter3(getActivity(),tit,images);
        l2.setAdapter(adapter);
        l2.setOnItemClickListener(new AdapterView.OnItemClickListener(


        ) {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0)
                {
                    myIntent = new Intent(getActivity(), c1.class);
                    startActivity(myIntent);

                }
                else
                if(position==1)
                {
                    myIntent = new Intent(getActivity(), c2.class);
                    startActivity(myIntent);
                }
                else
                if(position==2)
                {
                    myIntent = new Intent(getActivity(), c3.class);
                    startActivity(myIntent);
                }
                else
                if(position==3)
                {
                    myIntent = new Intent(getActivity(), c4.class);
                    startActivity(myIntent);
                }
                else
                if(position==4)
                {
                    myIntent = new Intent(getActivity(), c5.class);
                    startActivity(myIntent);
                }
                else
                if(position==5)
                {
                    myIntent = new Intent(getActivity(), c6.class);
                    startActivity(myIntent);
                }
                else
                if(position==6)
                {
                    myIntent = new Intent(getActivity(), c7.class);
                    startActivity(myIntent);
                }

                else
                if(position==7)
                {
                    myIntent = new Intent(getActivity(), c8.class);
                    startActivity(myIntent);
                }


            }
        });



        return root1;

    }
}
class myadapter3 extends ArrayAdapter<String>
{
    Context c1;
    int[]  images;
    String[] tite;

    myadapter3(Context c,String[] tit,int[] img)
    {
        super(c,R.layout.singlerow,R.id.textView,tit);
        this.c1=c;
        this.images=img;
        this.tite=tit;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater= (LayoutInflater) c1.getSystemService (c1.LAYOUT_INFLATER_SERVICE);
        View row=inflater.inflate(R.layout.singlerow1,parent,false);
        ImageView i1=(ImageView) row.findViewById(R.id.imageView);
        TextView t1=(TextView) row.findViewById(R.id.textView3);

        i1.setImageResource(images[position]);
        t1.setText(tite[position]);

        return row;
    }
}
