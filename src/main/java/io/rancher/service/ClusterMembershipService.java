package io.rancher.service;

import io.rancher.base.Filters;
import io.rancher.base.TypeCollection;
import io.rancher.type.ClusterMembership;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

public interface ClusterMembershipService {

  @GET("clusterMembership")
  Call<TypeCollection<ClusterMembership>> list();

  @GET("clusterMembership")
  Call<TypeCollection<ClusterMembership>> list(@QueryMap Filters filters);

  @GET("clusterMembership/{id}")
  Call<ClusterMembership> get(@Path("id") String id);

  @POST("clusterMembership")
  Call<ClusterMembership> create(@Body ClusterMembership clusterMembership);

  @PUT("clusterMembership/{id}")
  Call<ClusterMembership> update(@Path("id") String id, @Body ClusterMembership clusterMembership);

  @DELETE("clusterMembership/{id}")
  Call<Response> delete(@Path("id") String id);
  
}
