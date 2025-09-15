package kendaraan;

import java.util.Date;

public interface IServiceable {
    boolean periksaKondisi();
    void lakukanService();
    Date getServisBerikutnya();
    double hitungBiayaServis();
}