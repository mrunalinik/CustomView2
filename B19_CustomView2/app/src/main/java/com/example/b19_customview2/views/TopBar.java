package com.example.b19_customview2.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.b19_customview2.R;

/**
 * Created by chethan on 12/7/2015.
 */
public class TopBar extends RelativeLayout{

    private TextView titleTv;
    private Button loginBtn;

    public TopBar(Context context) {
        super(context);
        init();
    }

    public TopBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public TopBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }


    private void init(){

        LayoutInflater inflater = LayoutInflater.from(getContext());
      //  inflater.inflate(R.layout.top_bar_layout, TopBar.this, true);

        View view = inflater.inflate(R.layout.top_bar_layout, null);
        addView(view);

        titleTv = (TextView) findViewById(R.id.titleTv);
        loginBtn = (Button) findViewById(R.id.loginBtn);
    }

    /**
     * Sets the title on the TopBar
     * @param titleString set this String on the top bar
     */
    public void setTitle(String titleString){
        if(titleString != null && titleString.length() >0)
            titleTv.setText(titleString);
    }

    public void setLoginListener(View.OnClickListener clickListener){
        loginBtn.setOnClickListener(clickListener);
    }


}
