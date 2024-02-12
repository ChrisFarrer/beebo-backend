package com.beebo.beebo_backend.UserServices;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import static com.beebo.beebo_backend.IDProducer.getID;
import com.beebo.beebo_backend.JournalServices.Journal;

@Document
class User {
  @Id
  private String uID;
  private String firstName;
  private String lastName;
  private String userName;
  private String email;
  private String password;
  private LocalDateTime createdAt;
  private boolean verified = false;
  private String verificationToken;
  private String profileImg;

  public User(String email, String firstName, String lastName, String password, boolean verified, String verificationToken, String profileImg) {
    this.uID = getID();
    this.email = email;
    this.firstName = firstName;
    this.lastName = lastName;
    this.password = password;
    this.createdAt = LocalDateTime.now();
    this.verified = verified;
    this.verificationToken = verificationToken;
    this.profileImg = profileImg;
  }

  public String getuID() {
    return uID;
  }

  public void setuID(String uID) {
    this.uID = uID;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public LocalDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(LocalDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public boolean isVerified() {
    return verified;
  }

  public void setVerified(boolean verified) {
    this.verified = verified;
  }

  public String getVerificationToken() {
    return verificationToken;
  }

  public void setVerificationToken(String verificationToken) {
    this.verificationToken = verificationToken;
  }

  public String getProfileImg() {
    return profileImg;
  }

  public void setProfileImg(String profileImg) {
    this.profileImg = profileImg;
  }
  public String getFirstName() { return firstName; }
  public void setFirstName(String firstName) {this.firstName = firstName;}

}