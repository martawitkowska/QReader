package com.test.qreader;

import android.support.annotation.NonNull;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Komputer on 2018-01-31.
 */


public final class Repository {

    private Repository() {
        generatePlants();
    }

    private static Repository repo = new Repository();
    private Map<String, Plant> QRplants = new HashMap();

    public static Map<String, Plant> getPlants() {
        return repo.QRplants;
    }

    private void generatePlants() {
        Plant plant = new Plant(1, "Parrotia persica", "Persian ironwood", "Parrotia persica", R.drawable.parrotia_persica);
        QRplants.put(plant.QRkey, plant);
        plant = new Plant(2, "Matteuccia", "Matteuccia orientalis", "Matteuccia", R.drawable.matteucia);
        QRplants.put(plant.QRkey, plant);
        plant = new Plant(3, "Primula", "Primula elatior", "Crescendo Red", R.drawable.primula);
        QRplants.put(plant.QRkey, plant);
        plant = new Plant(4, "Pieris", "Pieris japonica", "Mountain Fire", R.drawable.pieris);
        QRplants.put(plant.QRkey, plant);
    }
}

