package com.company;

public class Po {
    private String nip;
    private String nama;
    private String divisi;

    public Po(String nip, String nama, String divisi) {
        this.nip = nip;
        this.nama = nama;
        this.divisi = divisi;
    }

    public String getNip() {
        return nip;
    }

    @Override
    public String toString() {
        return	"Po {nip='" + nip + '\'' +
                ", nama='" + nama + '\''
                + ", divisi='" + divisi + '\'' + "}" ;
    }
}