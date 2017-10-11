import java.util.Scanner;
public class Gaji
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        
        System.out.print("masukkan nama pekerja:");
        String nama=input.next();
        
        System.out.print("masukkan bilangan jam bekerja sehari:");
        int jam=input.nextInt();
        if(jam >9)
        {
            System.out.print("Bilangan jam sehari tidak boleh melebihi 9 jam, sila masukkan bilangan jam yang betul:");
        }
         
        System.out.print("masukkan bilangan hari bekerja:");
        int hari=input.nextInt();
        if(hari >30)
        {
            System.out.print("Bilangan hari bekerja tidak boleh melebihi 30 hari, sila masukkan bilangan hari yang betul:");
        }
        
        System.out.print("Masukkan jam lebih bekerja:");
        int harii=input.nextInt();
        if(harii >50)
        {
            System.out.print("Bilangan jam kerja lebih masa tidak boleh melebihi 50 jam, sila masukkan bilangan jam yang betul:");
        }
        double jumlah = (jam * hari) + (harii * 15);
        System.out.println("Rumusan gaji bulanan:"+nama);
        System.out.println("Jumlah jam bekerja:"+jam+"jam");
        System.out.println("Jumlah hari bekerja:"+hari+"hari");
        System.out.println("Jumlah jam lebih masa:"+harii+"jam");
        System.out.println("JUMLAH GAJI: RM"+jumlah);
    }
}