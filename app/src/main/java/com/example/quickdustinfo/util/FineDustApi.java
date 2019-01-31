package com.example.quickdustinfo.util;

import com.example.quickdustinfo.model.FineDust;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface FineDustApi {
    String BASE_URL = "http://openapi.airkorea.or.kr/openapi/services/rest/";

    @GET("ArpltnInforInqireSvc/getCtprvnRltmMesureDnsty?ver=1.3&serviceKey=zupZIBVnDaPpaZwdu4L1nsLE0wRrZQzLpzMbWJj467%2B2OF5LPHl0tdBpbH0HzNhAfVO3ibOb1piERzE58U6kXw%3D%3D")
    Call<FineDust> getFineDust(@Query("sidoName") String sidoName,
                               @Query("_returnType") String returnType);
}
