package com.example.localfoodoasis;

public class ShopItem {
    private String shopName;
    private String shopLocation;
    private boolean isFavorited;  // 찜 목록에 있는지를 나타내는 boolean 값

    // 생성자
    public ShopItem(String shopName, String shopLocation, boolean isFavorited) {
        this.shopName = shopName;
        this.shopLocation = shopLocation;
        this.isFavorited = isFavorited;
    }

    // Getter
    public String getShopName() {
        return shopName;
    }

    public String getShopLocation() {
        return shopLocation;
    }

    public boolean isFavorited() {
        return isFavorited;
    }

    // Setter
    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public void setShopLocation(String shopLocation) {
        this.shopLocation = shopLocation;
    }

    public void setFavorited(boolean favorited) {
        isFavorited = favorited;
    }
}
