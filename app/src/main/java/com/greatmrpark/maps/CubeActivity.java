package com.greatmrpark.maps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.greatmrpark.maps.cube.adapter.CubeAdapter;
import com.greatmrpark.maps.cube.model.Cube;

import java.util.ArrayList;

public class CubeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cube);
        setTitle(R.string.nav_cube);

        ArrayList<Cube> cubeData = new ArrayList<>();
        cubeData.add(new Cube("1"
            , "https://maps.gstatic.com/mapfiles/place_api/icons/generic_business-71.png"
            ,"동대문디자인플라자 ('어울림광장')"
            ,"서울 중구 을지로 281"
            ,"동대문디자인플라자 어울림광장 내부 인포메이션"
            ,"http://limplanet.vbweb.kr/23/?q=YToxOntzOjEyOiJrZXl3b3JkX3R5cGUiO3M6MzoiYWxsIjt9&bmode=view&idx=667324&t=board"
            ,127.0103381
            ,37.5682138
            ,"https://cdn.imweb.me/thumbnail/20180531/5b0f5af5aa3a3.jpg"));

        // 어댑터
        CubeAdapter cubeAdapter = new CubeAdapter(cubeData);

        // 뷰
        ListView cubeListView = (ListView) findViewById(R.id.cube_list_view);
        cubeListView.setAdapter(cubeAdapter);
    }
}
