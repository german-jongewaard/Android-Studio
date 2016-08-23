package com.example.mislugares;

/**
 * Created by german on 8-8-16.
 */
public class GeoPunto {

    private double longitud, latitud;

    public GeoPunto(double longitud, double latitud){

        this.longitud = longitud;
        this.latitud = latitud;
    }

    public String toString(){

        return new String("longitud:" + longitud + ", latitud:" + latitud);

    }

    public double distancia(GeoPunto punto){

        final  double RADIO_TIERRA = 6371000;//en metros
        double dlat = Math.toRadians(latitud - punto.latitud);
        double dlon = Math.toRadians(longitud - punto.longitud);
        double lat1 = Math.toRadians(punto.latitud);
        double lat2 = Math.toRadians(latitud);
        double a = Math.sin(dlat/2) * Math.sin(dlat/2) +
                Math.sin(dlon/2) * Math.sin(dlon/2) *
                        Math.cos(lat1) * Math.cos(lat2);

        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        return c * RADIO_TIERRA;

    }

    public double getLongitud() {
        return longitud;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }
}

