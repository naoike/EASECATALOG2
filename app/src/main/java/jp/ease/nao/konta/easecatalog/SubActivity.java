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
import android.widget.ActionMenuView;
import android.widget.TextView;


public class SubActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Intent intent = getIntent();
        String category = intent.getStringExtra("category");
        setTitle(category);


            if(category.toString().equals("ベッド")){
                TextView textView1 = (TextView) findViewById(R.id.TextView1);
                textView1.setText("ベッドの画像");

            }else if(category.toString().equals("チェア")){
                TextView textView1 = (TextView) findViewById(R.id.TextView1);
                textView1.setText("チェアの画像");

            }else if(category.toString().equals("デスク")){
                TextView textView1 = (TextView) findViewById(R.id.TextView1);
                textView1.setText("デスクの画像");

            }else if(category.toString().equals("ライト")){
                TextView textView1 = (TextView) findViewById(R.id.TextView1);
                textView1.setText("ライトの画像");

            }else if(category.toString().equals("シェルフ")){
                TextView textView1 = (TextView) findViewById(R.id.TextView1);
                textView1.setText("シェルフの画像");

            }else if(category.toString().equals("ラグ")){
                TextView textView1 = (TextView) findViewById(R.id.TextView1);
                textView1.setText("ラグの画像");

            }else if(category.toString().equals("ドレッサー")){
                TextView textView1 = (TextView) findViewById(R.id.TextView1);
                textView1.setText("ドレッサーの画像");

            }else if(category.toString().equals("ソファ")){
                TextView textView1 = (TextView) findViewById(R.id.TextView1);
                textView1.setText("ソファの画像");

            }else if(category.toString().equals("ドア・窓・パーティション")){
                TextView textView1 = (TextView) findViewById(R.id.TextView1);
                textView1.setText("ドア・窓・パーティションの画像");

            }else if(category.toString().equals("ラック")){
                TextView textView1 = (TextView) findViewById(R.id.TextView1);
                textView1.setText("ラックの画像");

            }else if(category.toString().equals("ミラー")){
                TextView textView1 = (TextView) findViewById(R.id.TextView1);
                textView1.setText("ミラーの画像");

            }else if(category.toString().equals("その他")){
                TextView textView1 = (TextView) findViewById(R.id.TextView1);
                textView1.setText("その他の画像");

            }











    }
}
