import java.util.ArrayList;

public class Main {
    private static ArrayList<Hewan> daftarHewan = new ArrayList<>();
    //linkedlist addition
    public static void main(String[] args) throws Exception {
        daftarHewan.add(new Hewan("Sapi", "Coklat"));
        daftarHewan.add(new Hewan("Kelinci", "Putih"));
        daftarHewan.add(new Hewan("Kambing", "Hitam"));
        daftarHewan.add(new Hewan("Unta", "Coklat"));
        daftarHewan.add(new Hewan("Domba", "Putih"));

        System.out.print("\nHewan : [ ");
        for(int index = 0; index < daftarHewan.size(); index++) {
            System.out.print(daftarHewan.get(index).getName() + ",");
        }
        System.out.println("]");
        System.out.println(" \n");

        //output hewan yg dihapus
        System.out.print("Hewan yang dihapus : [ ");
        for(int index = 0; index < daftarHewan.size(); index++) {
            if(daftarHewan.get(index).getWarna() == new DeleteHewan("Coklat").getWarna()) {
                System.out.print(daftarHewan.get(index).getName() + ",");
                daftarHewan.remove(index);
            }
        }

        //output hewan yg tersisa dari penghapusan pada data array semula
        System.out.println("]");
        System.out.println("\n");
        System.out.print("Output Hewan : [ ");
        for(int index = 0; index < daftarHewan.size(); index++) {
            System.out.print(daftarHewan.get(index).getName() + ",");
        }
        System.out.println("]");
    }
}