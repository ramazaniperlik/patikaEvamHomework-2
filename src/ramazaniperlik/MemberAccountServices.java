package ramazaniperlik;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class MemberAccountServices {

    public void create(MemberAccount newMember){

        String filename = "C:\\Users\\ramaz\\Desktop\\memberList.txt";
        try {
            FileWriter fw = new FileWriter(filename,true);
            fw.write("\n"+newMember.getId() +"-"+newMember.getName()+"-"+newMember.getSurname()+"-"+newMember.getBalance()+"-"+newMember.getMemberCode()+"-"+newMember.getPhone());
            fw.close();
            System.out.println("Üye oluşturuldu.");
        } catch (IOException e) {
            System.out.println("Dosyaya yazma sırasında hata oluştu: "+e.getMessage());
        }

    }
    public void read(){
        System.out.println("Üye listelendi.");
    }
    public void update(){
        System.out.println("Üye güncellendi. ");
    }
    public void delete(){
        System.out.println("Üye silindi.");
    }
}