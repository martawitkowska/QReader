package com.test.qreader;

/**
 * Created by Komputer on 2018-01-31.
 */

public class Plant {

    int id;
    String QRkey;
    String latinName;
    String englishName;
    int photoResource;

    public Plant(int id, String QRkey, String englishName, int photoResource) {
        this.id = id;
        this.QRkey = QRkey;
        this.englishName = englishName;
        this.photoResource = photoResource;
    }

    public Plant(int id, String QRkey, String latinName, String englishName, int photoResource) {
        this.id = id;
        this.QRkey = QRkey;
        this.latinName = latinName;
        this.englishName = englishName;
        this.photoResource = photoResource;
    }

}
