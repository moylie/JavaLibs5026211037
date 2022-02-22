import javax.swing.*;
import java.awt.*;

public class JavaLibs5026211037 {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hai, iya kamu yang lagi ngeliatin layar box ini ^_^");

        String kabar = JOptionPane.showInputDialog("Kamu hari ini baik-baik aja kan? (hint: jawab iya atau tidak)");
        if (kabar.equalsIgnoreCase("iya")) {
            JOptionPane.showMessageDialog(null, "Wah kabar baik ya bagus deh kalau gitu, ngomong-ngomong kenalin namaku obi");
        } else {
            JOptionPane.showMessageDialog(null, "Jangan bersedih hati ya semoga hari esok akan selalu menyenangkan untukmu, " +"\n"+ "ngomong-ngomong kenalin namaku obi");
        }
        String realname = JOptionPane.showInputDialog("Kalau boleh tahu namamu siapa?");
        JOptionPane.showMessageDialog(null, "Halo " + realname + ", Salam Kenal ya!");


        String[] acceptablevalues = {"Komedi", "Horror", "Drama", "Aksi", "Romantis"};
        String genre = (String) JOptionPane.showInputDialog(null, "Kalau boleh tahu, genre film favoritmu apa nih?", "genre film", 2, null, acceptablevalues, acceptablevalues[1]);


        String films = JOptionPane.showInputDialog("Oh iya kalau boleh tahu " + realname + " udah nonton berapa banyak judul film?");
        int totalfilms = Integer.parseInt(films);
        if (totalfilms > 25) {
            JOptionPane.showMessageDialog(null, "Wah lebih banyak dari aku ya, udah bisa dibilang sesepuh nih hehe.");
        } else if (totalfilms <= 25) {
            JOptionPane.showMessageDialog(null, "Eh beneran cuma " + totalfilms + " aja? Eh tapi gpp si kan tiap orang punya waktu luang yang beda beda hehe. ");
        }
        String totaltime = JOptionPane.showInputDialog("Btw, dalam sehari ada berapa jam sih? (hint: 24)");
        double durations1 = Double.parseDouble(totaltime);


        String sleeptime = JOptionPane.showInputDialog("Kalau boleh tahu kamu biasanya tidur berapa jam?");
        double durations2 = Double.parseDouble(sleeptime);

        String judulfilm = JOptionPane.showInputDialog("Aku yakin kamu ada film favorit yang bikin kamu jadi pengen nonton berulang kali, " +"\n"+ "bisa dong kamu ketikin judul filmnya");
        JOptionPane.showMessageDialog(null, "Oh jadi kamu sudah nonton " + judulfilm + ", ya hehe");

        JOptionPane.showMessageDialog(null, "By the way, aku ada fun fact nih kalau film dari marvel dengan durasi terlama itu Avengers Endgame dan Avengers Infinity War." +"\n"+ "Nah masing-masing film di atas berdurasi 3.01 jam dan 2.29 jam");
        String funfact = JOptionPane.showInputDialog("Nah aku minta tolong dong kalau ditotal durasi film keduanya jadi berapa? (hint: 3.01 + 2.29)");
        double duration = Double.parseDouble(funfact);
        if (duration == 3.3) {
            JOptionPane.showMessageDialog(null, "Nah bagus jawaban kamu benar");
        } else {
            JOptionPane.showMessageDialog(null, "Yah jawabannya masih kurang tepat hehe, tapi gapapa mungkin kamu kurang minum air hehe jadi engga fokus ngitungnya");

            JOptionPane.showMessageDialog(null, "Hayoo lanjut pertanyaan selanjutnya :D");
            }
            String charaname = JOptionPane.showInputDialog("Oh iya ngomong-ngomong dari film " +judulfilm+ " Siapa sih pemain yang paling kamu sukai?");
            JOptionPane.showMessageDialog(null, "Oh si " + charaname + ", kayanya aku harus liat di google deh");

            String location = JOptionPane.showInputDialog("Kalau semisalmya kamu dikasih kesempatan buat ketemu " +charaname+ ", kamu pengen ketemu dia di mana?");
            JOptionPane.showMessageDialog(null, "Wah di " +location+ " bagus juga tuh, aku yakin " +charaname+ " pasti juga suka lokasinya");

            String activity = JOptionPane.showInputDialog("Kalau udah ketemu " +charaname+ ", kamu pengen ngapain sama dia?");
            JOptionPane.showMessageDialog(null,"Wih mau ngajak " +activity+ " nih hehe");

            String food = JOptionPane.showInputDialog("Tapi kalau semisalnya, " +charaname+ " malah ngajak kamu dinner, kamu pengen makan apa?");
            JOptionPane.showMessageDialog(null,"Enak juga tuh makan " +food+ "  lagi ditemenin sama " +charaname+ " hehe");

            String gift = JOptionPane.showInputDialog("Oh iya kamu pengen ngasih hadiah apa ke " +charaname+ "? karena kan bisa jadi itu kesempatan satu-satunya buat ketemu dia.");
            JOptionPane.showMessageDialog(null, "Wah mau ngasih" +gift+ " ya bagus tuh pasti " +charaname+ " bakal suka");

            String last = JOptionPane.showInputDialog("Oke terima kasih ya " +realname+ " udah bersedia menjawab semua pertanyaanku. " +"\n"+ "Nah, jadi sebagai hadiahnya aku mau ngasih kamu rangkuman dari semua jawaban " +"\n"+ "yang udah kamu kasih jadi sebuah cerita yang menarik. Kamu bersedia buat bacanya? (hint: ketik iya atau tidak");
            if (kabar.equalsIgnoreCase("iya")) {
            JOptionPane.showMessageDialog(null, "Oke siap-siap buat dibaca ya, aku yakin kamu bakal suka");
            } else {
                JOptionPane.showMessageDialog(null, "Yah kok engga mau, tapi aku bakal tetep tunjukin hehe siap-siap dibaca ya!");
            }
            JOptionPane.showMessageDialog(null,"Jadi ada seorang teman baru Obi yang bernama " +realname+ " yang sudah menonton film sebanyak " +totalfilms+ " kali. Dia menghabiskan " +"\n"+ "waktunya untuk menonton film rata-rata " +durations2+ " jam. Film favorit si " +realname+ " itu berjudul " +judulfilm+ ". Pemain " +"\n"+ "favorit " +realname+ " dari film " +judulfilm+ " adalah " +charaname+ ". Suatu hari nanti, " +realname+ " akan bertemu dengan " +charaname+ " di " +location+ ". Mereka akan " +activity+ " dan " +"\n"+ "dinner dengan menu makan " +food+ ". Setelah dinner, " +realname+ " memberikan hadiah berupa " +gift+ " dan membuat " +charaname+ " menjadi senang dan mereka hidup " +"\n"+ "bersama layaknya film dengan genre " +genre+ " dan cerita pun tamat");
    }
    }

