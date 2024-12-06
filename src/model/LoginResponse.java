package model;

import com.squareup.moshi.Json;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author antaemin
 * 로그인 응답 데이터 저장 위한 클래스 파일(모델)
 */
public class LoginResponse {
    @Json(name = "id")
    private int id;
    
    @Json(name = "name")
    private String name;
    
    @Json(name = "number")
    private String number;
    
    @Json(name = "access_token") //JSON 키과 변수명이 다를 경우 매핑한다.
    private String accessToken;
    
    // Getter 메서드 (Moshi는 기본적으로 Getter를 사용하지 않아도 된다.)
    public int getId() { return id; }
    public String getName() { return name; }
    public String getNumber() { return number; }
    public String getAccessToken() { return accessToken; }
    
    // Optional: toString() 메서드 (응답 디버깅용)
    @Override
    public String toString() {
        return "LoginResponse{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", accessToken='" + accessToken + '\'' +
                '}';
    }
}
