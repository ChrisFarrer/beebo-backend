package com.beebo.beebo_backend.JournalServices;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import static com.beebo.beebo_backend.IDProducer.getID;

import java.time.LocalDateTime;

@Document
public class Journal {
  @Id
  private String jID;
  private String uID;
  private String journalStyle;
  private LocalDateTime createdAt;

  // Constructor
  public Journal(String uID, String journalStyle, LocalDateTime createdAt) {
    this.jID = getID();
    this.uID = uID;
    this.journalStyle = journalStyle;
    this.createdAt = createdAt;
  }

  // Getter methods
  public String getjID() {
    return jID;
  }

  public String getuID() {
    return uID;
  }

  public String getJournalStyle() {
    return journalStyle;
  }

  public LocalDateTime getCreatedAt() {
    return createdAt;
  }

  // Setter methods
  public void setjID(String jID) {
    this.jID = jID;
  }

  public void setuID(String uID) {
    this.uID = uID;
  }

  public void setJournalStyle(String journalStyle) {
    this.journalStyle = journalStyle;
  }

  public void setCreatedAt(LocalDateTime createdAt) {
    this.createdAt = createdAt;
  }

  // To-String Method
  @Override
  public String toString() {
    return "Journal{" +
            "jID='" + jID + '\'' +
            ", uID='" + uID + '\'' +
            ", journalStyle='" + journalStyle + '\'' +
            ", createdAt=" + createdAt +
            '}';
  }


  //  public static String getJournal(String jID, String uID) {
//    // Testing mongodb connection -Chris
//    //check if the database has this jID uID pairing.
//    //if not, create new database entry with empty fields
//    //and return that class
//    //otherwise pull data and return it in object.
//    return null;
//  }
}
