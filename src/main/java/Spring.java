import org.springframework.beans.factory.annotation.Autowired;
import service.PmService;

/**
 * Created by nangu on 2017/8/24.
 */
public class Spring {
    @Autowired
    private static PmService pmService;
    public static void main() {

        pmService.say("gwc");
    }
}
