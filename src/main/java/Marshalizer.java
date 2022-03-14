import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class Marshalizer {


    public Marshalizer() {

    }

    public void Marshalizing(Gamer zaidejas) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Gamer.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        jaxbMarshaller.marshal(zaidejas, new File("Zaidejas.xml"));
        jaxbMarshaller.marshal(zaidejas, System.out);
    }

}
