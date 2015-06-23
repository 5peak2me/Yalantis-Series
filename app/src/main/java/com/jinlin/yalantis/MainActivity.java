package com.jinlin.yalantis;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.yalantis.contextmenu.sample.ContextMenuActivity;
import com.yalantis.euclid.sample.EuclidActivity;
import com.yalantis.flipviewpager.sample.activity.FriendsActivity;
import com.yalantis.guillotine.sample.activity.GuillotineMenuActivity;
import com.yalantis.phoenix.sample.PhoenixPullToRefreshActivity;
import com.yalantis.sidemenu.sample.SideActivity;
import com.yalantis.taurus.sanple.TaurusPullToRefreshActivity;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void click1(View view) {
        startActivity(new Intent(this, PhoenixPullToRefreshActivity.class));
    }

    public void click2(View view) {
        startActivity(new Intent(this, TaurusPullToRefreshActivity.class));
    }

    public void click3(View view) {
        startActivity(new Intent(this, FriendsActivity.class));
    }

    public void click4(View view) {
        startActivity(new Intent(this, SideActivity.class));
    }

    public void click5(View view) {
        startActivity(new Intent(this, ContextMenuActivity.class));
    }

    public void click6(View view) {
        startActivity(new Intent(this, EuclidActivity.class));
    }

    public void click7(View view) {
        startActivity(new Intent(this, GuillotineMenuActivity.class));
    }
}
