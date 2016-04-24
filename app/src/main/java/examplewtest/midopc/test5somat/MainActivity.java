package examplewtest.midopc.test5somat;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.List;

import examplewtest.midopc.test5somat.API.Generator;
import examplewtest.midopc.test5somat.API.KSomatAPI;
import examplewtest.midopc.test5somat.API.Model.Shop;
import examplewtest.midopc.test5somat.Adapters.MainListADB;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private RecyclerView list;
    private MainListADB adb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Generator.createService(KSomatAPI.class).getShops("Get_Shop").enqueue(new Callback<List<Shop>>() {
            @Override
            public void onResponse(Call<List<Shop>> call, Response<List<Shop>> response) {


                if (response.isSuccessful()) {

                    list = (RecyclerView) findViewById(R.id.list);
                    adb = new MainListADB(response.body(), getApplicationContext());
                    list.setAdapter(adb);
                    list.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));


                    Log.d("WOOOOOOWWOOWOWO", response.body().get(1).getName().toString());
                } else {
                    Log.d("WOOOOOOWWOOWOWO", "nooooooooooooooooooooooooooooo");
                }
            }

            @Override
            public void onFailure(Call<List<Shop>> call, Throwable t) {

                Log.d("noooooooooooooooooo", "E000rrrrrrrrrrrrrrrrrrrrr");

            }
        });

















        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



























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
}
