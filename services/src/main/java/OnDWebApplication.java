import com.ond.web.controllers.DealOfTheDayController;
import com.ond.web.controllers.OnDWebHomeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by vdraj on 7/17/2016.
 */
@SpringBootApplication
public class OnDWebApplication {



    public static void main(String[] args) {
        Object[] sources = new Object[]{OnDWebHomeController.class,
                                        DealOfTheDayController.class};
        SpringApplication.run(sources, args);
    }
}

