package com.atguigu.pojo;

public class Bangumi {
    private int id;
    private String name;
    private int type;
    private int time;
    private int status;
    private int year;
    private String picture;
    private int userId;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }
    public String getTypeStr(){
        switch (type) {
            case 1: {
                return "番剧";
            }
            case 2: {
                return "剧场版";
            }
            case 3: {
                return "ova";
            }
            case 4: {
                return "长篇";
            }
            default: {
                return "未知";
            }
        }
    }
    public void setType(int type) {
        this.type = type;
    }

    public int getTime() {
        return time;
    }
    public String getTimeStr(){
        switch (time) {
            case 1: {
                return "1月番";
            }
            case 4: {
                return "4月番";
            }
            case 7: {
                return "7月番";
            }
            case 10: {
                return "10月番";
            }
            default: {
                return "未知";
            }
        }
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getStatus() {
        return status;
    }
    public String getStatusStr(){
        switch (status) {
            case 1: {
                return "看完";
            }
            case 2: {
                return "没看";
            }
            case 3: {
                return "待定";
            }
            default: {
                return "未知";
            }
        }
    }
    public void setStatus(int status) {
        this.status = status;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Bangumi() {
    }


    @Override
    public String toString() {
        return "Bangumi{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", time=" + time +
                ", status=" + status +
                ", year=" + year +
                ", picture='" + picture + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }

    public Bangumi(int id, String name, int type, int time, int status, int year, String picture, int userId) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.time = time;
        this.status = status;
        this.year = year;
        this.picture = picture;
        this.userId = userId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
