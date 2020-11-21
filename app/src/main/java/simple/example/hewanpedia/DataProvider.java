package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Anjing;
import simple.example.hewanpedia.model.Hewan;
import simple.example.hewanpedia.model.Kucing;
import simple.example.hewanpedia.model.Kelinci;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Kucing> initDataKucing(Context ctx) {
        List<Kucing> kucings = new ArrayList<>();
        kucings.add(new Kucing("Angora", "Turki",
                "Aslinya berasal dari Ankara, Turki dengan ciri khas berbulu panjang dan lembut", R.drawable.cat_angora));
        kucings.add(new Kucing("Bengal", "Inggris",
                "Merupakan hasil persilangan antara Kucing Leopard Asia dengan kucing domestik Inggris", R.drawable.cat_bengal));
        kucings.add(new Kucing("Birmani", "Birma/Myanmar",
                "Konon awalnya merupakan ras kucing yand biasa menemani para biksu yang menetap pada kuil di Birma", R.drawable.cat_birman));
        kucings.add(new Kucing("Persia", "Iran",
                "Kucing berbulu panjang dengan wajah bundar dan hidung pesek. Awalnya berasal dari Iran kemudian diimpor ke Italia", R.drawable.cat_persia));
        kucings.add(new Kucing("Siam", "Thailand",
                "Kucing hasil turunan dari Wichian Maat (Kucing Thailand) dengan ciri khas berbadan panjang dan langsing, wajah lonjong, telinga lebar, dan mata kebiruan", R.drawable.cat_siam));
        kucings.add(new Kucing("Siberia", "Rusia",
                "Kucing domestik Rusia dengan bulu lebat dan badan besar tapi sangat lincah dan terkenal dengan kemampuan melompatnya ", R.drawable.cat_siberian));
        return kucings;
    }

    private static List<Anjing> initDataAnjing(Context ctx) {
        List<Anjing> anjings = new ArrayList<>();
        anjings.add(new Anjing("Bulldog", "Inggris",
                "Anjing populer yang dikenal dengan badan yang gemuk berotot, wajah seperti kain kusut, dan hidung yang pesek", R.drawable.dog_bulldog));
        anjings.add(new Anjing("Husky", "Alaska,Siberia,Finlandia (daerah bersalju) ",
                "Anjing jenis khusus yang awalnya digunakan untuk menarik kereta salju", R.drawable.dog_husky));
        anjings.add(new Anjing("Kintamani", "Indonesia",
                "Ras anjing asli pulau Bali ", R.drawable.dog_kintamani));
        anjings.add(new Anjing("Samoyed", "Rusia",
                "Anjing yang berasal dari Siberia yang awalnya biasa digunakan untuk menjaga ternak oleh suku Samoyed", R.drawable.dog_samoyed));
        anjings.add(new Anjing("Shepherd", "Jerman",
                "Anjing pintar dan kuat, sekarang banyak digunakan sebagai anjing penjaga, pengawal, dan anjing polisi (K9)", R.drawable.dog_shepherd));
        anjings.add(new Anjing("Shiba", "Jepang",
                "Anjing dari daerah Shiba ini gesit dan lincah sehingga awalnya banyak digunakan untuk berburu ", R.drawable.dog_shiba));
        return anjings;
    }
    private static List<Kelinci> initDataKelinci(Context ctx) {
        List<Kelinci> kelincis = new ArrayList<>();
        kelincis.add(new Kelinci("Jersey wooly", "Netherland/prancis",
                "Kepribadiannya sangat ramah dan tergolong hewan peliharaan yang kalem", R.drawable.jersey_wooly));
        kelincis.add(new Kelinci("dwarf", "Belanda",
                "kelinci Dwarf merupakan kelinci yang memiliki tubuh kerdil. Bentuk kepalanya yang bulat, telinga kecil, dan lehernya yang pendek menjadi ciri-ciri utama dari jenis kelinci Dwarf.", R.drawable.kelinci_dwarf));
        kelincis.add(new Kelinci("Holland hop", "Belanda",
                "Kelinci ini adalah kelinci pertunjukkan yang populer. Trahnya berasal dari Belanda dan telah diakui secara resmi oleh American Rabbit Breeders Association pada tahun 1979. Mereka tergolong ke kelinci berukuran mini dengan berat kurang lebih 1 kg", R.drawable.kelinci_holland_hop));
        kelincis.add(new Kelinci("Mini lop", "Jerman",
                "Mini Lop juga sangat ramah terhadap kelinci atau hewan lainnya, tapi mereka cenderung lebih menyukai anak-anak yang tidak terlalu aktif", R.drawable.kelinci_mini_lop));
        kelincis.add(new Kelinci("polish", "Belanda",
                "Jenis kelinci Polish mampu bertahan hidup hingga 7 tahun, bahkan lebih. Kelinci ini memiliki ciri-ciri telinganya yang pendek bulat runcing, matanya yang tajam berwarna merah, dan bulunya halus.", R.drawable.kelinci_polish));
        kelincis.add(new Kelinci("Tan", "Braillsford",
                "Jenis kelinci tan memiliki warna yang sangat bagus, yaitu perpaduan antara warna hitam dan coklat. Dan dari segi harga, jenis kelinci ini tidak terlalu mahal", R.drawable.kelinci_tan));
        return kelincis;
    }

        private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataKucing(ctx));
        hewans.addAll(initDataAnjing(ctx));
        hewans.addAll(initDataKelinci(ctx));

    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}
