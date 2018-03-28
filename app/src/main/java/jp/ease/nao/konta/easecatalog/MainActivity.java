package jp.ease.nao.konta.easecatalog;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity  {



    private String members[] = {
            "bed", "chair", "desk", "illumination", "shelf",
            "rug", "dresser", "sofa", "door","rack","mirror","other"
    };



    // Resource IDを格納するarray
    private List<Integer> imgList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        // for-each member名をR.drawable.名前としてintに変換してarrayに登録
        for (String member : members) {
            int imageId = getResources().getIdentifier(
                    member, "drawable", getPackageName());
            imgList.add(imageId);
        }



        // GridViewのインスタンスを生成
        GridView gridview = findViewById(R.id.gridview);
        // BaseAdapter を継承したGridAdapterのインスタンスを生成
        // 子要素のレイアウトファイル grid_items.xml を
        // activity_main.xml に inflate するためにGridAdapterに引数として渡す
        GridAdapter adapter = new GridAdapter(this.getApplicationContext(),
                R.layout.grid_items,
                imgList,
                members
        );

        // gridViewにadapterをセット
        gridview.setAdapter(adapter);


        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick (AdapterView parent, View v,int position, long id){
                Intent intent = new Intent(getApplication(),SubActivity.class);
                startActivity( intent );


            }
        });
    }}