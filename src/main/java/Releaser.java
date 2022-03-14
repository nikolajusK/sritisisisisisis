import java.util.ArrayList;
import java.util.List;

public class Releaser {
    protected String Name;
    protected String CreationDate;
    protected String City;
    protected String Country;
    protected int WorkersNumber;
    protected int GamesReleased;

    List<Zaidimas> Zaidimai = new ArrayList<Zaidimas>();

    public List<Zaidimas> getZaidimai() {
        return Zaidimai;
    }

    public void setZaidimai(List<Zaidimas> zaidimai) {
        Zaidimai = zaidimai;
    }

    public int getGamesReleased() {
        return GamesReleased;
    }

    public void setGamesReleased(int gamesReleased) {
        GamesReleased = gamesReleased;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setCreationDate(String creationDate) {
        CreationDate = creationDate;
    }

    public void setCity(String city) {
        City = city;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public Releaser(String name, String creationDate, String city, String country, int workersNumber, int gamesReleased) {
        Name = name;
        CreationDate = creationDate;
        City = city;
        Country = country;
        WorkersNumber = workersNumber;
        GamesReleased = gamesReleased;
    }



    public void setWorkersNumber(int workersNumber) {
        WorkersNumber = workersNumber;
    }

    public String getName() {
        return Name;
    }

    public String getCreationDate() {
        return CreationDate;
    }

    public String getCity() {
        return City;
    }

    public String getCountry() {
        return Country;
    }

    public int getWorkersNumber() {
        return WorkersNumber;
    }

    public String toString() {
        return
                String.format("Pavadinimas: \n\t %s \n Ikurimo data: \n\t %s \n Miestas: \n\t %s \n Salis: \n\t %s \n Zaidimu isleista: \n\t %d \n Darbutoju skaicius: \n\t %d ",
                        this.Name,this.CreationDate, this.City, this.Country, this.GamesReleased, this.WorkersNumber);

    }
}
