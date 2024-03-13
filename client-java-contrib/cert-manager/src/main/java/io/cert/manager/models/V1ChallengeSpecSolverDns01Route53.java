/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.21.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.cert.manager.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.cert.manager.models.V1ChallengeSpecSolverDns01Route53AccessKeyIDSecretRef;
import io.cert.manager.models.V1ChallengeSpecSolverDns01Route53SecretAccessKeySecretRef;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * Use the AWS Route53 API to manage DNS01 challenge records.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-01T07:00:20.132973Z[Etc/UTC]")
public class V1ChallengeSpecSolverDns01Route53 {
  public static final String SERIALIZED_NAME_ACCESS_KEY_I_D = "accessKeyID";
  @SerializedName(SERIALIZED_NAME_ACCESS_KEY_I_D)
  private String accessKeyID;

  public static final String SERIALIZED_NAME_ACCESS_KEY_I_D_SECRET_REF = "accessKeyIDSecretRef";
  @SerializedName(SERIALIZED_NAME_ACCESS_KEY_I_D_SECRET_REF)
  private V1ChallengeSpecSolverDns01Route53AccessKeyIDSecretRef accessKeyIDSecretRef;

  public static final String SERIALIZED_NAME_HOSTED_ZONE_I_D = "hostedZoneID";
  @SerializedName(SERIALIZED_NAME_HOSTED_ZONE_I_D)
  private String hostedZoneID;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_ROLE = "role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private String role;

  public static final String SERIALIZED_NAME_SECRET_ACCESS_KEY_SECRET_REF = "secretAccessKeySecretRef";
  @SerializedName(SERIALIZED_NAME_SECRET_ACCESS_KEY_SECRET_REF)
  private V1ChallengeSpecSolverDns01Route53SecretAccessKeySecretRef secretAccessKeySecretRef;

  public V1ChallengeSpecSolverDns01Route53() {
  }

  public V1ChallengeSpecSolverDns01Route53 accessKeyID(String accessKeyID) {
    
    this.accessKeyID = accessKeyID;
    return this;
  }

   /**
   * The AccessKeyID is used for authentication. Cannot be set when SecretAccessKeyID is set. If neither the Access Key nor Key ID are set, we fall-back to using env vars, shared credentials file or AWS Instance metadata, see: https://docs.aws.amazon.com/sdk-for-go/v1/developer-guide/configuring-sdk.html#specifying-credentials
   * @return accessKeyID
  **/
  @jakarta.annotation.Nullable
  public String getAccessKeyID() {
    return accessKeyID;
  }


  public void setAccessKeyID(String accessKeyID) {
    this.accessKeyID = accessKeyID;
  }


  public V1ChallengeSpecSolverDns01Route53 accessKeyIDSecretRef(V1ChallengeSpecSolverDns01Route53AccessKeyIDSecretRef accessKeyIDSecretRef) {
    
    this.accessKeyIDSecretRef = accessKeyIDSecretRef;
    return this;
  }

   /**
   * Get accessKeyIDSecretRef
   * @return accessKeyIDSecretRef
  **/
  @jakarta.annotation.Nullable
  public V1ChallengeSpecSolverDns01Route53AccessKeyIDSecretRef getAccessKeyIDSecretRef() {
    return accessKeyIDSecretRef;
  }


  public void setAccessKeyIDSecretRef(V1ChallengeSpecSolverDns01Route53AccessKeyIDSecretRef accessKeyIDSecretRef) {
    this.accessKeyIDSecretRef = accessKeyIDSecretRef;
  }


  public V1ChallengeSpecSolverDns01Route53 hostedZoneID(String hostedZoneID) {
    
    this.hostedZoneID = hostedZoneID;
    return this;
  }

   /**
   * If set, the provider will manage only this zone in Route53 and will not do an lookup using the route53:ListHostedZonesByName api call.
   * @return hostedZoneID
  **/
  @jakarta.annotation.Nullable
  public String getHostedZoneID() {
    return hostedZoneID;
  }


  public void setHostedZoneID(String hostedZoneID) {
    this.hostedZoneID = hostedZoneID;
  }


  public V1ChallengeSpecSolverDns01Route53 region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * Always set the region when using AccessKeyID and SecretAccessKey
   * @return region
  **/
  @jakarta.annotation.Nonnull
  public String getRegion() {
    return region;
  }


  public void setRegion(String region) {
    this.region = region;
  }


  public V1ChallengeSpecSolverDns01Route53 role(String role) {
    
    this.role = role;
    return this;
  }

   /**
   * Role is a Role ARN which the Route53 provider will assume using either the explicit credentials AccessKeyID/SecretAccessKey or the inferred credentials from environment variables, shared credentials file or AWS Instance metadata
   * @return role
  **/
  @jakarta.annotation.Nullable
  public String getRole() {
    return role;
  }


  public void setRole(String role) {
    this.role = role;
  }


  public V1ChallengeSpecSolverDns01Route53 secretAccessKeySecretRef(V1ChallengeSpecSolverDns01Route53SecretAccessKeySecretRef secretAccessKeySecretRef) {
    
    this.secretAccessKeySecretRef = secretAccessKeySecretRef;
    return this;
  }

   /**
   * Get secretAccessKeySecretRef
   * @return secretAccessKeySecretRef
  **/
  @jakarta.annotation.Nullable
  public V1ChallengeSpecSolverDns01Route53SecretAccessKeySecretRef getSecretAccessKeySecretRef() {
    return secretAccessKeySecretRef;
  }


  public void setSecretAccessKeySecretRef(V1ChallengeSpecSolverDns01Route53SecretAccessKeySecretRef secretAccessKeySecretRef) {
    this.secretAccessKeySecretRef = secretAccessKeySecretRef;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ChallengeSpecSolverDns01Route53 v1ChallengeSpecSolverDns01Route53 = (V1ChallengeSpecSolverDns01Route53) o;
    return Objects.equals(this.accessKeyID, v1ChallengeSpecSolverDns01Route53.accessKeyID) &&
        Objects.equals(this.accessKeyIDSecretRef, v1ChallengeSpecSolverDns01Route53.accessKeyIDSecretRef) &&
        Objects.equals(this.hostedZoneID, v1ChallengeSpecSolverDns01Route53.hostedZoneID) &&
        Objects.equals(this.region, v1ChallengeSpecSolverDns01Route53.region) &&
        Objects.equals(this.role, v1ChallengeSpecSolverDns01Route53.role) &&
        Objects.equals(this.secretAccessKeySecretRef, v1ChallengeSpecSolverDns01Route53.secretAccessKeySecretRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKeyID, accessKeyIDSecretRef, hostedZoneID, region, role, secretAccessKeySecretRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ChallengeSpecSolverDns01Route53 {\n");
    sb.append("    accessKeyID: ").append(toIndentedString(accessKeyID)).append("\n");
    sb.append("    accessKeyIDSecretRef: ").append(toIndentedString(accessKeyIDSecretRef)).append("\n");
    sb.append("    hostedZoneID: ").append(toIndentedString(hostedZoneID)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    secretAccessKeySecretRef: ").append(toIndentedString(secretAccessKeySecretRef)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("accessKeyID");
    openapiFields.add("accessKeyIDSecretRef");
    openapiFields.add("hostedZoneID");
    openapiFields.add("region");
    openapiFields.add("role");
    openapiFields.add("secretAccessKeySecretRef");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("region");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1ChallengeSpecSolverDns01Route53
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1ChallengeSpecSolverDns01Route53.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1ChallengeSpecSolverDns01Route53 is not found in the empty JSON string", V1ChallengeSpecSolverDns01Route53.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1ChallengeSpecSolverDns01Route53.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1ChallengeSpecSolverDns01Route53` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : V1ChallengeSpecSolverDns01Route53.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("accessKeyID") != null && !jsonObj.get("accessKeyID").isJsonNull()) && !jsonObj.get("accessKeyID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accessKeyID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accessKeyID").toString()));
      }
      // validate the optional field `accessKeyIDSecretRef`
      if (jsonObj.get("accessKeyIDSecretRef") != null && !jsonObj.get("accessKeyIDSecretRef").isJsonNull()) {
        V1ChallengeSpecSolverDns01Route53AccessKeyIDSecretRef.validateJsonObject(jsonObj.getAsJsonObject("accessKeyIDSecretRef"));
      }
      if ((jsonObj.get("hostedZoneID") != null && !jsonObj.get("hostedZoneID").isJsonNull()) && !jsonObj.get("hostedZoneID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hostedZoneID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hostedZoneID").toString()));
      }
      if (!jsonObj.get("region").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `region` to be a primitive type in the JSON string but got `%s`", jsonObj.get("region").toString()));
      }
      if ((jsonObj.get("role") != null && !jsonObj.get("role").isJsonNull()) && !jsonObj.get("role").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `role` to be a primitive type in the JSON string but got `%s`", jsonObj.get("role").toString()));
      }
      // validate the optional field `secretAccessKeySecretRef`
      if (jsonObj.get("secretAccessKeySecretRef") != null && !jsonObj.get("secretAccessKeySecretRef").isJsonNull()) {
        V1ChallengeSpecSolverDns01Route53SecretAccessKeySecretRef.validateJsonObject(jsonObj.getAsJsonObject("secretAccessKeySecretRef"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1ChallengeSpecSolverDns01Route53.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1ChallengeSpecSolverDns01Route53' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1ChallengeSpecSolverDns01Route53> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1ChallengeSpecSolverDns01Route53.class));

       return (TypeAdapter<T>) new TypeAdapter<V1ChallengeSpecSolverDns01Route53>() {
           @Override
           public void write(JsonWriter out, V1ChallengeSpecSolverDns01Route53 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1ChallengeSpecSolverDns01Route53 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1ChallengeSpecSolverDns01Route53 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1ChallengeSpecSolverDns01Route53
  * @throws IOException if the JSON string is invalid with respect to V1ChallengeSpecSolverDns01Route53
  */
  public static V1ChallengeSpecSolverDns01Route53 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1ChallengeSpecSolverDns01Route53.class);
  }

 /**
  * Convert an instance of V1ChallengeSpecSolverDns01Route53 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
