package isfaaghyth.app.cleanarch.network;

import java.util.List;

import io.reactivex.Observable;
import isfaaghyth.app.cleanarch.model.Portfolio;
import retrofit2.http.GET;

/**
 * Created by isfaaghyth on 1/9/18.
 * github: @isfaaghyth
 */

public interface Routes {

    @GET("portfolioo.php")
    Observable<List<Portfolio>> getHome();

}
