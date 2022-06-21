package ca.jrvs.apps.twitter.example;
import com.google.gdata.util.common.base.PercentEscaper;
import java.util.Arrays;
import oauth.signpost.OAuthConsumer;
import oauth.signpost.commonshttp.CommonsHttpOAuthConsumer;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;


public class TwitterApiExample {
  // private static String CONSUMER_KEY = System.getenv("consumerKey");
  // private static String CONSUMER_SECRET = System.getenv("consumerSecret");
  // private static String ACCESS_TOKEN = System.getenv("accessToken");
  // private static String TOKEN_SECRET = System.getenv("tokenSecret");
  
 
  public static void main (String[] args) throws Exception {

    OAuthConsumer consumer = new CommonsHttpOAuthConsumer("n0UhPMm01m1V92wNFUo1H0NtK", "Uexbsan5e8MpLuLY6W1w2CjTXDD6FGCVCvIng7yUATRqsUllBF");
    consumer.setTokenWithSecret("1511094511514042371-y4oCBvJPHNkE3uuF8ArXZ6iviQs3j0", "wG8RweBySsJehR1QUEIKscpTvSdGfq8qELBj5ngRih9JM");
    
    String status = "today is a good day";
    PercentEscaper percentEscaper = new PercentEscaper("", false);
    HttpPost request = new HttpPost("https://api.twitter.com/1.1/statuses/update.json?status="+ percentEscaper.escape(status));

    consumer.sign(request);
    System.out.println("http request header");
    Arrays.stream(request.getAllHeaders()).forEach(System.out::println);

    HttpClient httpClient = HttpClientBuilder.create().build();
    HttpResponse response = httpClient.execute(request);
    System.out.println(EntityUtils.toString(response.getEntity()));
    
    
  }
}

