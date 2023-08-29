package com.example.localfoodoasis;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private List<ItemData> mDataList;

    // 어댑터 생성자
    public MyAdapter(List<ItemData> list) {
        this.mDataList = list;
    }

    // 뷰홀더 정의
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView price, maker, address, day, number;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageViewRounded);
            price = itemView.findViewById(R.id.price);
            maker = itemView.findViewById(R.id.maker);
            address = itemView.findViewById(R.id.address);
            day = itemView.findViewById(R.id.day);
            number = itemView.findViewById(R.id.number);
        }
    }

    // 새로운 뷰 홀더 생성
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.my_list_view, parent, false);
        return new ViewHolder(v);
    }

    // 뷰 홀더에 데이터 바인딩
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ItemData item = mDataList.get(position);
        holder.imageView.setImageResource(item.imageRes);
        holder.price.setText(item.price);
        holder.maker.setText(item.maker);
        holder.address.setText(item.address);
        holder.day.setText(item.day);
        holder.number.setText(item.number);
    }

    // 데이터 항목의 개수 반환
    @Override
    public int getItemCount() {
        return mDataList.size();
    }




    public static class ItemData {
        private String price;
        private String maker;
        private String address;
        private String day;
        private String number;
        private int imageRes;

        // 생성자
        public ItemData(String price, String maker, String address, String day, String number, int imageRes) {
            this.price = price;
            this.maker = maker;
            this.address = address;
            this.day = day;
            this.number = number;
            this.imageRes = imageRes;
        }

    }





}


