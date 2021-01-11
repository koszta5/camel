
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.box;

import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link org.apache.camel.component.box.api.BoxUsersManager}.
 */
@ApiParams(apiName = "users", producerOnly = true,
           description = "Provides operations to manage Box users",
           apiMethods = {@ApiMethod(methodName = "addUserEmailAlias", description="Add a new email alias to user's account", signatures={"com.box.sdk.EmailAlias addUserEmailAlias(String userId, String email)"}), @ApiMethod(methodName = "createAppUser", description="Provision a new app user in an enterprise with additional user information using Box Developer Edition", signatures={"com.box.sdk.BoxUser createAppUser(String name, com.box.sdk.CreateUserParams params)"}), @ApiMethod(methodName = "createEnterpriseUser", description="Provision a new user in an enterprise with additional user information", signatures={"com.box.sdk.BoxUser createEnterpriseUser(String login, String name, com.box.sdk.CreateUserParams params)"}), @ApiMethod(methodName = "deleteUser", description="Delete user from an enterprise account", signatures={"void deleteUser(String userId, boolean notifyUser, boolean force)"}), @ApiMethod(methodName = "deleteUserEmailAlias", description="Delete an email alias from user's account", signatures={"void deleteUserEmailAlias(String userId, String emailAliasId)"}), @ApiMethod(methodName = "getAllEnterpriseOrExternalUsers", description="Get any managed users that match the filter term as well as any external users that match the filter term", signatures={"java.util.List<com.box.sdk.BoxUser$Info> getAllEnterpriseOrExternalUsers(String filterTerm, String[] fields)"}), @ApiMethod(methodName = "getCurrentUser", description="Get current user", signatures={"com.box.sdk.BoxUser getCurrentUser()"}), @ApiMethod(methodName = "getUserEmailAlias", description="Get a collection of all the email aliases for user", signatures={"java.util.Collection<com.box.sdk.EmailAlias> getUserEmailAlias(String userId)"}), @ApiMethod(methodName = "getUserInfo", description="Get user information", signatures={"com.box.sdk.BoxUser$Info getUserInfo(String userId)"}), @ApiMethod(methodName = "moveFolderToUser", description="Move root folder for specified user to current user", signatures={"com.box.sdk.BoxFolder$Info moveFolderToUser(String userId, String sourceUserId)"}), @ApiMethod(methodName = "updateUserInfo", description="Update user information", signatures={"com.box.sdk.BoxUser updateUserInfo(String userId, com.box.sdk.BoxUser$Info info)"})}, aliases = {"getCurrentUser=currentUser", "getAllEnterpriseOrExternalUsers=users", "createAppUser=create", "createEnterpriseUser=create", "deleteUser=delete", "addUserEmailAlias=addEmailAlias", "getUserEmailAlias=emailAlias", "deleteUserEmailAlias=deleteEmailAlias", "getUserInfo=info", "updateUserInfo=updateInfo"})
@UriParams
@Configurer(extended = true)
public final class BoxUsersManagerEndpointConfiguration extends BoxConfiguration {
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "addUserEmailAlias", description="The email address to add as an alias")})
    private String email;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "deleteUserEmailAlias", description="The id of the email alias to delete")})
    private String emailAliasId;
    @UriParam
    @ApiParam(optional = true, apiMethods = {@ApiMethod(methodName = "getAllEnterpriseOrExternalUsers", description="The fields to retrieve. Leave this out for the standard fields.")})
    private String[] fields;
    @UriParam
    @ApiParam(optional = true, apiMethods = {@ApiMethod(methodName = "getAllEnterpriseOrExternalUsers", description="The filter term to lookup users by (login for external, login or name for managed); if null all managed users are returned.")})
    private String filterTerm;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "deleteUser", description="Whether or not this user should be deleted even if they still own files")})
    private Boolean force;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "updateUserInfo", description="The updated information")})
    private com.box.sdk.BoxUser.Info info;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "createEnterpriseUser", description="The email address the user will use to login")})
    private String login;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "createAppUser", description="The name of the user"), @ApiMethod(methodName = "createEnterpriseUser", description="The name of the user")})
    private String name;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "deleteUser", description="Whether or not to send an email notification to the user that their account has been deleted")})
    private Boolean notifyUser;
    @UriParam
    @ApiParam(optional = true, apiMethods = {@ApiMethod(methodName = "createAppUser", description="Additional user information"), @ApiMethod(methodName = "createEnterpriseUser", description="Additional user information")})
    private com.box.sdk.CreateUserParams params;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "moveFolderToUser", description="The user id of the user whose files will be the source for this operation")})
    private String sourceUserId;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "addUserEmailAlias", description="The id of user"), @ApiMethod(methodName = "deleteUser", description="The id of user to delete"), @ApiMethod(methodName = "deleteUserEmailAlias", description="The id of user"), @ApiMethod(methodName = "getUserEmailAlias", description="The id of user"), @ApiMethod(methodName = "getUserInfo", description="The id of user"), @ApiMethod(methodName = "moveFolderToUser", description="The id of user"), @ApiMethod(methodName = "updateUserInfo", description="The id of user to update")})
    private String userId;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmailAliasId() {
        return emailAliasId;
    }

    public void setEmailAliasId(String emailAliasId) {
        this.emailAliasId = emailAliasId;
    }

    public String[] getFields() {
        return fields;
    }

    public void setFields(String[] fields) {
        this.fields = fields;
    }

    public String getFilterTerm() {
        return filterTerm;
    }

    public void setFilterTerm(String filterTerm) {
        this.filterTerm = filterTerm;
    }

    public Boolean getForce() {
        return force;
    }

    public void setForce(Boolean force) {
        this.force = force;
    }

    public com.box.sdk.BoxUser.Info getInfo() {
        return info;
    }

    public void setInfo(com.box.sdk.BoxUser.Info info) {
        this.info = info;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getNotifyUser() {
        return notifyUser;
    }

    public void setNotifyUser(Boolean notifyUser) {
        this.notifyUser = notifyUser;
    }

    public com.box.sdk.CreateUserParams getParams() {
        return params;
    }

    public void setParams(com.box.sdk.CreateUserParams params) {
        this.params = params;
    }

    public String getSourceUserId() {
        return sourceUserId;
    }

    public void setSourceUserId(String sourceUserId) {
        this.sourceUserId = sourceUserId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
