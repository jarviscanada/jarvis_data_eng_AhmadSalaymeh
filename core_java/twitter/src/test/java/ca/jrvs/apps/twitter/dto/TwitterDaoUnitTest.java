package ca.jrvs.apps.twitter.dto;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.ArgumentMatchers.isNotNull;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.runners.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;

import ca.jrvs.apps.twitter.DAO.HttpHelper;
import ca.jrvs.apps.twitter.DAO.TwitterDao;
import ca.jrvs.apps.twitter.DAO.TwitterHttpHelper;
import ca.jrvs.apps.twitter.model.Coordinates;
import ca.jrvs.apps.twitter.model.Tweet;


public class TwitterDaoUnitTest {
    


    

    @Test
    public void showTweet() throws Exception{
        float lat = 1;
        float lon = -1;
        Coordinates coordinates = new Coordinates();
        coordinates.setCoordinates(new Float[]{lat,lon});
        Tweet entity = new Tweet("testing2 dao");
        HttpHelper httpHelper = new TwitterHttpHelper("zBnSoHqcFTaXTywOt1H9aJrQf", "Eg5nN5hClc9297Nw9zgf5vaYndB2bE24iMrKzUsaXjMoTTOsAY", "1511094511514042371-rCpltv6AAyeE18Oy765jAaOkaZKoRS", "j5moaV7a63tKD1LDEuOlAInUQ9EIurnvSn2Q9X7cuCYEu");
        TwitterDao dao = new TwitterDao(httpHelper);
        dao.create(entity);
        



    }
}
