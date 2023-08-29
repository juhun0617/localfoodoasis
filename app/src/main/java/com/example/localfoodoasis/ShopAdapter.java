package com.example.localfoodoasis;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ShopAdapter extends RecyclerView.Adapter<ShopAdapter.ShopViewHolder> {
    private List<ShopItem> shopItems;
    private Context context;

    public ShopAdapter(Context context, List<ShopItem> shopItems) {
        this.context = context;
        this.shopItems = shopItems;
    }

    @NonNull
    @Override
    public ShopViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.shoplist, parent, false);
        return new ShopViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ShopViewHolder holder, int position) {
        ShopItem shopItem = shopItems.get(position);
        holder.shopName.setText(shopItem.getShopName());
        holder.shopLocation.setText(shopItem.getShopLocation());

        if(shopItem.isFavorited()) {
            holder.starImage.setImageResource(R.drawable.fullstar);
        } else {
            holder.starImage.setImageResource(R.drawable.emptystar);
        }
    }

    @Override
    public int getItemCount() {
        return shopItems.size();
    }

    public class ShopViewHolder extends RecyclerView.ViewHolder {
        TextView shopName;
        TextView shopLocation;
        ImageView starImage;

        public ShopViewHolder(@NonNull View itemView) {
            super(itemView);
            shopName = itemView.findViewById(R.id.shop_name);
            shopLocation = itemView.findViewById(R.id.shop_location);
            starImage = itemView.findViewById(R.id.starview); // ImageView의 ID를 지정해주세요.
        }
    }
}

