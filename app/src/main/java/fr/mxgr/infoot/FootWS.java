package fr.mxgr.infoot;

import java.util.List;

import retrofit2.Callback;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface FootWS {

    String ENDPOINT = "http://api.football-data.org/v2";

    @GET("/competitions")
    List<Competition> listAllCompet();

    @GET("/competitions")
    List<Competition> listCompetArea(@Query("areas") String area);

    @GET("/competitions/{id}")
    List<Competition> listCompetId(@Path("id") int id);

}
