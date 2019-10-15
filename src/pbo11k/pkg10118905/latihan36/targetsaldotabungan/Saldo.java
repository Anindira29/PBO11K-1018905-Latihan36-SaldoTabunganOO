/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118905.latihan36.targetsaldotabungan;

/**
 *
 * @author Fitri
 * Nama     : Anindira Dina Fitriani
 * Kelas    : IF11-K
 * Nim      : 10118905
 * Deskripsi: Program target saldo tabungan
 */
public class Saldo {
    private int saldoAwal;
    private int saldo;
    private double bunga;
    private int targetSaldo;
    private int i;
    
    private int hitungBunga(int parSaldoAwal, double parBunga){
        return (int)((int)parSaldoAwal * parBunga);
    }
    public void hitungSaldo(int parSaldoAwal, double parBunga,  int parTargetSaldo){
        saldoAwal = parSaldoAwal;
        bunga = parBunga;
        saldo = saldoAwal;
        targetSaldo = parTargetSaldo;
        i = 1;
        do{
            saldo = saldo + hitungBunga(saldo,bunga);
            System.out.printf("Saldo di buan ke-" +i+" Rp.%,10d%n",saldo);
            i++;
        }while (saldo < targetSaldo);
        }
    }