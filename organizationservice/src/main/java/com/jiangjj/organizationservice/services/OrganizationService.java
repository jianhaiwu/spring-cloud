package com.jiangjj.organizationservice.services;

import com.jiangjj.organizationservice.models.Organization;

import java.util.Optional;

public interface OrganizationService {
    Optional<Organization> getOrganizations(Long organizationId);
    void saveOrganizations(Organization organization);
    void updateOrganizations(Organization organization);
    void deleteOrganizations(Organization organization);
}

