//package com.messenger4j.boot;
//
//import com.fasterxml.jackson.annotation.JsonProperty;
//
//import javax.persistence.*;
//
//@Entity
//public class Answer {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @JsonProperty("id")
//    private long id;
//
//    @JsonProperty("question")
//    private String question;
//
//    @JsonProperty("title")
//    private String returnTitle;
//
//    @JsonProperty("email")
//    private String email;
//
//    public long getId() {
//        return id;
//    }
//
//    public String getQuestion() {
//        return question;
//    }
//
//    public String getReturnTitle() {
//        return returnTitle;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public void setQuestion(String question) {
//        this.question = question;
//    }
//
//    public void setReturnTitle(String returnTitle) {
//        this.returnTitle = returnTitle;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//}