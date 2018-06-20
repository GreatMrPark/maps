package com.greatmrpark.maps.cube.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.greatmrpark.maps.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;


import com.greatmrpark.maps.cube.model.Cube;

public class CubeAdapter extends BaseAdapter {

    private final List mData;

    public CubeAdapter(List data) {
        mData = data;
    }

    // 아이템 개수
    @Override
    public int getCount() {
        return mData.size();
    }

    // position 번째의 아이템
    @Override
    public Object getItem(int position) {
        return mData.get(position);
    }

    // position 번재의 아이디
    @Override
    public long getItemId(int position) {
        return position;
    }

    // position 번째의 아이템의 View 를 구성하는 부분
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            holder = new ViewHolder();
            convertView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_cube, parent, false);

            // CUBE 정보 View
            TextView cubeNameTextView = itemView.findViewById(R.id.cubeNameTextView);
            ImageView cubePhotoImageView = itemView.findViewById(R.id.cubePhotoImageView);
            TextView cubeDescribeTextView = itemView.findViewById(R.id.cubeDescribeTextView);
            CircleImageView cubeIconImageView = itemView.findViewById(R.id.cubeIconImageView);

            holder.cubeNameText      = cubeNameTextView;
            holder.cubePhotoImage    = cubePhotoImageView;
            holder.cubeDescribeText  = cubeDescribeTextView;
            holder.cubeIconImage     = cubeIconImageView;

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }


        // 현재 position 의 날씨 데이터
        Cube cube = mData.get(position);

        // 데이터 설정 => 홀더에 저장
        holder.cubeNameText.setText(cube.getName());
        holder.cubePhotoImage.setImageResource(cube.getPhoto_reference());
        holder.cubeDescribeText.setText(cube.getDescribe());
        holder.cubeIconImage.setImageResource(cube.getIcon());

        return convertView;
    }

    static class ViewHolder {
        TextView cubeNameText;
        ImageView cubePhotoImage;
        TextView cubeDescribeText;
        ImageView cubeIconImage;
    }


}
