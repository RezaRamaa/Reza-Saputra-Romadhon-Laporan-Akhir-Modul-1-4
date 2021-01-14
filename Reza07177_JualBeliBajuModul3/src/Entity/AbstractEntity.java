package Entity;

public abstract class AbstractEntity {
    public String nama,password;

    public AbstractEntity(String nama, String password) {
        this.nama = nama;
        this.password = password;
    }
    public AbstractEntity (){
    }

    public abstract String getNama();

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
