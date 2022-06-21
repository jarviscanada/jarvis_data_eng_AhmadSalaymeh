package ca.jrvs.apps.twitter.example;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.util.EntityUtils;

import ca.jrvs.apps.twitter.DAO.HttpHelper;
import ca.jrvs.apps.twitter.DAO.TwitterDao;
import ca.jrvs.apps.twitter.DAO.TwitterHttpHelper;
import ca.jrvs.apps.twitter.model.Coordinates;
import ca.jrvs.apps.twitter.model.Tweet;


public class sandbox {
    public static void main(String[] args) throws URISyntaxException, ParseException, IOException {
        float lat = 1;
        float lon = -1;
        Coordinates coordinates = new Coordinates();
        coordinates.setCoordinates(new Float[]{lat,lon});
        Tweet entity = new Tweet("testing dao");
        HttpHelper httpHelper = new TwitterHttpHelper("zBnSoHqcFTaXTywOt1H9aJrQf", "Eg5nN5hClc9297Nw9zgf5vaYndB2bE24iMrKzUsaXjMoTTOsAY", "1511094511514042371-rCpltv6AAyeE18Oy765jAaOkaZKoRS", "j5moaV7a63tKD1LDEuOlAInUQ9EIurnvSn2Q9X7cuCYEu");
        TwitterDao dao = new TwitterDao(httpHelper);
        System.out.println(dao.create(entity).toString());



        


    }
}
