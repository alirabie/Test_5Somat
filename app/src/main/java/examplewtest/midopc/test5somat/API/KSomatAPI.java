package examplewtest.midopc.test5somat.API;

import java.util.List;

import examplewtest.midopc.test5somat.API.Model.Shop;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by Mido PC on 4/20/2016.
 */
public interface KSomatAPI {

    @GET("api/{id}")
    Call<List<Shop>> getShops(@Path("id")String id);







}
