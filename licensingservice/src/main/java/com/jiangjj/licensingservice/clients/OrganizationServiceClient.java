package com.jiangjj.licensingservice.clients;

import com.jiangjj.licensingservice.models.Organization;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("organizationservice")
public interface OrganizationServiceClient {
    @Cacheable(value = "organizations", cacheManager = "protostuffCacheManager")
    @RequestMapping(method = RequestMethod.GET, value = "/v1/organizations/{organizationId}", consumes = "application/x-protobuf")
    Organization getOrganizationProtobuf(@PathVariable("organizationId") Long organizationId);

}
