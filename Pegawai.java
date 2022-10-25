/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumInheritance;

/**
 *
 * @author Kii
 */
public class Pegawai {

    private String nama;
    public double gaji;

    public class Manajer extends Pegawai {

        public String departemen;

        public void IsiData(String n, String d) {
            nama = n;
            departemen = d;
        }
    }
}
